package com.smruti.snakeladder;

import java.util.List;
import java.util.Map;
import java.util.Queue;

public class GameBoard {
	
	private Dice dice;
	private Queue<Player> nextTurn;
	private List<Jumper> snake;
	private List<Jumper> ladder;
	private Map<String, Integer> playerCurrentPosition;
	private int boardSize;
	
	GameBoard(Dice dice, Queue<Player> nextTurn, List<Jumper> snake, List<Jumper> ladder, Map<String, Integer> playerCurrentPosition, int boardSize){
		this.boardSize = boardSize;
		this.dice = dice;
		this.nextTurn = nextTurn;
		this.snake = snake;
		this.ladder = ladder;
		this.playerCurrentPosition = playerCurrentPosition;
	}

	
	void startGame() {
		while(nextTurn.size() > 1) {
			Player player = nextTurn.poll();
			int currentPosition = playerCurrentPosition.get(player.getPlayerName());
			int diceValue = dice.rollDice();
			int nextCell = currentPosition + diceValue;
			if(nextCell > boardSize){
				nextTurn.offer(player);			
			}else if(nextCell == boardSize) {
				System.out.println(player.getPlayerName() + " won the game");
			}else {
				int[] nextPosition = new int[1];
				boolean[] b = new boolean[1];
				nextPosition[0] = nextCell;
				snake.forEach(v -> {
					if(v.start == nextCell) {
						nextPosition[0] = v.end;
					}
				});
				if(nextPosition[0] != nextCell) {
					System.out.println(player.getPlayerName()+ " Bitten by snake at "+ nextCell);
				}
				ladder.forEach(v -> {
					if(v.start == nextCell) {
						nextPosition[0] = v.end;
						b[0] = true;
					}
				});
				if(nextPosition[0] != nextCell && b[0]) {
					System.out.println(player.getPlayerName()+ " Got Ladder present at: "+ nextCell);
				}
				if(nextPosition[0] == boardSize) {
					System.out.println(player.getPlayerName()+" won the game");
				}else {
					playerCurrentPosition.put(player.getPlayerName(), nextPosition[0]);
					System.out.println(player.getPlayerName() +" is at position "+ nextPosition[0]);
					nextTurn.offer(player);
				}
				
			}
			
		}
	}
}
