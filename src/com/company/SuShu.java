package com.company;

public class SuShu {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 2; count <500; i++) {
            if (isSuShu(i)) {
                System.out.printf("%5d", i);
                count++;
                if (count % 20 ==0)
                    System.out.println();
            }
        }
    }

    private static boolean isSuShu(int i) {
        if (i < 1) {
            return false;
        }
        if (i < 4) {
            return true;
        }
        for (int k = 2; k < i ; k++) {
            if (i % k == 0)
                return false;

        }
        return true;
    }
}
