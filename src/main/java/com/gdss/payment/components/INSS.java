package com.gdss.payment.components;

public class INSS {

    private double fromSalary;

    private double toSalary;

    private double aliquot;

    public INSS(double fromSalary, double toSalary, double aliquot) {
        this.fromSalary = fromSalary;
        this.toSalary = toSalary;
        this.aliquot = aliquot;
    }

    public double getFromSalary() {
        return fromSalary;
    }

    public double getToSalary() {
        return toSalary;
    }

    public double getAliquot() {
        return aliquot;
    }

}
