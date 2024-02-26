package com.lakshx;

public class Main {

    public static void main(String[] args) {

        double principal = Console.readNumber("Enter your Principal: ", 1000, 1_000_000);
        double rate = Console.readNumber("Preferred Annual rate: ", 1, 30);
        byte period = (byte) Console.readNumber("Period(Years): ", 1, 30);

        var calculator = new MortgageCal(principal, rate, period);

        var report = new MortgageReport(calculator);
        report.printMortgage();
        report.printPaymentSchedule();
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
