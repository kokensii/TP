package tp.p1.PlantsVsZombies;

public class Peashooter {
	
	private int strength, frequency, harm, cost, x, y;
	private Game game;
	
	public Peashooter(int x, int y, Game game) {
		this.strength = 3;
		this.frequency = 1;
		this.harm = 1;
		this.cost = 50;
		this.x = x;
		this.y = y;
		this.game = game;
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

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
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
