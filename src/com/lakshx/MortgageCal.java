package com.lakshx;

public class MortgageCal {
    private final static byte MONTHS_IN_YEAR = 12;
    private final static byte PERCENT = 100;
    private double principal;
    private double rate;
    private byte period;

    public MortgageCal(double principal, double rate, byte period) {
        this.principal = principal;
        this.rate = rate;
        this.period = period;
    }

    public double calculateMortgage() {

        double monthlyInterest = getMonthlyInterest();
        float numberOfPayments = getNumberOfPayments();

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

    public double[] getRemainingBalances() {
        var balances = new double[getNumberOfPayments()];
        for (short month = 1; month <= period * balances.length; month++)
            balances[month - 1] = calculateBalance(month);
        return balances;
    }

    private int getNumberOfPayments() {
        return period * MONTHS_IN_YEAR;
    }

    private double getMonthlyInterest() {
        return rate / PERCENT / MONTHS_IN_YEAR;
    }

}
