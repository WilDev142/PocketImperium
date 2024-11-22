package pimperium;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

public class Hexagon {
	
	private int pos_x;
	private int pos_y;
	private boolean isTriPrime = false;
	private Set<Hexagon> neighbors;
	private HSystem system;
	private List<Ship> ships; 
	
	public Hexagon(int x, int y) {
		this.pos_x = x;
		this.pos_y = y;
		this.neighbors = new HashSet<>();
		this.ships = new ArrayList<Ship>(); 
	}
	
	public void addSystem(HSystem system) {
		this.system = system;
	}

	public void setTriPrime() {
		this.isTriPrime = true;
	}

	public boolean isTriPrime() {
		return this.isTriPrime;
	}
	
	public void addNeighbor(Hexagon hex) {
		this.neighbors.add(hex);
	}

	public void addNeighbor(Set<Hexagon> hexs) {
		this.neighbors.addAll(hexs);
	}

	public void removeNeighbor(Set<Hexagon> hexs) {
		this.neighbors.removeAll(hexs);
	}
	
	public Set<Hexagon> getNeighbours() {
		return this.neighbors;
	}
	
	public void printNeighbours() {
		System.out.print("List of neighbours for ");
		System.out.println(this);
		for (Hexagon hex : this.neighbors) {
			System.out.println(hex);
		}
	}
	
	public int getx() {
		return this.pos_x;
	}
	
	public int gety() {
		return this.pos_y;
	}
	
	public String toString() {
		return "hex"+pos_x+"_"+pos_y;
	}

	// Remove all ships from the hexagon
	public void removeShips() {
		this.ships.clear(); 
	}

	// Remove specific ships from the hexagon
	public void removeShips(List<Ship> shipsToRemove) {
		this.ships.removeAll(shipsToRemove);
	}

	public HSystem getSystem() {
		return this.system;
	}

	public void setSystem(HSystem system) {
		this.system = system;
	}


	public List<Ship> getShips() {
		return this.ships;
	}

	public void setShips(List<Ship> ships) {
		this.ships = ships;
	}

	public static void main(String[] args) {
		System.out.println("Hello World !");
	}
}
