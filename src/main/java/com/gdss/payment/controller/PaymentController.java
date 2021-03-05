package com.gdss.payment.controller;

import com.gdss.payment.components.Payslip;
import com.gdss.payment.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @GetMapping("{salary}")
    public Payslip get(@PathVariable("salary") double salary) {
        return paymentService.execute(salary);
    }

}
