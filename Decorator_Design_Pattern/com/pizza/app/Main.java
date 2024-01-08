package com.pizza.app;

public class Main {

	public static void main(String[] args) {
		
		BasePizza basePizza = new ExtraCheese(new Jalepino(new Margherita()));
		
		System.out.println("The order price is : " + basePizza.cost());

	}

}
