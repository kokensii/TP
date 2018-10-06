package tp.p1.PlantsVsZombies;

public class GamePrinter {
	private Game game;
	
	
	// EN EL ENUNCIADO DICE QUE HAY UN METODO TOSTRING, YO CREO QUE ES EL DRAW
	public String draw(Game game) {
		String str = null; // hay que usar algo asi aunque no se si se devuelve str o void 
		System.out.println("Number of cycles: ");
		System.out.println("Sun coins: ");
		System.out.println("Remaining zombies: \n");
		
		System.out.println("-------------------------------------------------------------------------");
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 9; j++) {
				if(j==8) {
					System.out.print(" S [1] |");// mirar bien como pintarlo 
				}else if(j==0) {
					System.out.print("| S [1] |");
				}else {
					System.out.print(" S [1] |");
				}

			}
			System.out.println();
			System.out.println("-------------------------------------------------------------------------");		
		
		}
		
		System.out.println("\nCommand >");
		return str; 
	}
}
