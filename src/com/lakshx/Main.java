package com.lakshx;

import java.awt.*;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    final static byte MONTHS_IN_YEAR = 12;
    final static byte PRECENT = 100;

    public static void main(String[] args) {
//          OtherEx otherEx = new OtherEx();
//          String messeage = otherEx.greetUser("Lakshan", "Attanayake");

//        Exercises exercises = new Exercises();
//        exercises.Ex();

//        FizzBuzz fizzBuzz = new FizzBuzz();
//        fizzBuzz.run();

        double principal = readNumber("Enter your Principal: ", 1000, 1_000_000);
        double rate = readNumber("Preferred Annual rate: ", 1, 30);
        byte period = (byte) readNumber("Period(Years): ", 1, 30);

        double mortgage = calculateMortgage(principal, rate, period);
        String MortgageFormat = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println();
        System.out.println("MORTGAGE");
        System.out.println("--------");
        System.out.println("Monthly Payments " + MortgageFormat);

        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("-----------------");
        for (short month = 1; month <= period * MONTHS_IN_YEAR; month++) {
            double balance = calculateBalance(principal, rate, period, month);
            System.out.println(NumberFormat.getCurrencyInstance().format(balance));
        }
    }

    public static double readNumber(String prompt, double min, double max) {
        Scanner scanner = new Scanner(System.in);
        double value;
        while (true) {
            System.out.print(prompt);
            value = scanner.nextDouble();
            if (value >= min && value <= max)
                break;
            System.out.println("Your rate should be between" + min + " - " + max);
        }
        return value;
    }

    public static double calculateBalance(
            double principal,
            double rate,
            byte period,
            short numberOfPaymentsMade
    ) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PRECENT = 100;

        double monthlyInterest = rate / PRECENT / MONTHS_IN_YEAR;
        float numberOfPayments = period * MONTHS_IN_YEAR;

        double balance = principal
                * (Math.pow(1 + monthlyInterest, numberOfPayments) - Math.pow(1 + monthlyInterest, numberOfPaymentsMade))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        return balance;
    }

    public static double calculateMortgage(
            double principal,
            double rate,
            byte period) {

        double monthlyInterest = rate / PRECENT / MONTHS_IN_YEAR;
        float numberOfPayments = period * MONTHS_IN_YEAR;

        double mortgage = principal
                * (monthlyInterest * Math.pow((1 + monthlyInterest), numberOfPayments))
                / (Math.pow((1 + monthlyInterest), numberOfPayments) - 1);

        return mortgage;

    }
}


//public static class Exercises{
//    public void Ex() {
//        String input = "";
//        Scanner scanner = new Scanner(System.in);
//        while (!input.equals("quit")) {
//            System.out.print("Input: ");
//            input = scanner.next().toLowerCase();
//            if (input.equals("quit"))
//                break;
//            System.out.println(input);
//        }
//    }
//            int myAge = 10;
//            int herAge = myAge;
//            long viewsCount = 3_123_456_789L;
//            System.out.println(viewsCount);
//
//            byte age = 30;
//            Date today = new Date();
//            System.out.println(today);
//            Point point1 = new Point(1, 2);
//            Point point2 = point1;
//            point1.x = 5;
//            System.out.println(point2);
//
//            String message = "Hello, I'm Lakshan" + "!!";
//            System.out.println(message.length());
//            System.out.println(message.indexOf("I"));
//            System.out.println(message.replace("Hello,", "Hey,"));
//
//            int[] numbers = {1, 2, 4, 7, 3, 6};
//            Arrays.sort(numbers);
//            System.out.println(Arrays.toString(numbers));
//
//            double x = 1.5;
//            int y = (int) x + 5;
//            System.out.println(y);
//
//            String s = "5";
//            int z = Integer.parseInt(s) + 4;
//            System.out.println(z);
//
//            String k = "2.4";
//            double d = Double.parseDouble(k) + 3;
//            System.out.println(d);
//
//            int result = Math.round(1.2F);
//            System.out.println(result);
//
//            int result1 = (int) Math.ceil(1.2);
//            System.out.println(result1);
//
//            NumberFormat currency = NumberFormat.getCurrencyInstance();
//            String price = currency.format(1234567.90856);
//            System.out.println(price);

//            String pres = NumberFormat.getPercentInstance().format(0.8);
//            System.out.println(pres);
//
//            Scanner scanner = new Scanner(System.in);
//            System.out.print("Age:");
//            byte age2 = scanner.nextByte();
//            System.out.println("You are "+ age2);
//
//            Scanner sc = new Scanner(System.in);
//            System.out.print("Enter your Name: ");
//            String nme = sc.nextLine().trim();
//            System.out.println("You're " + nme );

//            int income = 120_000;
//            boolean hasHighIncome;
//            if (income > 100_000)
//                 hasHighIncome = true;
//            else hasHighIncome = false;
//                    |
//                    |
//                    |
//                   \/
//                Improve Like this Below
//            int income = 120_000;
//            boolean hasHighIncome = (income > 100_000);

//            String role = "moderator";
//            switch (role) {
//                case "admin":
//                    System.out.println("You're an Admin");
//                    break;
//                case "moderator":
//                    System.out.println("You're a moderator");
//                    break;
//                default:
//                    System.out.println("You're a guest");
//
//            }
//
//    }
//
