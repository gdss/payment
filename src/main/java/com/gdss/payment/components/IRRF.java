package com.gdss.payment.components;

public class IRRF {

    private double toSalary;

    private double aliquot;

    private double deductible;

    public IRRF(double toSalary, double aliquot, double deductible) {
        this.toSalary = toSalary;
        this.aliquot = aliquot;
        this.deductible = deductible;
    }

    public double getToSalary() {
        return toSalary;
    }

    public double getAliquot() {
        return aliquot;
    }

    public double getDeductible() {
        return deductible;
    }

}
