package tp.p1.PlantsVsZombies;

import tp.p1.util.MyStringUtils;


public class GamePrinter{
	private int dimX; 
	private int dimY;
	private String[][] board;
	final String space = " ";
	
	public GamePrinter(Game game, int dimX, int dimY) {
		this.dimX = dimX;
		this.dimY = dimY;
		encodeGame(game);
	}
	
	private void encodeGame(Game game) {
		board = new String[dimX][dimY];
		for(int i = 0; i < dimX; i++) {
			for(int j = 0; j < dimY; j++) {
				board[i][j] =  game.pintarTablero(i, j);
			}
		}
	}
	
	public String toString() {

		int cellSize = 7;
		int marginSize = 2;
		String vDelimiter = "|";
		String hDelimiter = "-";
		
		String rowDelimiter = MyStringUtils.repeat(hDelimiter, (dimY * (cellSize + 1)) - 1);
		String margin = MyStringUtils.repeat(space, marginSize);
		String lineDelimiter = String.format("%n%s%s%n", margin + space, rowDelimiter);
		
		StringBuilder str = new StringBuilder();
		
		str.append(lineDelimiter);
		
		for(int i=0; i<dimX; i++) {
				str.append(margin).append(vDelimiter);
				for (int j=0; j<dimY; j++) {
					str.append( MyStringUtils.centre(board[i][j], cellSize)).append(vDelimiter);
				}
				str.append(lineDelimiter);
		}
		return str.toString();
	}
	
	public int getX(){
		return this.dimX;
	}
	
	public int getY(){
		return this.dimY;
	}
	
	public String[][] getBoard(){
		return this.board;
	}
}

/*public class GamePrinter {
private Game game;

// EN EL ENUNCIADO DICE QUE HAY UN METODO TO STRING, YO CREO QUE ES EL DRAW
public void draw(Game game) { 
	//ASI?
	String cadena;
	cadena = "Number of cycles: \n";
	cadena += "Sun coins: \n";
	cadena += "Remaining zombies: \n";
	
	//O ASI??
	System.out.println("Number of cycles: \n");
	System.out.println("Sun coins: \n");
	
	
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
}
}*/
