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
        Payslip payslip = paymentService.execute(8500.00);

        assertEquals(8500.00, payslip.getSalary());
        assertEquals(751.99, payslip.getInss());
        assertEquals(1261.34, payslip.getIrrf());
        assertEquals(6486.67, payslip.getPayment());
    }

}
