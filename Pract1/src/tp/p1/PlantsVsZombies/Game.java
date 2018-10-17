package tp.p1.PlantsVsZombies;

import java.util.Random;

public class Game {
	
	public SunflowerList sunflowerList;
	public PeashooterList peashooterList;
	public ZombieList zombieList;
	private int contCycles;
	private SuncoinManager managerSuns;
	private ZombieManager managerZombie;
	private Random aleatorio = new Random(System.currentTimeMillis());
	private Level level;
	private GamePrinter gamePrinter;
	
	public Game(Level level, Random rand) {
		this.level = level;
		this.contCycles = 0;
		initZombieList();
		initPeashooterList();
		initSunflowerList();
		initSuncoinManager();
		initZombieManager();
		this.gamePrinter = new GamePrinter(this, 4, 8);
	}
	
	public void update() {
		//Actualizar el tablero recorriendo las listas
		//PISTAS PARA REALIZAR EL UPDATE, PREGUNTAR EN TUTORIA
		if(managerZombie.isZombieAdded()) {
			int valorEntero = (int) Math.floor(Math.random()*(0-3+1)+3);  // Valor entre M y N, ambos incluidos
			Zombie z = new Zombie(valorEntero,7,this); //para que lo meta en la ultima fila 
			this.getZombieList().add(z);
			}
		
		sunflowerList.update();
		peashooterList.update();
		zombieList.update();
		
		for(int i = 0; i < gamePrinter.getX(); i++) {
			for(int j = 0; j < gamePrinter.getY(); j++) {
				gamePrinter.getBoard()[i][j] =  pintarTablero(i, j);
			}
		}
		/*ZombieManager z;
		if(z.isZombieAdded()) {
			Zombie z= new Zombie(x, y, this);
			zombieList.add(z);
		}*/
	
		this.contCycles++;
		//llamar al zombie manager
		//sumar cont 
	}
	
	public int getContCycles() {
		return contCycles;
	}

	public void setContCycles(int contCycles) {
		this.contCycles = contCycles;
	}

	public Level getLevel() {
		return level;
	}

	public void setLevel(Level level) {
		this.level = level;
	}
	
	//PREGUNTAR TUTORIA
	public String toString() {  // este metodo llamara al gameprinter para dibujar el tablero 	
		return gamePrinter.toString();
	}
	
	public boolean isEmpty(int x, int y) {
		if(!peashooterList.isPeashooter(x, y) || !sunflowerList.isSunflower(x, y) ||
			!zombieList.isZombie(x, y)) return true;
		return false;
	}
	
	public boolean isZombie(int x, int y) {//Comprobamos si en la posicion x, y se encuentra un zombie
		if(zombieList.isZombie(x, y)) return true;
		return false;
	}
	
	public boolean isPeashooter(int x, int y) {//Comprobamos si en la posicion x, y se encuentra un peashooter
		if(peashooterList.isPeashooter(x, y)) return true;
		return false;
	}
	
	public boolean isSunflower(int x, int y) {//Comprobamos si en la posicion x, y se encuentra un sunflower
		if(sunflowerList.isSunflower(x, y)) return true;
		return false;
	}
	
	private void initPeashooterList() {
		this.peashooterList = new PeashooterList();
	}
	
	private void initSunflowerList() {
		this.sunflowerList = new SunflowerList();
	}
	
	private void initZombieList() {
		this.zombieList = new ZombieList();
	}
	
	private void initSuncoinManager() {
		this.managerSuns = new SuncoinManager();
	}
	
	private void initZombieManager() {
		this.managerZombie = new ZombieManager(level, this.aleatorio);
	}
	
	//mirar porque esta mal creo no se si puede servir 
	/*public boolean DarBolazo(int x, int y) {
		boolean si = false;
		//quiero ver si hay un zombie pero creo que esta mal puesto 
		if(gamePrinter.board[x][y].equals(zombieList/*Zombie)) {
			si = true; // se manda el true para dar el bolazo si es un zombie 
		}
		
		return si;
	}*/
	
	public GamePrinter getGamePrinter(){
		return this.gamePrinter;
	}
	
	public ZombieList getZombieList(){
		return this.zombieList;
	}
	
	public PeashooterList getPeashooterList(){
		return this.peashooterList;
	}
	
	public SunflowerList getSunfloweList(){
		return this.sunflowerList;
	}

	public SuncoinManager getSuncoins(){
		return this.managerSuns;
	}
	
	public ZombieManager getZombies(){
		return this.managerZombie;
	}
	
	public String pintarTablero(int x, int y) {
			/*if(zombieList.isZombie(x,y)) {
				Zombie z = new Zombie(x, y, this);
				return z.toString();
			}*/
			if(zombieList.isZombie(x,y))
				return zombieList.getZombie(zombieList.indexZombie(x, y)).toString();
			
			if(peashooterList.isPeashooter(x, y)) {
				return peashooterList.getPeashooter(peashooterList.indexPeashooter(x, y)).toString();
			}
			
			if(sunflowerList.isSunflower(x, y)) {
				return sunflowerList.geetSunflower(sunflowerList.indexSunflower(x, y)).toString();
			}else {
				return " ";
			}
	}
}
