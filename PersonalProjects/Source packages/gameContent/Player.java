package gameContent;

import java.util.Scanner;

public class Player {
	private String playerName;
	private int playerScore = 0;
	private int amtOfCoins;
	private int amtOfVictoryPoints;

	// Constructor that initializes a player
	public Player(){
	}
	public Player(String playerName){
		this.playerName = playerName;
		this.playerScore = playerScore;
	}

	// Getters and setters for the player
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
		
	}
	public String getPlayerName(){
		return playerName;
	}
	public int getPlayerScore(){
		return playerScore;
	}
}
