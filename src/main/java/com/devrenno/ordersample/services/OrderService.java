package com.devrenno.ordersample.services;

import com.devrenno.ordersample.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private ShippingService shippingService;

    public double total(Order order){
        return order.getBasicValue() - order.getBasicValue() * order.getDiscount()
                + shippingService.shipping(order);
    }
}
