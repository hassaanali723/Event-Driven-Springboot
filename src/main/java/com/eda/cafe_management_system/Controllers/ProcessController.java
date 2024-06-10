package com.eda.cafe_management_system.Controllers;

import com.eda.cafe_management_system.Services.CheckoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProcessController {


    private final CheckoutService checkoutService;

    @Autowired
    public ProcessController(CheckoutService checkoutService) {
        this.checkoutService = checkoutService;
    }

    @PostMapping("/process")
    public String processCheckout(@RequestParam String customerId, @RequestParam String customerName) {
        checkoutService.checkout(customerId, customerName);
        System.out.println("Checkout process initiated for customer: " + customerId);
        return "Checkout process initiated for customer: " + customerId;

    }
}

