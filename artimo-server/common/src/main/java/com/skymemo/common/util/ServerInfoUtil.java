package com.skymemo.common.util;

import com.skymemo.common.exception.ErrorCode;
import com.skymemo.common.exception.ExceptionHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.management.MBeanServer;
import javax.management.ObjectName;
import javax.servlet.http.HttpServletRequest;
import java.lang.management.ManagementFactory;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;
import java.util.Set;

/**
 * 服务器工具类：获取服务器ip、端口号
 *
 * @since JDK*.*
 * @author vc
 * @date 2021/2/23 9:45
 */
public class ServerInfoUtil {

    private static final Logger LOGGER = LoggerFactory.getLogger(ServerInfoUtil.class);

    /**
     * 获取服务器ip
     * 1、出错时返回空字符串
     * @return
     */
    public static String getServerIp() {
        String ip = "";
        try {
            Enumeration<NetworkInterface> netInterfaces = NetworkInterface.getNetworkInterfaces();
            while(netInterfaces.hasMoreElements()) {
                NetworkInterface item = netInterfaces.nextElement();
                if (item.isLoopback() || item.isVirtual() || !item.isUp()) {
                    continue;
                }
                Enumeration<InetAddress> addresses = item.getInetAddresses();
                while (addresses.hasMoreElements()) {
                    InetAddress address = addresses.nextElement();
                    if (address instanceof Inet4Address) {
                        ip = address.getHostAddress();
                        break;
                    }
                }
            }
        } catch (Exception e) {
            LOGGER.error("ServerUtil.getServerIp -> 获取服务器ip出错", e);
        }
        return convertNull2Blank(ip);
    }

    /**
     * 获取服务器端口号
     * 1、出错时返回空字符串
     * @return
     */
    public static String getPort() {
        String port = "";
        try {
            MBeanServer server = ManagementFactory.getPlatformMBeanServer();
            if (server == null) {
                ExceptionHelper.throwException(ErrorCode.NOT_FOUND_RECORD, "-未获取到MBeanServer");
            }

            Set<ObjectName> names = server.queryNames(new ObjectName("*:type=Connector,*"), null);
            for (ObjectName name : names) {
                String protocol = String.valueOf(server.getAttribute(name, "protocol"));
                if ("org.apache.coyote.http11.Http11NioProtocol".equals(protocol) || "HTTP/1.1".equals(protocol)) {
                    port = String.valueOf(server.getAttribute(name, "port"));
                }
            }
        } catch (Exception e) {
            LOGGER.error("ServerUtil.getServerIp -> 获取服务器端口出错", e);
        }
        return convertNull2Blank(port);
    }

    /**
     * 通过request获取服务器ip
     * 1、出错时返回空字符串
     * @return
     */
    public static String getServerIpWithRequest() {
        String ip = "";
        try {
            ServletRequestAttributes requestAttributes = (ServletRequestAttributes)RequestContextHolder.getRequestAttributes();
            HttpServletRequest request = requestAttributes.getRequest();
            ip = request.getServerName();
        } catch (Exception e) {
            LOGGER.error("ServerUtil.getServerIp -> 获取服务器ip出错", e);
        }
        return convertNull2Blank(ip);
    }

    /**
     * 通过request获取端口
     * 1、出错时返回空字符串
     * @return
     */
    public static String getPortWithRequest() {
        String port = "";
        try {
            ServletRequestAttributes requestAttributes = (ServletRequestAttributes)RequestContextHolder.getRequestAttributes();
            HttpServletRequest request = requestAttributes.getRequest();
            port = String.valueOf(request.getServerPort());
        } catch (Exception e) {
            LOGGER.error("ServerUtil.getServerIp -> 获取服务器端口出错", e);
        }
        return convertNull2Blank(port);
    }

    /**
     * 将null转为空字符串
     */
    public static String convertNull2Blank(String str) {
        return (str == null) ? "" : str;
    }
}
