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
		//PISTAS PARA REALIZAR EL UPDATE, PREGUNTAR EN TUTORIA
	}
	
	//PREGUNTAR TUTORIA
	public String toString() {  // este metodo llamara al gameprinter para dibujar el tablero 	
		return gamePrinter.toString();
	}
	
	//ESTA MAL PORQUE SOLO MIRA LAS LISTAS, NO ESTA MIRANDO POR HUECOS EN EL TABLERO 
	//ME FALTA UN TABLERO
	public boolean isEmptyToInsert(int x,int y) { // metodo para validar que se puede insertar un elemento en los arrays
		boolean validar = false;
		/*if (sunflowerList.isEmpty() && zombieList.isEmpty() && peashooterList.isEmpty()) {
			validar = true;
		}*/
		if(gamePrinter.board[x][y].isEmpty())  validar = true;
		
		//gamePrinter.board[x][y].isEmpty(); para acceder a una pos del tablero
		return validar;
	}
	
	public boolean DarBolazo(int x, int y) {
		boolean si = false;
		//quiero ver si hay un zombie pero creo que esta mal puesto 
		if(gamePrinter.board[x][y].equals(zombieList/*Zombie*/)) {
			si = true; // se manda el true para dar el bolazo si es un zombie 
		}
		return si;
	}
	
	
	
}
