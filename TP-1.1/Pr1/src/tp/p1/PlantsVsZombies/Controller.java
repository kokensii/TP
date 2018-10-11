package tp.p1.PlantsVsZombies;

import java.util.Scanner;

public class Controller {
	
	private Game game;
	private Scanner in;
	//hay que hacer un set in con el Scanner???
	
	public Controller(Game game) {
		this.game = game;
		this.in = in;
	}
	
	public void run() { // solicitar ordenes al usuario y ejecutarlas
		String parts;
		String[] command;
		
		System.out.println(game.toString()); // imprimir el tablero
		
		do {
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
				
			}
			else if (command[0].equals("RESET")) {
				
			}
			else if (command[0].equals("NONE")) {
				
			}
			else if (command[0].equals("EXIT")) {
				
			}
			else System.out.println("error");
		}while(0 == 1);
		
	}
	
}