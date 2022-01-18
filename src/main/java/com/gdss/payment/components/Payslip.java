package com.gdss.payment.components;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Payslip {

    private double salary;

    private double inss;

    private double irrf;

    private double payment;

}
