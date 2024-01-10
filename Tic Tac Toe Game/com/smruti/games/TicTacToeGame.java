package com.smruti.games;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import javafx.util.Pair;

public class TicTacToeGame {

	Deque<Player> players;
	Board gameBoard;
	
	public void initializeGame() {
		//Creating 2 players
		players = new LinkedList<>();
		PlayingPieceX crossPiece = new PlayingPieceX();
		Player player1 = new Player("Player1", crossPiece);
		
		PlayingPieceO noughtsPiece = new PlayingPieceO();
		Player player2 = new Player("Player2", noughtsPiece);
		
		players.add(player1);
		players.add(player2);
		
		gameBoard = new Board(3);
	}
	
	public String startGame() {
		
		boolean noWinner = true;
		while(noWinner) {
			
			//take out the player whose turn is and put the player back in the list
			Player playerTurn = players.removeFirst();
			
			
			//get the free space from the board
			gameBoard.printBoard();
			List<Pair<Integer, Integer>> freeSpaces = gameBoard.getFreeCells();
			if(freeSpaces.isEmpty()) {
				noWinner = false;
				continue;
			}
			
			//read the user input
			System.out.println("Player: "+ playerTurn.name + " Enter row,column: ");
			Scanner inputString = new Scanner(System.in);
			String s = inputString.nextLine();
			String[] values = s.split(",");
			int inputRow = Integer.valueOf(values[0]);
			int inputCol = Integer.valueOf(values[1]);
			
			//place the piece
			boolean pieceAddedSuccessfully = gameBoard.addPiece(inputRow, inputCol, playerTurn.playingPiece);
            if(!pieceAddedSuccessfully) {
                //player can not insert the piece into this cell, player has to choose another cell
                System.out.println("Incorrect position chosen, try again");
                players.addFirst(playerTurn);
                continue;
            }
            players.addLast(playerTurn);

            boolean winner = isThereWinner(inputRow, inputCol, playerTurn.playingPiece.piece);
            if(winner) {
                return playerTurn.name;
            }
		}
		
		return "tie";
	}

	public boolean isThereWinner(int row, int col, PieceType pieceType) {

		boolean rowMatch = true;
		boolean colMatch = true;
		boolean diagMatch = true;
		boolean antiDiagMatch = true;
		
		//need to check in row
		for(int i = 0 ; i < gameBoard.size ; i++) {
			if(gameBoard.board[row][i] == null || gameBoard.board[row][i].piece != pieceType ) {
				rowMatch = false;
			}
		}
		
		//need to check in column
        for(int i=0;i<gameBoard.size;i++) {

            if(gameBoard.board[i][col] == null || gameBoard.board[i][col].piece != pieceType) {
                colMatch = false;
            }
        }

        //need to check diagonals
        for(int i=0, j=0; i<gameBoard.size;i++,j++) {
            if (gameBoard.board[i][j] == null || gameBoard.board[i][j].piece != pieceType) {
                diagMatch = false;
            }
        }

        //need to check anti-diagonals
        for(int i=0, j=gameBoard.size-1; i<gameBoard.size;i++,j--) {
            if (gameBoard.board[i][j] == null || gameBoard.board[i][j].piece != pieceType) {
                antiDiagMatch = false;
            }
        }

        return rowMatch || colMatch || diagMatch || antiDiagMatch;
	}
	
	
	
}
