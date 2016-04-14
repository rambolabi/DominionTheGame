package gameContentTesters;

// Test framework imports
import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

// Import of relevant classes
import gameContent.*;


public class ContentTesters {
	
	private Player player;
	private String playerName;

	@Before
	public void newPlayer(){
		player = new Player();
	}
	@Test
	public void createPlayer() {
		Scanner input = new Scanner(System.in);		
		System.out.println("Enter your playername: ");
		playerName = input.nextLine();
		System.out.printf("Welcome, %s%n", playerName);		
		input.close();
	}

}