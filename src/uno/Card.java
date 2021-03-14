package uno;

public class Card {
	private int value;
	private String color;
	
	//Value
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	
	// Color
	public String getColor() {
		return color.substring(0, 1);
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
	Card (int value, String color) {
		this.color = color;
		this.value = value;
	}
	
	
	// Methods
	
	
	
	public int randomInt (int min, int max) {
		return (int) (Math.random() * ++max) + min;
	}
	public String randomColor () {
		String[] colors = {"Жёлтый", "Зелёный", "Синий", "Красный"};
		return colors[randomInt(0, 3)];
	}
	
}
