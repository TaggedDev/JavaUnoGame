package uno;
import java.util.ArrayList;


public class Deck {
	// 
	private int amount;
	ArrayList<Card> playerdeck = new ArrayList<Card>();
	
	Deck(int value) {
		playerdeck = generateCards(value);
	}
	
	// Fill the deck with random cards
	public ArrayList<Card> generateCards(int value) {
		ArrayList<Card> deck = new ArrayList<Card>();
		// Filling the deck variable with random cards with random ints with random colors
		for (int i = 0; i < value; i++) {
			Card card = new Card(randomInt(1, 8), randomColor());
			deck.add(card);
		}
		setAmount(value);
		// return completed deck of 6 cards
		return deck;
	}
		
	// Amount get set
	public int getAmount() {
		return playerdeck.size();
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	// Add cards
	public Deck addCard(Deck deck) {
		return deck;
	}
	//Random integer
	public int randomInt (int min, int max) {
		return (int) (Math.random() * ++max) + min;
	}
	// Random color
	public String randomColor () {
		String[] colors = {"Жёлтый", "Зелёный", "Синий", "Красный"};
		return colors[randomInt(0, 3)];
	}
	// Print the deck to user
	public void printDeck() {
		ArrayList<Card> deck = playerdeck;
		String numbers = "";
		String colors = "";
		
		for (int i = 0; i < deck.size(); i++) {
			Card card = deck.get(i);
			numbers += card.getValue() + " ";
			colors += card.getColor().substring(0) + " ";
		}
		String message = String.format("Ваша колода: %s", numbers);
		System.out.println(message);
		System.out.print("             ");
		System.out.println(colors);
	}
	
}
