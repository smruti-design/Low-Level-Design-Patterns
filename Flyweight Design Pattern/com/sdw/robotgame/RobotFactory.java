package com.sdw.robotgame;

import java.util.HashMap;
import java.util.Map;

public class RobotFactory {
	
	private static Map<String, Robot> robotCache = new HashMap<>();
	
	public static Robot createRobots(String type) {
		if(robotCache.containsKey(type)) {
			return robotCache.get(type);
		}
		else {
			if(type == "HUMANIOD") {
				Sprites humanoid = new Sprites();
				Robot humanoidRobot = new HumanoidRobot(type, humanoid);
				robotCache.put(type, humanoidRobot);
				return humanoidRobot;
			}
			else if(type == "ROBOTICDOG") {
				Sprites humanoid = new Sprites();
				Robot roboticDog = new RoboticDog(type, humanoid);
				robotCache.put(type, roboticDog);
				return roboticDog;
				}
		}
			return null;
	}

}
