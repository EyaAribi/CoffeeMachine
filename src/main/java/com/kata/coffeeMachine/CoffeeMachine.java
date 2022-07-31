package com.kata.coffeeMachine;

import java.math.BigDecimal;

public class CoffeeMachine {

	public String make(Order order) {
		if (order.getMoney().compareTo(order.getDrink().getPrice()) < 0 ) {
			BigDecimal missingMoney = (order.getDrink().getPrice()).subtract((order.getMoney())) ;
			return missingMoneyMessage(missingMoney);
		}
		String orderMessage = order.getDrink().getCode() + (order.getHot() ? "h" : "");
		orderMessage += order.getSugar() == 0 ? "::" : ":" + order.getSugar() + ":0";

		return orderMessage;
	}

	private String missingMoneyMessage(BigDecimal missingMoney) {
		return "M:Missing: " + missingMoney;
	}

}
