package com.gdss.payment.controller;

import com.gdss.payment.components.Payslip;
import com.gdss.payment.service.PaymentService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
@WebMvcTest(PaymentController.class)
class PaymentControllerTest {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private PaymentService paymentService;

    private static final double SALARY = 8500;

    @Test
    void testGetPayslip() throws Exception {
        Payslip payslip = Payslip.builder()
                .salary(8500.00)
                .inss(751.99)
                .irrf(1261.34)
                .payment(6486.67)
                .build();
        when(paymentService.execute(SALARY)).thenReturn(payslip);

        mvc.perform(get("/payment/" + SALARY))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.salary", is(payslip.getSalary())))
                .andExpect(jsonPath("$.inss", is(payslip.getInss())))
                .andExpect(jsonPath("$.irrf", is(payslip.getIrrf())))
                .andExpect(jsonPath("$.payment", is(payslip.getPayment())));
    }

}

