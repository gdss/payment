package com.gdss.payment.controller;

import com.gdss.payment.components.Payslip;
import com.gdss.payment.service.PaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/payment")
public class PaymentController {

    private final PaymentService paymentService;

    @GetMapping("{salary}")
    public Payslip get(@PathVariable("salary") double salary) {
        return paymentService.execute(salary);
    }

}
