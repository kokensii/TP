package tp.p1.PlantsVsZombies;

public class SuncoinManager { // clase que lleva el control de los suncoins 
	
	static final int SUNS = 50;
	private int sunCoins;
	
	
	public void initSuns() { //Inicializamos el numero de soles a 50, que son los predeterminados
		this.sunCoins = 50;
	}
	
	public int restarSoles(int sunCoinsQueRestar) {
		return this.sunCoins = this.sunCoins - sunCoinsQueRestar;
	}
	
	public int sumarSoles(int sunCoinsQueSumar) {
		return this.sunCoins = this.sunCoins + sunCoinsQueSumar;
	}
}
