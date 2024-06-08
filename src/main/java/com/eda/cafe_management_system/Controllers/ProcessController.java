package com.eda.cafe_management_system.Controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class ProcessController {
    @PostMapping("/process")
    public String processCheckout(@RequestParam String customerId, @RequestParam String customerName) {
        CheckoutService checkoutService = new CheckoutService();
        checkoutService.checkout(customerId, customerName);
        return "Checkout process initiated for customer: " + customerId;
    }
}
}
