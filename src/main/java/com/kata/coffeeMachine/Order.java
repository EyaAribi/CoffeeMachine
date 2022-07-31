package com.kata.coffeeMachine;

import java.math.BigDecimal;

public class Order {
	private Drink drink;
	private Integer sugar;
	private BigDecimal money;
	private Boolean hot = false;

	public Order(Drink drink, Integer sugar, BigDecimal money) {

		this.drink = drink;
		this.sugar = sugar;
		this.money = money;
	}

	public Order setHot() {
		if (drink.getHotable())
			this.hot = true;
		return this;
	}

	public Boolean getHot() {
		return hot;
	}

	public Drink getDrink() {
		return drink;
	}

	public Integer getSugar() {
		return sugar;
	}

	public BigDecimal getMoney() {
		return money;
	}

}
