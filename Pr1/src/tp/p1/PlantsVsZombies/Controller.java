package tp.p1.PlantsVsZombies;

import java.util.Scanner;

public class Controller {
	
	private Game game;
	private Scanner in;
	//hay que hacer un set in con el Scanner???
	
	public Controller(Game game) {
		this.game = game;
		this.in = new Scanner(System.in);
	}
	
	public void run() { // solicitar ordenes al usuario y ejecutarlas
		String parts;
		String[] command;
		
		 // imprimir el tablero
		boolean salir = true;
		
		do {
			System.out.println(game.toString());
			System.out.println("Command >");
			parts = this.in.nextLine();
			parts = parts.toUpperCase();
			command = parts.split(" ");
			
			if(command[0].equals("HELP")) {
				System.out.println("Add <plant> <x> <y>: Adds a plant in position x, y.\r\n" + 
						"List: Prints the list of available plants.\r\n" + 
						"Reset: Starts a new game.\r\n" +
						"Help: Prints this help message.\r\n" +
						"Exit: Terminates the program.\r\n" + 
						"[none]: Skips cycle.\r\n");
			}
			else if(command[0].equals("LIST")) {
				System.out.println("[S]unflower: Cost: 20 suncoins Harm: 0\r\n" + 
						"[P]eashooter: Cost: 50 suncoins Harm: 1");
			}
			else if (command[0].equals("ADD")) {
				/*Este es un comando para añadir una nueva planta de tipo
				plant en la casilla x, y. Obviamente el usuario solo podrá añadir una planta por ciclo
				si tiene el número suficiente de soles. No podrá añadir una planta en una casilla
				ocupada por otra planta o por un zombi.*/
				if(command.length != 4)System.out.println("ERROR en el número de comandos");
				else{
					//comprobar que x e y esten dentro de los rangos y que las posiciones no esten llenas
					int x = Integer.parseInt(command[2]);
					int y = Integer.parseInt(command[3]);
					if(command[1].equalsIgnoreCase("sunflower") || command[1].equalsIgnoreCase("s")){
						Sunflower s = new Sunflower(x,y,game);
						game.getSunfloweList().add(s);;
						System.out.println(game.sunflowerList.getSize());
					}
					else if(command[1].equalsIgnoreCase("peashooter") || command[1].equalsIgnoreCase("p")){
						Peashooter p = new Peashooter(x, y, game);
						game.getPeashooterList().add(p);
					}
					else{
						System.out.println("ERROR tipo de planta no válido");
					}
				}
			}
			else if (command[0].equals("RESET")) {
				//Este comando permite reiniciar la partida, llevando al juego a la configuración
				//inicial.
				//borrar el juego llamando al game para que cree un nuevo juego?
				
				
			}
			else if (command[0].equals("NONE")) {
				//El usuario no realiza ninguna acción.

				
			}
			else if (command[0].equals("EXIT")) {
				//Este comando permite salir de la aplicación, mostrando previamente el mensaje
				//“Game Over”.
				salir = false;
				
			}
			else System.out.println("error");
		}while(salir);
		
	}
	
}
