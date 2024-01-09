package com.factory.shape;

public class Main {

	public static void main(String[] args) {
		
		ShapeFactory sf = new ShapeFactory();
		
		Shape shape = sf.getShape("Square");
		
		shape.draw();
		
	}

}
