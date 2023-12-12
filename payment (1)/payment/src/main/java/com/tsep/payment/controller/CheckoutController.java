package com.tsep.payment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CheckoutController {

    @GetMapping("/checkout")
    public String getCheckoutPage() {
        return "checkout"; // Assuming you have a Thymeleaf or other template engine configured
    }
}
