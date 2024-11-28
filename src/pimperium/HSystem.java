package pimperium;

public class HSystem {
	
	private int level;
	private Hexagon hex;
	private Player controller;
	
	public HSystem(int level) {
		this.level = level;
	}
	
	public int getLevel() {
		return this.level;
	}
	
	public void setHex(Hexagon hex) {
		this.hex = hex;
	}

	public Player getController() {
		return this.controller;
	}

	public void setController(Player controller) {
		this.controller = controller;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
