package tp.p1.PlantsVsZombies;

import java.util.Random;

public class Game {
	
	private SunflowerList sunflowerList;
	private PeashooterList peashooterList;
	private ZombieList zombieList;
	private int contCycles;
	private SuncoinManager managerSuns;
	private ZombieManager managerZombie;
	private Random rand;
	private Level level;
	private GamePrinter gamePrinter;
	
	public Game(Level level, Random rand) {
		this.level = level;
		this.contCycles = 0;
	}
	
	public void update() {
		//Actualizar el tablero recorriendo las listas
		//PISTAS PARA REALIZAR EL UPDATE, PREGUNTAR EN TUTORIA
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
		this.managerZombie = new ZombieManager(level);
	}
	
	//mirar porque esta mal creo no se si puede servir 
	public boolean DarBolazo(int x, int y) {
		boolean si = false;
		//quiero ver si hay un zombie pero creo que esta mal puesto 
		if(gamePrinter.board[x][y].equals(zombieList/*Zombie*/)) {
			si = true; // se manda el true para dar el bolazo si es un zombie 
		}
		
		return si;
	}
	
	//mirar porque esta mal creo, no se si puede valer 
	public void boom() { // intento de lanzar el guisante 
		for(int i = 1; i < gamePrinter.board.length;i++) {
			for(int j = 1; j < gamePrinter.board.length;j++) {
				if(gamePrinter.board[i][j].equals(isZombie(i,j))) {
					this.zombieList.restarVida(i, j);
				}
			}
		}
	}
	
	public void avanzarZombie() {
		// pensar como hacer para avanzar el zombie,
		//si este metodo es para uno o para todos?
		//recorriendo el tablero y si es zombie y esta en el ciclo
		//correcto avanzamos? o como?
		
		
	}
	
	public void zombieAdyacente() {
		//mirar si el zombie esta en una casilla cerca de algo para hacer daño
	}
	
}
