// This class will initialize the game, nothing more!
// It should only ask for the amount of players and their names.
// Once the valid inputs have been given by the user, the game initializes.

package gameCore;
import java.util.Scanner;

import gameControllers.*;

public class InitializeGame {

	private static int amtOfPlayers = 0;

	public void amtOfPlayers(int amtOfPlayers){
		InitializeGame.amtOfPlayers = amtOfPlayers;
	}
	public int getAmtOfPlayers(){
		return amtOfPlayers;
	}
	
	
	public static void initAmountOfPlayers(){
		System.out.println("Welcome to Dominion!\n\nPlease enter the amount of players (1-4):");
		Scanner input = new Scanner(System.in);
		amtOfPlayers = input.nextInt();
		if ((amtOfPlayers < 1) && (amtOfPlayers > 4))
			System.out.println("You entered an incorrect amount of players. Please choose a number between 1 and 4.");
			amtOfPlayers = input.nextInt();
			
		System.out.printf("You decided to play with %d players.", amtOfPlayers);
		
		input.close();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		initAmountOfPlayers();
		
	}

}
