package uno;
import java.util.ArrayList;


public class Deck {
	// 
	private int amount;
	ArrayList<Card> playerdeck = new ArrayList<Card>();
	
	// Constructor
	Deck(int value) {
		playerdeck = generateCards(value);
	}
	
	// Amount get set
	public int getAmount() {
		return playerdeck.size();
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	// Methods
	
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
	
	// Add card
	public void addCard() {
		Card card = new Card();
		playerdeck.add(card);
	}
	
	// Pop card
	public void popCard(int index, Card attack) {
			playerdeck.remove(index);		
	}
	
	// Get card by index
	private Card getCard(int index) {
		return playerdeck.get(index);
	}
	
	// Return card by index and deck
	public Card chooseCard(int index, Deck deck) {
		return deck.getCard(index);
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
		System.out.println("Выберите карту из вашей колоды или возьмите карту (0)");
	}
	
}
