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
	
	public void delete(int index) { //Mirarlo bien
		sunflowerList.remove(index);
		this.cont--;
	}
	
	public void restarLife(int index){
		sunflowerList.get(index).setHp(sunflowerList.get(index).getHp()-1);
	}
	
	public int indexSunflower(int x, int y){
		int isP = -1;
		for(int i = 0; i < sunflowerList.size() && isP == -1; ++i){
			if(sunflowerList.get(i).getX() == x && sunflowerList.get(i).getY() == y) isP = i;
		}
		return isP;
	}
	
	public Sunflower geetSunflower(int index){
		return this.sunflowerList.get(index);
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
	
	public void update(){
		for(int i = 0; i < sunflowerList.size(); ++i){
			sunflowerList.get(i).update();
		}
	}

}
