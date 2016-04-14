package gameContent;

public class Card {
	
	private String cardName;
	private String cardType;
	private int cardCost;
	private String cardActions[];
	
	public Card (String cardName, String cardType, int cardCost, String cardActions[]){
		this.cardName = cardName;
		this.cardType = cardType;
		this.cardCost = cardCost;
		this.cardActions = cardActions ;
	}
	
	public String getCardName (){
		return cardName;
	}
}
