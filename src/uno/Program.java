package uno;
import java.util.Scanner;

public class Program {
	
	public static void Turn(Deck playerDeck) {
		// 1. Show table
		// 2. What card should player use to beat
		// 3. If player wants he can take one more card
		
		// 1
		Table table = new Table();
		Card card = table.generateCard();
		table.printTurn(playerDeck, card);
		playerDeck.printDeck();
				
		// 2 & 3
		int index;
		Scanner in = new Scanner(System.in);
		index = in.nextInt();
		
		while ( (index < 0) || (index > playerDeck.getAmount()) ) {
			index = in.nextInt(); // Asks user to input index until the integer is correct
		}
		
		
		
		if (index == 0) {
			playerDeck.addCard();
		} else {
			index--;
			Card player = playerDeck.chooseCard(index, playerDeck);
			if (card.canBeat(player, card)) {
				playerDeck.popCard(index, card);
			} else {
				System.out.println("Выберите правильную карту!");
			}
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
