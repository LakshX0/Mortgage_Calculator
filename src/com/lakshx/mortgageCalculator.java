//package com.lakshx;
//import java.lang.System;
//
//import java.text.NumberFormat;
//import java.util.Scanner;
//
//public class mortgageCalculator {
//    public void calMortgage() {
//        final byte MONTHS_IN_YEAR = 12;
//        final byte PRECENT = 100;
//
//        double principal = 0;
//        int numberOfPayments = 0;
//        double monthlyInterest = 0;
//
//        Scanner scanner = new Scanner(System.in);
//
//        while (true) {
//            System.out.print("Enter your Principal: ");
//            principal = scanner.nextDouble();
//            if (principal >= 1000 && principal <= 1_000_000)
//                break;
//            System.out.println("Your amount should be between $1K - $1M");
//        }
//        while (true) {
//            System.out.print("Preferred Annual rate: ");
//            double rate = scanner.nextDouble();
//            if (rate >= 1 && rate <= 30) {
//                 monthlyInterest = rate / PRECENT / MONTHS_IN_YEAR;
//                break;
//            }
//            System.out.println("Your rate should be between 1 - 30");
//        }
//        while (true) {
//            System.out.print("Period(Years): ");
//            byte period = scanner.nextByte();
//            if (period >= 1 && period <= 30) {
//                numberOfPayments = period * MONTHS_IN_YEAR;
//                break;
//            }
//            System.out.println("Enter a value between 1 - 30");
//        }
//        double mortgage = principal
//                * (monthlyInterest * Math.pow((1 + monthlyInterest), numberOfPayments))
//                / (Math.pow((1 + monthlyInterest), numberOfPayments) - 1);
//
//        String MortgageFormat = NumberFormat.getCurrencyInstance().format(mortgage);
//        System.out.println("Your Mortgage is " + MortgageFormat);
//
//        public static double calculateMortgage(
//                double principal,
//                float annualInteret,
//                byte years) {
//
//        }
//
//
//
//    }
//}
//
