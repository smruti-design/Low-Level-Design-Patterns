package com.pizza.app;

public class Jalepino extends Topping{
	BasePizza base;
	
	Jalepino(BasePizza base){
		this.base = base;
	}

	@Override
	public int cost() {
		return this.base.cost() + 40;
	}

}
