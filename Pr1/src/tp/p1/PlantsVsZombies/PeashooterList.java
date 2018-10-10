package tp.p1.PlantsVsZombies;

import java.util.ArrayList;

public class PeashooterList {
	
	private ArrayList<Peashooter> peashooterList;
	private int cont;
	
	public PeashooterList(Game game) {
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
	
	//LOS METODOS O MOVIMIENTOS DE LOS ARRAYS DONDE VAN?
	

}
