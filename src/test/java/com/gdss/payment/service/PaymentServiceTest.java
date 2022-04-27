package com.gdss.payment.service;

import com.gdss.payment.components.Payslip;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
class PaymentServiceTest {

    @InjectMocks
    private PaymentService paymentService;

    @Test
    void testExecuteFixedINSS() {
        Payslip payslip = paymentService.execute(10000.00);

        assertEquals(10000.00, payslip.getSalary());
        assertEquals(828.39, payslip.getInss());
        assertEquals(1652.83, payslip.getIrrf());
        assertEquals(7518.78, payslip.getPayment());
    }

}
