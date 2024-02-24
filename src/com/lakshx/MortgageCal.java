package com.lakshx;

public class MortgageCal {
    private double principal;
    private double rate;
    private byte period;

    public MortgageCal(double principal, double rate, byte period) {
        this.principal = principal;
        this.rate = rate;
        this.period = period;
    }

    public double calculateMortgage() {

        double monthlyInterest = rate / Main.PRECENT / Main.MONTHS_IN_YEAR;
        float numberOfPayments = period * Main.MONTHS_IN_YEAR;

        double mortgage = principal
                * (monthlyInterest * Math.pow((1 + monthlyInterest), numberOfPayments))
                / (Math.pow((1 + monthlyInterest), numberOfPayments) - 1);

        return mortgage;

    }

    public double calculateBalance(short numberOfPaymentsMade) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PRECENT = 100;

        double monthlyInterest = rate / PRECENT / MONTHS_IN_YEAR;
        float numberOfPayments = period * MONTHS_IN_YEAR;

        double balance = principal
                * (Math.pow(1 + monthlyInterest, numberOfPayments) - Math.pow(1 + monthlyInterest, numberOfPaymentsMade))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        return balance;
    }

    public short getPeriod() {
        return period;
    }
}
