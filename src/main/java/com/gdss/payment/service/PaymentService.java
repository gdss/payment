package com.gdss.payment.service;

import com.gdss.payment.components.INSS;
import com.gdss.payment.components.IRRF;
import com.gdss.payment.components.Payslip;
import com.gdss.payment.util.PaymentUtil;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentService {

    public Payslip execute(double salary) {
        double inss = calculateINSS(salary);
        double irrf = calculateIRRF(salary - inss);

        return new Payslip(salary, inss, irrf, calculatePayment(salary, inss, irrf));
    }

    private double calculatePayment(double payment, double inss, double irrf) {
        return payment - inss - irrf;
    }

    private double calculateINSS(double base) {
        List<INSS> inssList = PaymentUtil.getINSSRangeList();

        double inssTotal = 0;

        for (INSS inss : inssList) {
            if (base <= inss.getToSalary()) {
                return inssTotal + ((base - inss.getFromSalary()) * inss.getAliquot());
            }

            inssTotal += (inss.getToSalary() - inss.getFromSalary()) * inss.getAliquot();
        }

        return inssTotal;
    }

    private double calculateIRRF(double base) {
        List<IRRF> irrfList = PaymentUtil.getIRRFRangeList();

        for (IRRF irrf : irrfList) {
            if (base <= irrf.getToSalary()) {
                return (base * irrf.getAliquot()) - irrf.getDeductible();
            }
        }

        return 0;
    }

}
