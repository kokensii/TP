package tp.p1.PlantsVsZombies;

import java.util.ArrayList;

public class ZombieList {
	
	private ArrayList<Zombie> zombieList;
	private int cont;
	
	public ZombieList() {
		zombieList = new ArrayList<Zombie>();
		cont = 0;
	}
	
	public void add(Zombie z) {
		zombieList.add(z);
		this.cont++;
	}
	
	public void delete(int index) { //Mirarlo bien
		zombieList.remove(index);
		this.cont--;
	}
	
	public int getSize() {
		return zombieList.size();
	}
	
	public Zombie getZombie(int index){
		return zombieList.get(index);
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
	
	public int indexZombie(int x, int y){
		int isZ = -1;
		for(int i = 0; i < zombieList.size() && isZ == -1; ++i){
			if(zombieList.get(i).getX() == x && zombieList.get(i).getY() == y) isZ = i;
		}
		return isZ;
	}
	
	public void restarVida(int x, int y) {
		int iZ = indexZombie(x, y);
		if(iZ != -1) {
			this.restarLife(iZ);
		}
	}
	
	public void restarLife(int index){
		zombieList.get(index).setHp(zombieList.get(index).getHp()-1);
	}
	
	public void update(){
		for(int i = 0; i < zombieList.size(); ++i){
			zombieList.get(i).update();
		}
	}

}
