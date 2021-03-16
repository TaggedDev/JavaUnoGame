package uno;

import java.util.ArrayList;

public class Card {
	private int value;
	private String color;
	
	
	//Value get set
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	
	// Color get set
	public String getColor() {
		return color.substring(0, 1);
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	// Constructor
	Card (int value, String color) {
		this.color = color;
		this.value = value;
	}	
	
	// Default constructor
	Card () {
		this.value = randomInt(0,8);
		this.color = randomColor();
	}
	
	
	// Methods
	public int randomInt (int min, int max) {
		return (int) (Math.random() * ++max) + min;
	}
	
	public String randomColor () {
		String[] colors = {"Жёлтый", "Зелёный", "Синий", "Красный"};
		return colors[randomInt(0, 3)];
	}	
	
	public boolean canBeat(Card attack, Card defend) {
		if (attack.getColor().equals(defend.getColor())|| (attack.getValue() == defend.getValue()))
			return true;
		
		else 
			return false;
	}
}
