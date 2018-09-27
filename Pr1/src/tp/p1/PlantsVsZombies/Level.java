package tp.p1.PlantsVsZombies;

public enum Level{
	EASY(3, 0.1), HARD(5, 0.2), INSANE(10, 0.3);
	
	private int numZombies;
	private double frequency;
	
	private Level(int num, double f) {
		this.numZombies = num;
		this.frequency = f;
	}

	public int getNumZombies() {
		return numZombies;
	}

	public void setNumZombies(int numZombies) {
		this.numZombies = numZombies;
	}

	public double getFrequency() {
		return frequency;
	}

	public void setFrequency(double frequency) {
		this.frequency = frequency;
	}
	
	
}
