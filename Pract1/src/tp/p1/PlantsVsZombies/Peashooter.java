package tp.p1.PlantsVsZombies;

public class Peashooter {
	
	static final int STRENGHT = 3;
	static final int FREQUENCY = 1;
	static final int DAMAGE = 1;
	static final int COST = 50; 
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
	
	public static int getCost() {
		return COST;
	}
	
	public void update() { 
		boolean disparo = false;
		for(int i = (this.y + 1); i < game.getGamePrinter().getY() && !disparo; i++) {
			int indexZ = game.getZombieList().indexZombie(this.x, i);
			if(indexZ != -1) {
				game.getZombieList().restarLife(indexZ);
				disparo = true;
				if(game.getZombieList().getZombie(indexZ).getHp() == 0) game.getZombieList().delete(indexZ);
			}
		}
	}
	
	public String toString() {
		String peashooter;
		peashooter= "P[" + this.hp + "]";
		return peashooter;
	}
	
}
