package tp.p1.PlantsVsZombies;

public class ZombieManager {
	
	private Level level;
	private int numZombies;
	
	public ZombieManager(Level level) {
		this.level = level;
	}

	public boolean isZombieAdded() {  // revisar 
		boolean zombiesss;
		numZombies = level.getNumZombies();
		if(numZombies>0) {
			zombiesss = true;
		}
		else zombiesss = false;
		
		return zombiesss;
	}
}
