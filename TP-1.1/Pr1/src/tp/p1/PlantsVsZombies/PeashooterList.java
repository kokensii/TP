package tp.p1.PlantsVsZombies;

import java.util.ArrayList;

public class PeashooterList {
	
	private ArrayList<Peashooter> peashooterList;
	private int cont;
	
	public PeashooterList() {
		peashooterList = new ArrayList<Peashooter>();
		cont = 0;
	}
	
	public void add(int x, int y, Game game) {
		peashooterList.add(cont, new Peashooter(x, y, game));
		this.cont++;
	}
	
	public void delete(int x, int y) { //Mirarlo bien
		peashooterList.remove(this.cont);
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
	
	//add
	
	//LOS METODOS O MOVIMIENTOS DE LOS ARRAYS DONDE VAN?
	

	

}
