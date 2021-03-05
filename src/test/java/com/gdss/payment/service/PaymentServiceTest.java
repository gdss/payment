package com.gdss.payment.service;

import com.gdss.payment.components.Payslip;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
class PaymentServiceTest {

    @TestConfiguration
    static class PaymentServiceTestContextConfiguration {

        @Bean
        public PaymentService snippetService() {
            return new PaymentService();
        }
    }

    @Autowired
    private PaymentService paymentService;

    @Test
    void testExecuteFixedINSS() {
        Payslip payslip = paymentService.execute(8500.00);

        Assertions.assertEquals(8500.00, payslip.getSalary());
        Assertions.assertEquals(751.99, payslip.getInss());
        Assertions.assertEquals(1261.34, payslip.getIrrf());
        Assertions.assertEquals(6486.67, payslip.getPayment());
    }

}
