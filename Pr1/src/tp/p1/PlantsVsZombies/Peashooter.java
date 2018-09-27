package tp.p1.PlantsVsZombies;

public class Peashooter {
	
	private int strength, frequency, harm, cost, x, y;
	private Game game;
	
	public Peashooter(int x, int y) {
		this.strength = 3;
		this.frequency = 1;
		this.harm = 1;
		this.cost = 50;
		this.x = x;
		this.y = y;
		this.game = new Game();
	}
}
