package tp.p1.PlantsVsZombies;

public class Zombie {

	private int strength, harm, speed, x, y;
	private Game game;
	
	public Zombie(int x, int y) {
		this.strength = 5;
		this.harm = 1;
		this.speed = 2; //1 casilla cad dos ciclos
		this.x = x;
		this.y = y;
		this.game = new Game();
	}
}
