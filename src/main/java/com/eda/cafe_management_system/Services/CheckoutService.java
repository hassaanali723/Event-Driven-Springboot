package com.eda.cafe_management_system.Services;

import com.eda.cafe_management_system.Event.CheckoutEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
public class CheckoutService {

//    private final BillingService billingService;
//    private final InventoryService inventoryService;
//    private final NotificationService notificationService;
//    private final CleaningService cleaningService;
//
//    @Autowired
//    public CheckoutService(BillingService billingService,
//                           InventoryService inventoryService,
//                           NotificationService notificationService,
//                           CleaningService cleaningService) {
//        this.billingService = billingService;
//        this.inventoryService = inventoryService;
//        this.notificationService = notificationService;
//        this.cleaningService = cleaningService;
//    }

    private final ApplicationEventPublisher eventPublisher;

    public CheckoutService(ApplicationEventPublisher eventPublisher) {
        this.eventPublisher = eventPublisher;
    }

    public void checkout(String customerId, String customerName) {
        // Generate bill
//        billingService.generateBill(customerId);
//
//        // Update inventory
//        inventoryService.updateInventory(customerId);
//
//        // Notify customer
//        notificationService.notifyCustomer(customerId);
//
//        // Clean tables
//        cleaningService.cleanTables();

        // Publish the event
        CheckoutEvent checkoutEvent = new CheckoutEvent(this, customerId, customerName);
        eventPublisher.publishEvent(checkoutEvent);
    }
}