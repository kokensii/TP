package tp.p1.PlantsVsZombies;

import java.util.Scanner;

public class Controller {
	
	private Game game;
	private Scanner in;
	
	static final int SUNFLOWER = 20;
	static final int PEASHOOTER = 50;
	
	public Controller(Game game) {
		this.game = game;
		this.in = new Scanner(System.in);
	}
	
	public void run() { // solicitar ordenes al usuario y ejecutarlas
		String parts;
		String[] command;
		
		// imprimir el tablero
		System.out.println(game.toString());
		boolean salir = true;
		System.out.println("Number of cycles: " + game.getContCycles());
		System.out.println("Sun coins: " + game.getSuncoins().getSunCoins());
		System.out.println("Remaining zombies: " + game.getZombies().getNumZombies());
		System.out.println("Command >");
		parts = this.in.nextLine();
		parts = parts.toUpperCase();
		command = parts.split(" ");
		
		do {			
			if(command[0].equals("HELP")) {
				System.out.println("Add <plant> <x> <y>: Adds a plant in position x, y.\r\n" + 
						"List: Prints the list of available plants.\r\n" + 
						"Reset: Starts a new game.\r\n" +
						"Help: Prints this help message.\r\n" +
						"Exit: Terminates the program.\r\n" + 
						"[none]: Skips cycle.\r\n");
				System.out.println(game.toString());
			}
			else if(command[0].equals("LIST")) {
				System.out.println("[S]unflower: Cost: 20 suncoins Harm: 0\r\n" + 
						"[P]eashooter: Cost: 50 suncoins Harm: 1");
				System.out.println(game.toString());
			}
			else if (command[0].equals("ADD")) {
				if(command.length != 4)System.out.println("ERROR en el número de comandos");
				else{
					// Booleano que comprueba el tercer y cuarto comando para evitar una excepción en caso de introducir uno o varios caracteres no numericos
					boolean isdigit = true;
					for (char c : command[2].toCharArray()) {
						if(!Character.isDigit(c)) {
							isdigit = false;
						}
					} 
					if(isdigit == true) {
						for (char c : command[3].toCharArray()) {
							if(!Character.isDigit(c)) {
								isdigit = false;
							}
						} 
					}
					if(isdigit == true) {
						int x = Integer.parseInt(command[2]);
						int y = Integer.parseInt(command[3]);
						if(game.isEmpty(x, y)){
							if(command[1].equalsIgnoreCase("sunflower") || command[1].equalsIgnoreCase("s")){
								//comprobar que x e y esten dentro de los rangos
								if(x < 4 && y < 8) {
									if(game.getSuncoins().getSunCoins() >= SUNFLOWER){
										Sunflower s = new Sunflower(x,y,game);
										game.getSunfloweList().add(s);
										game.getSuncoins().restarSoles(SUNFLOWER);
										game.update();
									}else{
										System.out.println("Aviso: No tiene soles suficientes");
									}
								}
								else {
									System.out.println("Aviso: posicion fuera de rango");
								}
								System.out.println(game.toString());
							}
							else if(command[1].equalsIgnoreCase("peashooter") || command[1].equalsIgnoreCase("p")){
								//comprobar que x e y esten dentro de los rangos
								if(x < 4 && y < 8) {
									if(game.getSuncoins().getSunCoins() >= PEASHOOTER){
										Peashooter p = new Peashooter(x, y, game);
										game.getPeashooterList().add(p);
										game.getSuncoins().restarSoles(PEASHOOTER);
										game.update();
									}else{
										System.out.println("Aviso: No tienes soles suficientes");
									}
								}
								else{
										System.out.println("Aviso: posicion fuera de rango");
								}
								System.out.println(game.toString());
							}
							else{
								System.out.println("Error: tipo de planta no válido");
							}
							
						}else{
							System.out.println("Aviso: la posición introducida ya se encuentra ocupada");
						}
					}else {
						System.out.println("Error de comando, la posición no es numérica");
					}
				}
				
			}
			else if (command[0].equals("RESET")) {
				//Este comando permite reiniciar la partida, llevando al juego a la configuración
				//inicial.
				//borrar el juego llamando al game para que cree un nuevo juego?
				game.resetGame();
				System.out.println(game.toString());
				
			}
			else if (command[0].equals("NONE") || command[0].equals("N") ) {
				//El usuario no realiza ninguna acción.
				game.update();
				System.out.println(game.toString());
			}
			else if (command[0].equals("EXIT")) {
				salir = false;
			}
			else System.out.println("Error de comando");
			
			if(!game.loseGame() && !game.winGame() && salir) {
				System.out.println("Number of cycles: " + game.getContCycles());
				System.out.println("Sun coins: " + game.getSuncoins().getSunCoins());
				System.out.println("Remaining zombies: " + game.getZombies().getNumZombies());
				System.out.println("Command >");
				parts = this.in.nextLine();
				parts = parts.toUpperCase();
				command = parts.split(" ");
			}
			else {
				if(game.loseGame()) {
					System.out.println("HAS PERDIDO LO SENTIMOS \n");
				}
				else if(game.winGame()) {
					System.out.println("HAS GANADO EL JUEGO!! \n");
				}
				else 
					System.out.println("HASTA LUEGO, GRACIAS POR JUGAR \n");
			}
		}while(!game.loseGame() && !game.winGame() && salir);
	}
}
