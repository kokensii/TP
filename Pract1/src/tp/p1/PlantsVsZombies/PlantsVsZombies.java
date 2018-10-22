package tp.p1.PlantsVsZombies;

import java.util.Random;

public class PlantsVsZombies {
	
	public static void main(String[] args) {
		Level level = null;
		Random rand;
		long seed;
		Game game;
		Controller controller;
		
		if((args.length < 1) || (args.length > 2)){
			System.out.println("ERROR al introducir los argumentos");
		}
		else{
			if(args[0].equals("EASY")) level = Level.EASY;
			else if(args[0].equals("HARD")) level = Level.HARD;
			else if(args[0].equals("INSANE")) level = Level.INSANE;
			
			if(args.length == 2)
				seed = Integer.parseInt(args[1]); //Pasado el string a int
			else{
				seed = new Random().nextInt(1000);
			}
			rand = new Random(seed);
			game = new Game(level, rand);
			controller = new Controller(game);
			controller.run();
		}
	}

}
