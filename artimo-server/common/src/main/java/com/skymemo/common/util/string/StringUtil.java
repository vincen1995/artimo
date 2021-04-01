package com.skymemo.common.util.string;

/**
 * Description here.
 *
 * @since JDK*.*
 * @author vc
 * @date 2021/2/22 15:55
 */
public class StringUtil {

    /**
     * Returns the string representation of the {@code Object} argument.
     *
     * @param obj an {@code Object}.
     * @return If the argument is {@code null}, then return {@code null};
     * Otherwise, the value of {@code obj.toString()} is returned.
     */
    public static String valueOf(Object obj) {
        if (obj == null) {
            return null;
        }
        return obj.toString();
    }

    /**
     * Convert string {@code null} to {@code ""}.
     *
     * @param str
     * @return If the argument is {@code null}, then return blank string {@code ""};
     * Otherwise, return the original string.
     */
    public static String convertNull2Blank(String str) {
        return (str == null) ? "" : str;
    }

    /**
     * Convert string {@code null} to {@code ""}.
     *
     * @param str
     * @return If the argument is {@code null} or {@code "null"}, then return blank string {@code ""};
     * Otherwise, return the original string.
     */
    public static String convertNull2BlankTrimNull(String str) {
        if (str == null || "null".equals(str)) {
            str = "";
        }
        return str;
    }
}
