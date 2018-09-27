package tp.p1.PlantsVsZombies;

public class Sunflower {

	private int cost, strength, frequency, harm, x, y;
	private Game game;
	
	public Sunflower(int x, int y,Game game) {
		this.cost = 20;
		this.strength = 1;
		this.frequency = 2;
		this.harm = 0;
		this.x = x;
		this.y = y;
		this.game = game;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getFrequency() {
		return frequency;
	}

	public void setFrequency(int frequency) {
		this.frequency = frequency;
	}

	public int getHarm() {
		return harm;
	}

	public void setHarm(int harm) {
		this.harm = harm;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}
	
	
}
