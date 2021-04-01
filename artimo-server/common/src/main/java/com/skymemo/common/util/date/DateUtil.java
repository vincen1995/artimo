package com.skymemo.common.util.date;

import java.time.Clock;
import java.time.LocalDateTime;
import java.time.ZoneId;

/**
 * DateUtil
 * @author vc
 * @since JDK1.8
 */
public class DateUtil {

    /**
     * Get current dateTime as utc-0
     *
     * @return
     */
    public static LocalDateTime getUTC0Current() {
        ZoneId utc0 = ZoneId.of("UTC+0");
        return LocalDateTime.now(utc0);
    }

    /**
     * Get current dateTime as utc-8
     * @return
     */
    public static LocalDateTime getUTC8Current() {
        ZoneId utc8 = ZoneId.of("UTC+8");
        return LocalDateTime.now(utc8);
    }

    /**
     * Transfer utc-0 time to utc-8
     * @param utc0 dateTime with utc-0
     * @return
     */
    public static LocalDateTime utc0ToUTC8(LocalDateTime utc0) {
        return utc0.plusHours(8L);
    }

    /**
     * Transfer utc-8 time to utc-0
     * @param utc8
     * @return
     */
    public static LocalDateTime utc8ToUTC0(LocalDateTime utc8) {
        return utc8.minusHours(8L);
    }
}
