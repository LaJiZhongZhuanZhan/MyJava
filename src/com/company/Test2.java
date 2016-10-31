package com.company;

import java.time.*;
import java.time.temporal.TemporalAdjusters;

public class Test2 {
    public static void main(String[] args) {
        if (args.length == 0) {
            return;
        }
        Month month = Month.valueOf(args[0].toUpperCase());
        LocalDate ld;
        ld = LocalDate.now().withMonth(month.getValue()).withDayOfMonth(1);

        if (ld.getDayOfWeek() == DayOfWeek.MONDAY) {
            System.out.println(ld);
        }
        while (ld.getMonthValue() == month.getValue()) {
            if (ld.getDayOfWeek() == DayOfWeek.MONDAY) {
                System.out.println(ld);
            }
           ld = ld.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
        }
    }
}
