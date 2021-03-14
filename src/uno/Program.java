package uno;
import java.util.Scanner;

public class Program {
	
	public static void Turn(Deck playerDeck) {
		// 1. Show table
		// 2. What card should player use to beat
		// 3. If player wants he can take one more card
		
		// 1
		Table table = new Table();
		table.printTurn(playerDeck);
		playerDeck.printDeck();
		Card defender = table.getCard();
		
		// 2 & 3
		int index;
		Scanner in = new Scanner(System.in);
		index = in.nextInt() - 1;
		
		if (index != -1) {
			Card attacker = playerDeck.chooseCard(index);
			while (!playerDeck.popCard(index, attacker, defender)) {
				index = in.nextInt();
			}
		} else {
			playerDeck.addCard();
		}
		
		
	}
	
	public static void main(String[] args) {
		//String command;
		//command = in.nextLine();
		
		Deck playerDeck = new Deck(6);
		while(playerDeck.getAmount() != 0) {
			Turn(playerDeck);
			
		}

		
		
		
		
		
	}
}
