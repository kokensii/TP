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
	
	public void update() { //COMPORTAMIENTO 
		//EN ESTE METODO SE LANZARA EL GUISANTE DE CADA CICLO
		//y se actualizara la informacion del lanzaguisante 
		// SE TENDRA QUE MIRAR PARA DAR EL BOLAZO A LAS CASILLAS QUE SEAN DE LA MISMA X
		// E INCREMENTR LA Y MIRANDO SI EN ESA CASILLA HAY ZOMBIE 
		//PARA RESTARLE VIDA 
		//pero no se si se hace aqui o se llama al game y que el game tenga el metodo 
		//game.boom(this.y);
		boolean disparo = false;
		for(int i = (this.x + 1); i < game.getGamePrinter().getX() && !disparo; i++) {
			int indexZ = game.getZombieList().indexZombie(i, this.y);
			if(indexZ != -1) {
				game.getZombieList().restarLife(indexZ);
				disparo = true;
				if(game.getZombieList().getZombie(indexZ).getHp() == 0) game.getZombieList().delete(indexZ);
			}
		}
		/*Lo hace el zombie
		 * if(this.x - 1 >= 0 && game.isZombie(this.x - 1, this.y)) this.hp--;
		if(this.x + 1 < game.getGamePrinter().getX() && game.isZombie(this.x + 1, this.y)) this.hp--;*/
		
	}
	
	public String toString() {
		String peashooter;
		peashooter= "P[" + this.getHp() + "]";
		return peashooter;
	}
	
}
