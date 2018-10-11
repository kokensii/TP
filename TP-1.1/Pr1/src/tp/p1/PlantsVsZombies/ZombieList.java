package tp.p1.PlantsVsZombies;

import java.util.ArrayList;

public class ZombieList {
	
	private ArrayList<Zombie> zombieList;
	private int cont;
	
	public ZombieList() {
		zombieList = new ArrayList<Zombie>();
		cont = 0;
	}
	
	public void add(int x, int y, Game game) {
		zombieList.add(cont, new Zombie(x, y, game));
		this.cont++;
	}
	
	public void delete(int x, int y) { //Mirarlo bien
		zombieList.remove(this.cont);
		this.cont--;
	}
	
	public int getSize() {
		return zombieList.size();
	}
	
	public boolean isEmpty() {
		return zombieList.isEmpty();
	}
	
	public boolean isZombie(int x, int y) {
		boolean isZ = false;
		for(int i = 0; i < zombieList.size() && !isZ; ++i){
			if(zombieList.get(i).getX() == x && zombieList.get(i).getY() == y) isZ = true;
		}
		return isZ;
	}

}
