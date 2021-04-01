package com.skymemo.artimo.controller.test;

import com.skymemo.common.response.IResponseData;
import com.skymemo.common.response.ResponseUtil;
import com.skymemo.common.util.ServerInfoUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/test")
public class TestController {

    @RequestMapping(value = "/testServer", method = RequestMethod.GET)
    public IResponseData testServer() {
        Map<String, Object> res = new HashMap<>();
        res.put("ip", ServerInfoUtil.getServerIp());
        res.put("port", ServerInfoUtil.getPort());
        res.put("ipWithRequest", ServerInfoUtil.getServerIpWithRequest());
        res.put("portWithRequest", ServerInfoUtil.getPortWithRequest());

        return ResponseUtil.success(res);
    }

}
