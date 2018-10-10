package tp.p1.PlantsVsZombies;

public class Peashooter {
	
	static final int STRENGHT = 3;
	static final int FREQUENCY = 1;
	static final int DAMAGE = 1;
	static final int COST = 1;
	private int x, y, hp;
	private Game game;
	
	public Peashooter(int x, int y, Game game) {
<<<<<<< HEAD
		this.strength = 3; // const
		this.frequency = 1; //cnst
		this.harm = 1; //const
		this.cost = 50; //const
=======
>>>>>>> 180f13475656638052a39aa25c31fa21006f03d8
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
	
<<<<<<< HEAD
	public void disparar() { // PREGUNTAR POR ESTOS METODOS SI VAN AQUI O VAN EN EL GAME (SON PARTE DEL RUN O DEL UPDATE)
=======
	public void update() {
>>>>>>> 180f13475656638052a39aa25c31fa21006f03d8
		
	}
	
	
}
