package tp.p1.PlantsVsZombies;

public class Zombie {

	private int strength, harm, speed, x, y;
	private Game game;
	
	public Zombie(int x, int y,Game game) {
		this.strength = 5;
		this.harm = 1;
		this.speed = 2; //1 casilla cad dos ciclos
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

	public int getHarm() {
		return harm;
	}

	public void setHarm(int harm) {
		this.harm = harm;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
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
