package tp.p1.PlantsVsZombies;

import java.util.ArrayList;

public class SunflowerList {
	
	private ArrayList<Sunflower> sunflowerList;
	private int cont;
	
	public SunflowerList() {
		sunflowerList = new ArrayList<Sunflower>();
		cont = 0;
	}
	
	public void add(Sunflower s) {
		sunflowerList.add(s);
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
	
	public boolean isSunflower(int x, int y) {
		boolean isS = false;
		for(int i = 0; i < sunflowerList.size() && !isS; ++i) {
			if(sunflowerList.get(i).getX() == x && sunflowerList.get(i).getY() == y) isS = true;
		}
		return isS;
	}
	

}
