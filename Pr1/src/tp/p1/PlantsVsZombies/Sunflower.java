package tp.p1.PlantsVsZombies;

public class Sunflower {

	private int cost, strength, frequency, harm, x, y;
	private Game game;
	
	public Sunflower(int x, int y) {
		this.cost = 20;
		this.strength = 1;
		this.frequency = 2;
		this.harm = 0;
		this.x = x;
		this.y = y;
		this.game = new Game();
	}
}
