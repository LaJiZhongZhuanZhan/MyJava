package com.company;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * Created by Nothing on 2016/10/30.
 */
public class Test3 {
    public static void main(String[] args) {
        if (args.length == 0) {
            return;
        }
        LocalDate ld = LocalDate.parse(args[0]);
        if (ld.getDayOfWeek() == DayOfWeek.FRIDAY && ld.getDayOfMonth() == 13) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
