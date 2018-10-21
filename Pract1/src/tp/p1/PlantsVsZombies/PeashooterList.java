package tp.p1.PlantsVsZombies;

import java.util.ArrayList;

public class PeashooterList {
	
	private ArrayList<Peashooter> peashooterList;
	private int cont;
	
	public PeashooterList() {
		peashooterList = new ArrayList<Peashooter>();
		cont = 0;
	}
	
	public void add(Peashooter p) {
		peashooterList.add(p);
		this.cont++;
	}
	
	public void delete(int index) { //Mirarlo bien
		peashooterList.remove(index);
		this.cont--;
	}
	
	public int getSize() {
		return peashooterList.size();
	}
	
	public boolean isEmpty() {
		return peashooterList.isEmpty();
	}
	
	public boolean isPeashooter(int x, int y) {
		boolean isP = false;
		for(int i = 0; i < peashooterList.size() && !isP; ++i) {
			if(peashooterList.get(i).getX() == x && peashooterList.get(i).getY() == y) isP = true;
		}
		return isP;
	}
	
	public void restarLife(int index){
		peashooterList.get(index).setHp(peashooterList.get(index).getHp()-1);
	}
	
	public Peashooter getPeashooter(int index){
		return this.peashooterList.get(index);
	}
	
	public int indexPeashooter(int x, int y){
		int isP = -1;
		for(int i = 0; i < peashooterList.size() && isP == -1; ++i){
			if(peashooterList.get(i).getX() == x && peashooterList.get(i).getY() == y) isP = i;
		}
		return isP;
	}
	
	public void restarVidaPeashooter(int x, int y) {
		int iZ = indexPeashooter(x, y);
		if(iZ != -1) {
			peashooterList.get(iZ).setHp(peashooterList.get(iZ).getHp()-1);
		}
	}
	
	public void update(){
		for(int i = 0; i < peashooterList.size(); ++i){
			peashooterList.get(i).update();
		}
	}
	
}
