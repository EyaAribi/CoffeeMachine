package com.kata.coffeeMachine;

import java.math.BigDecimal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CoffeeMachineKataApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoffeeMachineKataApplication.class, args);

		Order order = new Order(Drink.coffee, 2, new BigDecimal("0.7")).setHot();
		CoffeeMachine coffeeMachine = new CoffeeMachine();
		System.out.print(coffeeMachine.make(order));

	}

}
