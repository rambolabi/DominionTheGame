package gameContent;

import java.util.ArrayList;

public class Hand {

	private int numberOfCardsInHand;
	private ArrayList<Card> cardsInHand;
	
	public Hand() {
		this.cardsInHand = new ArrayList<Card>();
		//number of cards in hand = length of arraylist
		//cards in hands
	} 
	
	public int getNumberOfCardsInHand() {
		return this.numberOfCardsInHand;
	}

	public void drawCardFromDeckIntoHand(Card drawnCard) {
		this.cardsInHand.add(drawnCard);
	}
	
	public String getNameOfCard(int cardNumber) {
		return this.cardsInHand.get(cardNumber).getName();
	//Nodig? -> Testen, niet echt voor de werking van het spel
	}
	
	public void removeCardFromHand(Card cardToRemove) {
		this.cardsInHand.remove(cardToRemove);
	}
	
}
