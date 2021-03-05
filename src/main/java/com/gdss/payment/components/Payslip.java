package com.gdss.payment.components;

import com.gdss.payment.util.PaymentUtil;

public class Payslip {

    private double salary;

    private double inss;

    private double irrf;

    private double payment;

    public Payslip(double salary, double inss, double irrf, double payment) {
        this.salary = PaymentUtil.round(salary);
        this.inss = PaymentUtil.round(inss);
        this.irrf = PaymentUtil.round(irrf);
        this.payment = PaymentUtil.round(payment);
    }

    public double getSalary() {
        return salary;
    }

    public double getInss() {
        return inss;
    }

    public double getIrrf() {
        return irrf;
    }

    public double getPayment() {
        return payment;
    }

}
