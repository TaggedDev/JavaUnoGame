package uno;

public class PlusTwo extends Card {
	
	private int type;
	
	PlusTwo (int value, String color, byte type) {
		super(value, color);
		this.setType(type);
	}

	
	
	//Type
	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}
}
