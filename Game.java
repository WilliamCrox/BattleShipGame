import java.util.Scanner;

/**
 * Each player holds a grid of 10x10 squares that represents the sea, and on which 
 *places a total of five ships (which make up its fleet).
 *The pieces of ships have a width of one square of the grid and various lengths and 
 *represent different types of warships, such as aircraft carriers, warships 
 *and submarines.
 *Each player's fleet consists of 5 types of ships (Aircraft Carrier, Destroyer, Frigate, 
 *Corveta, Submarine) the lengths of which are 5, 4, 3, 3 and 2.
 *At the beginning (game adjustment phase), ships must be placed horizontally or vertically in the 
 *grid. 
 *After each player accidentally placing his ships on his grid, the game begins. At 
 *this point, each player does not know where the other player has placed his ships.
 *Players make rotational "shots" at the other player's grid, selecting a seat in the 
 *grid. The attacking player must disclose (announce) if one of their ships 
 *is in the grid position where the other player shoots. When a ship is hit at all 
 *Its squares, then it is considered that it was destroyed.Players take turns to attack the 
 *to each other until one player has lost all their ships, in which case the other player wins the 
 *Battle.
 * 
 * @author William Crox
 * @date 01/01/2024
 *
 */
public class Game {

	private Player player0;
	private Player player1;
	private char[][] Grid0;
	private char[][] Grid1;
	private AttackOpponent A;

	/**
	 * The default constructor creates the two players objects, and get the grids of each
	 * player.
	 */
	public Game() {
		player0 = new Player(0);
		Grid0 = player0.getGrid();
		player1 = new Player(1);
		Grid1 = player1.getGrid();
	}

	//this constuctor is for the custom initialisation option
	public Game(boolean customGrid) {
			player0 = new Player(0,true);
			Grid0 = player0.getGrid();
			player1 = new Player(1,true);
			Grid1 = player1.getGrid();
		}
	
	/**
	 * Method to check for valid input
	 * 
	 * @param s
	 * @return true if valid
	 */
	public boolean checkInput(String s) {
		if (s.length() != 3 || s.charAt(1) != ' ' || s.charAt(0) < '0' || s.charAt(0) > '9' || s.charAt(2) < '0'
				|| s.charAt(2) > '9') {
			return false;
		}
		return true;
	}

	/**
	 * This method is called from main to play the game. Each player selects coordinates to
	 * attack the opponent. The game is on until one player looses all his ships, or press
	 * exit.
	 */
	public void start() {
		System.out.println("Welcome to the Battleship game!");
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		//boolean variable to check winner
		boolean checkWinner = false;
		//boolean variable to check if the input is valid
		boolean checkInput = false;
		String input;
		int x;
		int y;
		//player variable, 0 or 1
		int plr = 0;
		Scanner scan = new Scanner(System.in);

		//end when a winner is found
		while (!checkWinner) {
			if(plr==0) {
			System.out.println();
			System.out.println(player0);
			input = scan.nextLine();
			
			checkInput = false;
			//end game
			if (input.equals("exit")) {
				System.exit(0);
			}
			checkInput = checkInput(input);

			//read until is valid
			while (!checkInput) {
				System.out.println("Wrong input, give again: ");
				input = scan.nextLine();
				checkInput = checkInput(input);
				//end game
				if (input.equals("exit")) {
					System.exit(0);
				}
			}
			x = input.charAt(0) - '0';
			y = input.charAt(2) - '0';
			A = new AttackOpponent(x, y, Grid1, player1);
			if (A.checkIfHit()) {
				if (A.checkIfSunk()) {
					System.out.println("You just sunk a ship!");
					if (player1.getO2().getShip1().isSunk() && player1.getO2().getShip2().isSunk()
							&& player1.getO2().getShip3().isSunk() && player1.getO2().getShip4().isSunk()
							&& player1.getO2().getShip5().isSunk())
						checkWinner = true;
				} else {
					Grid1 = A.getGrid();
					System.out.println("HIT!");
				}
			} else
				System.out.println("MISS!");
			}
			
			else if(plr==1) {
			System.out.println();
			System.out.println(player1);
			input = scan.nextLine();
			
			checkInput = false;
			if (input.equals("exit")) {
				System.exit(0);
			}
			checkInput = checkInput(input);

			//read until is valid
			while (!checkInput) {
				System.out.println("Wrong input, give again: ");
				input = scan.nextLine();
				checkInput = checkInput(input);
				//end game
				if (input.equals("exit")) {
					System.exit(0);
				}
			}
			
			x = input.charAt(0) - '0';
			y = input.charAt(2) - '0';
			A = new AttackOpponent(x, y, Grid0, player0);
			if (A.checkIfHit()) {
				if (A.checkIfSunk()) {
					System.out.println("You just sunk a ship!");
					if (player0.getO1().getShip1().isSunk() && player0.getO1().getShip2().isSunk()
							&& player0.getO1().getShip3().isSunk() && player0.getO1().getShip4().isSunk()
							&& player0.getO1().getShip5().isSunk())
						checkWinner = true;

				} else {
					Grid0 = A.getGrid();
					System.out.println("HIT!");
				}
			} else
				System.out.println("MISS!");
			}
			if(!checkWinner)
			plr = Math.abs(plr - 1);
		}
		System.out.println();
		System.out.print("THE WINNER IS THE:"+plr);
		scan.close();
	}
}
