package com.sdw.robotgame;

public class Main {
	
	public static void main(String[] args) {
		
		Robot humanoid1 = RobotFactory.createRobots("HUMANIOD");
		humanoid1.display(1, 2);
		
		Robot humanoid2 = RobotFactory.createRobots("HUMANIOD");
		humanoid1.display(10, 20);
		
		Robot roboticDog1 = RobotFactory.createRobots("ROBOTICDOG");
		roboticDog1.display(2, 4);
		
		Robot roboticDog2 = RobotFactory.createRobots("ROBOTICDOG");
		roboticDog2.display(7 , 8);
	}

}
