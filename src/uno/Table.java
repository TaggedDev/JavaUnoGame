package uno;

public class Table {
	
	private Card card;
	
	public void printTurn(Deck playerdeck) {
		Card card = getCard();
		String message = String.format("На столе карта: %s (%s)", card.getValue(), card.getColor());
		System.out.println();
		System.out.println(message);
		System.out.println();
	}

	public Card getCard() {
		Card card = new Card();
		return card;
	}
	
}
