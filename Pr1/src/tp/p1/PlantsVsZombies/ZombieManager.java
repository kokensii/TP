package tp.p1.PlantsVsZombies;

import java.util.Calendar;
import java.util.Random;

public class ZombieManager { // clase que lleva el control del numero de zombies que quedan por salir
	
	private Level level;
	private int numZombies;
	private Random rand;
	
	public ZombieManager(Level level, Random rand) {
		this.level = level;
		this.rand = rand;
	}
	
	public void initZombies() { //Inicializamos el numero de zombies segun la dificultad
		this.numZombies = level.getNumZombies();
	}

	public boolean isZombieAdded() {  // revisar porque ahora mismo se esta pasando el num de zombies totales, y hay que llevar un cont, revisar
		boolean zombie = false;
		long number = rand.nextLong();
		
		if(number <= level.getFrequency()){
			zombie = true;
			this.numZombies--;
		}
		
		return zombie;
	}
}
