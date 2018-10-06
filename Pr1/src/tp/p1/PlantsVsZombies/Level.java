package tp.p1.PlantsVsZombies;

public enum Level{
	/*EASY(3, 0.1), HARD(5, 0.2), INSANE(10, 0.3);
	
	private int numZombies;
	private double frequency;
	
	private Level(int num, double f) {
		this.numZombies = num;
		this.frequency = f;
	}

	public int getNumZombies() {
		return numZombies;
	}

	public double getFrequency() {
		return frequency;
	}*/
	
	//Los cambios que ha dado hoy el profesor
	EASY, HARD, INSANE;
	
	public int getNumZombies(){
		int n;
		if(this == EASY) n = 3;
		else if(this == HARD) n = 5;
		else n = 10;
		return n;
	}
	
	public double getFrequency(){
		double f;
		if(this == EASY) f = 0.1;
		else if(this == HARD) f = 0.2;
		else f = 0.3;
		return f;
	}
}
