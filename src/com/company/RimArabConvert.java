package com.company;


public class RimArabConvert {
    public static String transformer(int number) {
        int[] ArabikList = new int[]{100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] RimList = new String[]{"C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < RimList.length; i += 1) {
            while (number >= ArabikList[i]) {
                number = number - ArabikList[i];
                res.append(RimList[i]);
            }
        }
        return res.toString();
    }
}