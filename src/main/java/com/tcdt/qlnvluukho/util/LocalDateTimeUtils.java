package com.tcdt.qlnvluukho.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeUtils {

    private static final String DATE_FORMAT = "dd/MM/yyyy";

    public static String localDateToString(LocalDate localDate) {
        if (localDate == null)
            return null;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_FORMAT);
        return localDate.format(formatter);
    }
}
