package tp.p1.PlantsVsZombies;

import java.util.ArrayList;

public class SunflowerList {
	
	private ArrayList<Sunflower> sunflowerList;
	private int cont;
	
	public SunflowerList() {
		sunflowerList = new ArrayList<Sunflower>();
		cont = 0;
	}
	
	public void add(int x, int y, Game game) {
		sunflowerList.add(cont, new Sunflower(x, y, game));
		this.cont++;
	}
	
	public void delete(int x, int y) { //Mirarlo bien
		sunflowerList.remove(this.cont);
		this.cont--;
	}
	
	public int getSize() {
		return sunflowerList.size();
	}
	
	public boolean isEmpty() {
		return sunflowerList.isEmpty();
	}
	
	
	

}
