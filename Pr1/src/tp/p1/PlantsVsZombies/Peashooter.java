package tp.p1.PlantsVsZombies;

public class Peashooter {
	
	static final int STRENGHT = 3;
	static final int FREQUENCY = 1;
	static final int DAMAGE = 1;
	static final int COST = 1;
	private int x, y, hp;
	private Game game;
	
	public Peashooter(int x, int y, Game game) {
		this.x = x;
		this.y = y;
		this.hp = STRENGHT;
		this.game = game;
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
	
	public int getHp(){
		return this.hp;
	}
	
	public void setHp(int hp){
		this.hp = hp;
	}

	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}
	
	public void update() {
		
	}
	
	
}
