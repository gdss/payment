package com.gdss.payment.util;

import com.gdss.payment.components.INSS;
import com.gdss.payment.components.IRRF;
import lombok.experimental.UtilityClass;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

@UtilityClass
public class PaymentUtil {

    public double round(double value) {
        BigDecimal bigDecimal = BigDecimal.valueOf(value);
        bigDecimal = bigDecimal.setScale(2, RoundingMode.HALF_EVEN);
        return bigDecimal.doubleValue();
    }

    public List<INSS> getINSSRangeList() {
        List<INSS> inssList = new ArrayList<>();
        inssList.add(new INSS(0.00, 1212, 0.075));
        inssList.add(new INSS(1212.01, 2427.35, 0.09));
        inssList.add(new INSS(2427.36, 3641.03, 0.12));
        inssList.add(new INSS(3641.04, 7087.22, 0.14));
        return inssList;
    }

    public List<IRRF> getIRRFRangeList() {
        List<IRRF> irrfList = new ArrayList<>();
        irrfList.add(new IRRF(1903.98, 0.00, 0.00));
        irrfList.add(new IRRF(2826.65, 0.075, 142.80));
        irrfList.add(new IRRF(3751.05, 0.15, 354.80));
        irrfList.add(new IRRF(4664.68, 0.225, 636.13));
        irrfList.add(new IRRF(Double.MAX_VALUE, 0.275, 869.36));
        return irrfList;
    }

}
