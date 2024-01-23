package com.smruti.snakeladder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class PlaySnakeAndLadder {

	public static void main(String[] args) {
		
		Dice dice = new Dice(1);
		Player p1 = new Player("Guddu", 1);
		Player p2 = new Player("Mahi", 2);
		Queue<Player> allPlayers = new LinkedList<>();
		allPlayers.offer(p1);
		allPlayers.offer(p2);
		Jumper snake1 = new Jumper(10,2);
		Jumper snake2 = new Jumper(99,12);
		List<Jumper> snakes = new ArrayList<>();
		snakes.add(snake1);
		snakes.add(snake2);
		Jumper ladder1 = new Jumper(5,25);
		Jumper ladder2 = new Jumper(40,89);
		List<Jumper> ladders = new ArrayList<>();
		ladders.add(ladder1);
		ladders.add(ladder2);
		Map<String, Integer> playersCurrentPosition = new HashMap<>();
		playersCurrentPosition.put("Guddu", 0);
		playersCurrentPosition.put("Mahi", 0);
		GameBoard gb = new GameBoard(dice, allPlayers, snakes, ladders, playersCurrentPosition, 100 );
		gb.startGame();
	}

}
