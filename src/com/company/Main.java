package com.company;

import java.time.Month;
import java.time.Year;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        int i;
        Year year = Year.of(in.nextInt());
        for (Month m : Month.values()) {
            System.out.println("" + m + " : " + year.atMonth(m).lengthOfMonth());
        }
    }
}
