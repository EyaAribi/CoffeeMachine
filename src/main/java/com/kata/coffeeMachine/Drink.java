package com.kata.coffeeMachine;

import java.math.BigDecimal;

public enum Drink {
	coffee("C",new BigDecimal("0.6") , true), Tea("T", new BigDecimal("0.4"), true), Chocolate("H", new BigDecimal("0.5"), true), Orange_juice("O",new BigDecimal("0.6"), false);

	private String code;
	private BigDecimal price;
	private Boolean hotable;

	private Drink(String code, BigDecimal price, Boolean hotable) {
		this.code = code;
		this.price = price;
		this.hotable = hotable;
	}

	public String getCode() {
		return code;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public Boolean getHotable() {
		return hotable;
	}

}
