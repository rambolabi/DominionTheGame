package gameContent;

public class Stack {

	private int currentStackQuantity;
	private Card stackName;
	
	public Stack(Card stackName, int initialQuantity) {
		this.currentStackQuantity = initialQuantity;
		this.stackName = stackName;
	}
	
	public int getCostOfCard() {
		return this.stackName.getCostOfCard();
	}
	
	public int getCurrentQuantityOfStack() {
		return this.currentStackQuantity;
	}
	
	public Card remove1CardOfTheStack() {
		this.currentStackQuantity -= 1;
		Card boughtCard = this.stackName;
		
		return boughtCard;
	}
}