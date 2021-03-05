package com.gdss.payment.util;

import com.gdss.payment.components.INSS;
import com.gdss.payment.components.IRRF;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class PaymentUtil {

    private PaymentUtil() {
    }

    public static double round(double value) {
        BigDecimal bigDecimal = BigDecimal.valueOf(value);
        bigDecimal = bigDecimal.setScale(2, RoundingMode.HALF_EVEN);
        return bigDecimal.doubleValue();
    }

    public static List<INSS> getINSSRangeList() {
        List<INSS> inssList = new ArrayList<>();
        inssList.add(new INSS(0.00, 1100.00, 0.075));
        inssList.add(new INSS(1100.01, 2203.48, 0.09));
        inssList.add(new INSS(2203.49, 3305.22, 0.12));
        inssList.add(new INSS(3305.23, 6433.57, 0.14));
        return inssList;
    }

    public static List<IRRF> getIRRFRangeList() {
        List<IRRF> irrfList = new ArrayList<>();
        irrfList.add(new IRRF(1903.98, 0.00, 0.00));
        irrfList.add(new IRRF(2826.65, 0.075, 142.80));
        irrfList.add(new IRRF(3751.05, 0.15, 354.80));
        irrfList.add(new IRRF(4664.68, 0.225, 636.13));
        irrfList.add(new IRRF(Double.MAX_VALUE, 0.275, 869.36));
        return irrfList;
    }

}
