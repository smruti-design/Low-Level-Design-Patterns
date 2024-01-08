package com.pizza.app;

public class ExtraCheese extends Topping{
	
	BasePizza base;
	
	ExtraCheese(BasePizza obj){
		this.base = obj;
	}

	@Override
	public int cost() {
		return this.base.cost() + 30;
	}

}
