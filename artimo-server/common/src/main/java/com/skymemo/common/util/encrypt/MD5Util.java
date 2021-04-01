package com.skymemo.common.util.encrypt;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

/**
 * Description here.
 *
 * @since JDK*.*
 * @author vc
 * @date 2021/3/30 15:56
 */
public class MD5Util {

    private static final String[] HEX_DIGITS = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9",
            "a", "b", "c", "d", "e", "f"};

    /**
     * MD5 encrypt
     * @param origin Original string.
     * @param originCharset Original charset.
     * @return
     */
    public static String encrypt(String origin, Charset originCharset) {
        StringBuffer result = new StringBuffer();

        try {
            MessageDigest digest = MessageDigest.getInstance("MD5");
            byte[] bytes = null;
            if (originCharset == null) {
                bytes = digest.digest(origin.getBytes(StandardCharsets.UTF_8));
            } else {
                bytes = digest.digest(origin.getBytes(originCharset));
            }

            for (byte byteItem : bytes) {
                int n = (byteItem < 0) ? (byteItem + 256) : byteItem;
                int first = Math.floorDiv(n, 16);
                int second = n % 16;
                result.append(HEX_DIGITS[first]);
                result.append(HEX_DIGITS[second]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result.toString();
    }

    /**
     * MD5 encrypt
     * @param origin Original string.
     * @return
     */
    public static String encrypt(String origin) {
        StringBuffer result = new StringBuffer();

        try {
            MessageDigest digest = MessageDigest.getInstance("MD5");
            byte[] bytes = digest.digest(origin.getBytes(StandardCharsets.UTF_8));

            for (byte byteItem : bytes) {
                int n = (byteItem < 0) ? (byteItem + 256) : byteItem;
                int first = Math.floorDiv(n, 16);
                int second = n % 16;
                result.append(HEX_DIGITS[first]);
                result.append(HEX_DIGITS[second]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result.toString();
    }

}
