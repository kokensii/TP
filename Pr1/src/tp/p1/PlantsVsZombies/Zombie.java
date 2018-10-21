package tp.p1.PlantsVsZombies;

public class Zombie {

	static final int STRENGHT = 5;
	static final int DAMAGE = 1;
	static final int SPEED = 2;
	private int x, y, hp, instant;
	private Game game;
	
	public Zombie(int x, int y,Game game) {
		this.x = x;
		this.y = y;
		this.hp = STRENGHT;
		this.game = game;
		this.instant = 0;
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
	
	public void update(){ // Cuando el zombie llegue al final de la fila la partida se acabará
		this.instant++;
		if(this.instant % SPEED == 0 && !game.getPeashooterList().isPeashooter(this.x, this.y - 1)
			&& !game.getSunfloweList().isSunflower(this.x, this.y)) this.y--;//estaba puesta la x y es la y 
		else{
			int indexP = game.getPeashooterList().indexPeashooter(this.x, this.y - 1);
			int indexS = game.getSunfloweList().indexSunflower(this.x, this.y - 1);
			if(indexP != -1){
				game.getPeashooterList().restarLife(indexP);
				if(game.getPeashooterList().getPeashooter(indexP).getHp() == 0) game.getPeashooterList().delete(indexP);
			}
			if(indexS != -1){
				game.getSunfloweList().restarLife(indexS);
				if(game.getSunfloweList().geetSunflower(indexS).getHp() == 0) game.getSunfloweList().delete(indexS);
			}
		}
	}
	
	public String toString() {
		String zombie;
		zombie= "Z[" + this.hp + "]";
		return zombie;
	}
	
}
