package com.eda.cafe_management_system.Event;

import org.springframework.context.ApplicationEvent;

public class CheckoutEvent extends ApplicationEvent {
    private final String customerId;
    private final String customerName;

    public CheckoutEvent(Object source, String customerId, String customerName) {
        super(source);
        this.customerId = customerId;
        this.customerName = customerName;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getCustomerName() {
        return customerName;
    }
}