package tp.p1.PlantsVsZombies;

import java.util.Random;
import java.util.Scanner;

public class PlantsVsZombies {
	
	public static void main(String[] args) {
		//System.out.println("HOLA");
		//Comparar el nivel con un equals para ver a que nivel entrar
		//Mirar que no haya más argumentos que 2 y menos que 1
		//La semilla hay que convertirla en un entero
		//Si no hay semilla se genera con el Random
		//Necesitamos usar la clase Level
		//A partir de aquí mirar el run() del Controller
		//Creamos el Game pasando el nivel y la semilla
		//Crear el controller pasandole el Game
		//Puedes meter el Scanner aquí o en el Controller
		//controller.run()
		Level level = null;
		Random rand;
		long seed;
		Game game;
		Controller controller;
		Scanner in; // USAR AQUI?
		
		
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
			controller = new Controller(game); // pasar el scanner o hacerlo en controller 
			controller.run();
		}
	}

}
