package com.lakshx;

import java.text.NumberFormat;

public class MortgageReport {

    private MortgageCal calculator;

    public MortgageReport(MortgageCal calculator) {
        this.calculator = calculator;
    }

    public void printPaymentSchedule() {
        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("-----------------");
        for (double balance : calculator.getRemainingBalances())
            System.out.println(NumberFormat.getCurrencyInstance().format(balance));
    }

    public void printMortgage() {
        double mortgage = calculator.calculateMortgage();
        String MortgageFormat = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println();
        System.out.println("MORTGAGE");
        System.out.println("--------");
        System.out.println("Monthly Payments " + MortgageFormat);
    }
}
