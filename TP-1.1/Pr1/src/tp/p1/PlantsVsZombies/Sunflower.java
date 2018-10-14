package tp.p1.PlantsVsZombies;

public class Sunflower {
	
	static final int STRENGHT = 1;
	static final int FREQUENCY = 2;
	static final int DAMAGE = 0;
	static final int COST = 20;
	
	private int x, y, hp;
	private Game game;
	
	public Sunflower(int x, int y,Game game) {
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
	
	// Metodo para generar soles, habra que verificar si se puede o no generar 
	/*public int generateSuns(Game game) {
		int suns = 0;
		boolean generate;
		if(cost >= 20) { // mirar si esto va aqui o no 
		}
		return suns;
	}*/
	
	public void update(){
		//en este metodo se generara el numero de soles por ciclo que sea 
		// y se actualizara la informacion del girasol 
	
		
	}
	
}
