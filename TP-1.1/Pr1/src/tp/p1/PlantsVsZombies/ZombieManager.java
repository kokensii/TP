package tp.p1.PlantsVsZombies;

import java.util.Random;

public class ZombieManager { // clase que lleva el control del numero de zombies que quedan por salir
	
	private Level level;
	private int numZombies;
	private Random rand;
	
	public ZombieManager(Level level) {
		this.level = level;
	}
	
	public void initZombies() { //Inicializamos el numero de zombies segun la dificultad
		this.numZombies = level.getNumZombies();
	}

	public boolean isZombieAdded() {  // revisar porque ahora mismo se esta pasando el num de zombies totales, y hay que llevar un cont, revisar
		boolean zombiesss;
		numZombies= level.getNumZombies();
		// hay que traer un cont del num de zombies 
		if(numZombies > 0) {
			zombiesss = true;
		}
		else zombiesss = false;
		
		return zombiesss;
	}
}
