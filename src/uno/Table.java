package uno;

public class Table {
	
	
	public void printTurn(Deck playerdeck, Card card) {
		String message = String.format("�� ����� �����: %s (%s)", card.getValue(), card.getColor());
		System.out.println();
		System.out.println(message);
		System.out.println();
	}
	
	
}
