package com.skymemo.common.util;

import com.fasterxml.jackson.databind.JsonNode;
import org.apache.commons.lang.StringUtils;

/**
 * Description here.
 *
 * @see JsonNode
 *
 * @since JDK*.*
 * @author vc
 * @date 2021/3/31 15:34
 */
public class JsonNodeUtil {

    public static String getString(JsonNode jsonNode, String key) {
        if (jsonNode == null || StringUtils.isBlank(key)) {
            return null;
        }
        JsonNode valueNode = jsonNode.get(key);
        return (valueNode == null) ? (null) : (valueNode.asText());
    }

    public static String getString(JsonNode jsonNode, String key, String defaultValue) {
        if (jsonNode == null || StringUtils.isBlank(key)) {
            return defaultValue;
        }
        JsonNode valueNode = jsonNode.get(key);
        return (valueNode == null) ? (defaultValue) : (valueNode.asText());
    }

}
