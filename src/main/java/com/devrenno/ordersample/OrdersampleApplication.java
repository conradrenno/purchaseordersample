package com.devrenno.ordersample;

import com.devrenno.ordersample.entities.Order;
import com.devrenno.ordersample.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OrdersampleApplication implements CommandLineRunner {

	Order order1 = new Order(1034,150.00,00.20);
	Order order2 = new Order(2282,800.00,00.10);
	Order order3 = new Order(1309,95.90,00.0);

	@Autowired
	private OrderService orderService;


	public static void main(String[] args) {
		SpringApplication.run(OrdersampleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println("Pedido código: " + order1.getCode());
		System.out.println("Valor total: R$ " + orderService.total(order1));
		System.out.println("Pedido código: " + order2.getCode());
		System.out.println("Valor total: R$ " + orderService.total(order2));
		System.out.println("Pedido código: " + order3.getCode());
		System.out.println("Valor total: R$ " + orderService.total(order3));
	}
}
