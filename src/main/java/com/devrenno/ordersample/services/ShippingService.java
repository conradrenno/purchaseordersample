package com.devrenno.ordersample.services;

import com.devrenno.ordersample.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    Autowired
    private Order order;
    
    public double shipping(Order order){
        if (order.getBasicValue() > 200.00){
            return 00.00;
        } else if (order.getBasicValue() > 100.00 && order.getBasicValue() < 200.00) {
            return 15.00;
        } else {
            return 20.00;
        }
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
