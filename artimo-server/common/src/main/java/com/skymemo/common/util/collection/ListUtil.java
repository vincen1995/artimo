package com.skymemo.common.util.collection;

import java.util.List;

/**
 * Description here.
 *
 * @since JDK*.*
 * @author vc
 * @date 2021/3/30 20:08
 */
public class ListUtil {

    /**
     * Returns the element at the specified position in this list.
     *
     * @param list
     * @param index
     * @param <T>
     * @return If the list is null, or is empty, then return null;
     * Otherwise, return the element at the specified position in this list.
     */
    public static <T> T get(List<T> list, int index) {
        if (list == null || list.size() == 0) {
            return null;
        }
        return list.get(index);
    }

}
