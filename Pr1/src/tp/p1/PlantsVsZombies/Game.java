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
	private GamePrinter gamePrinter;
	
	public Game(Level level, Random rand) {
		this.contCycles = 0;
	}
	
	public void update() {
		//Actualizar el tablero recorriendo las listas
	}
	
	public String toString() {  // este metodo llamara al gameprinter para dibujar el tablero 	
		gamePrinter.draw(this);
		return null; // revisar ESTO 
	}
	
}
