package gameContent;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	
	private ArrayList<Card> playerDeck;
	
	public Deck() {
		this.playerDeck = new ArrayList<Card>();
	}
	
	public String getNameOfSelectedCard(int selectedCard){
		return this.playerDeck.get(selectedCard).getName();
	}
	
	public void addCardToDeck(Card cardName) {
		this.playerDeck.add(cardName);
	}
	
	public void removeCardFromDeck(Card selectedCard) {
		this.playerDeck.remove(selectedCard);
	}
	
	public void shuffleDeck() {
		Collections.shuffle(this.playerDeck);
	}
}