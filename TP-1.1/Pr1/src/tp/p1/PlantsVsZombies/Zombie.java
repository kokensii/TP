package tp.p1.PlantsVsZombies;

public class Zombie {

	static final int STRENGHT = 5;
	static final int DAMAGE = 1;
	static final int SPEED = 2;
	private int x, y, hp;
	private Game game;
	
	public Zombie(int x, int y,Game game) {
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
	
	public void moveZombie() {
		
	}
	
	public void restarOSumarVida() {
		
	}
	
	public void update(){
		//en este metodo se movera el zombie si le toca o no
		// y se actualiza la informacion del zombie 
		
		
	}
	
	public String toString() {
		String zombie;
		zombie= "Z[" + this.getHp() + "]";
		return zombie;
	}
	
}
