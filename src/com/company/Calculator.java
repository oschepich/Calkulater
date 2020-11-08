package com.company;

import com.company.Dei;
//import com.company.RimArabConvert;
//import com.company.Arifmetic;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите выражение в одно действие с числами от 1 до 10 (римскими или арабскими) через пробел:");

        String text = scanner.nextLine();

        System.out.println("Введенный пример: " + text);
        String[] primer = text.split(" ", 3);
        if (primer.length != 3) {
            System.out.println("неверный формат примера");
            System.exit(0);
        }
        String a = primer[0];
        String b = primer[2];

        int res;

        String proizvedenie = "*";
        String chastnoe = "/";
        String summa = "+";
        String raznost = "-";

        if (is(a, b) == 2) {
            a = Dei.valueOf(a).toString();
            b = Dei.valueOf(b).toString();
            int pa = Integer.parseInt(a);
            int pb = Integer.parseInt(b);
//            System.out.println(a);
//            System.out.println(b);
//            System.out.println("римские цыфры");
            if (proizvedenie.equals(primer[1])) {
                res = Arifmetic.calcProiz(pa, pb);
                String resRim = RimArabConvert.transformer(res);
                System.out.println("Ответ : " + resRim);
            } else if (chastnoe.equals(primer[1])) {
                res = Arifmetic.calcChastn(pa, pb);
                String resRim = RimArabConvert.transformer(res);
                System.out.println("Ответ : " + resRim);
            } else if (summa.equals(primer[1])) {
                res = Arifmetic.calcSum(pa, pb);
                String resRim = RimArabConvert.transformer(res);
                System.out.println("Ответ : " + resRim);
            } else if (raznost.equals(primer[1])) {
                res = Arifmetic.calcRaz(pa, pb);
                String resRim = RimArabConvert.transformer(res);
                System.out.println("Ответ : " + resRim);
            } else {

                System.out.println("неверный формат выражения");
                System.exit(0);

            }
        } else if (iss(a, b) == 2) {
            int pa = Integer.parseInt(a);
            int pb = Integer.parseInt(b);
//            System.out.println(pa);
//            System.out.println(pb);
//            System.out.println("арабские цыфры");
            if (proizvedenie.equals(primer[1])) {
                res = Arifmetic.calcProiz(pa, pb);
                System.out.println("Ответ : " + res);

            } else if (chastnoe.equals(primer[1])) {
                res = Arifmetic.calcChastn(pa, pb);
                System.out.println("Ответ : " + res);

            } else if (summa.equals(primer[1])) {
                res = Arifmetic.calcSum(pa, pb);
                System.out.println("Ответ : " + res);

            } else if (raznost.equals(primer[1])) {
                res = Arifmetic.calcRaz(pa, pb);
                System.out.println("Ответ : " + res);

            } else {

                System.out.println("неверный формат выражения");
                System.exit(0);

            }

        } else {
            System.out.println("неверный формат выражения");
            System.exit(0);
        }


    }

    private static int is(String a, String b) {
        int s1 = 0;
        int s2 = 0;

        for (Dei dei : Dei.values()) {
            if (a.equals(dei.name())) {
                s1 = 1;
                break;
            }
        }
        for (Dei dei : Dei.values()) {
            if (b.equals(dei.name())) {
                s2 = 1;
                break;
            }

        }
        return s1 + s2;

    }

    private static int iss(String a, String b) {
        int s11 = 0;
        int s22 = 0;


        for (Dei dei : Dei.values()) {
            if (a.equals(dei.toString())) {
                s11 = 1;
                break;
            }
        }
        for (Dei dei : Dei.values()) {
            if (b.equals(dei.toString())) {
                s22 = 1;
                break;
            }
        }

        return s11 + s22;
    }
}

