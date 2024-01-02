/**
 * This class is called every time a player chooses coordinates to attack.
 * If the coordinates are hitting an enemy ship, then it changes the grid with an 'H'
 * in that position. It checks if the shot hit, miss or even sunk a ship in the opponents
 * grid.
 *   
 * @author William Crox
 * @date 01/01/2024
 *
 */
public class AttackOpponent {
	private int x;
	private int y;
	private char[][] Grid;
	private Player p;
	private boolean check;
	private char pos;

	/**
	 * The constructor initialises the attributes
	 * {@link Player}
	 * @param x
	 * @param y
	 * @param Grid
	 * @param p
	 */
	public AttackOpponent(int x, int y, char[][] Grid, Player p) {
		this.Grid = Grid;
		this.p = p;
		this.x=x;
		this.y=y;
		check = false;
	}

	/**
	 * Method to check if the coordinates hit a target, and does the necessary process 
	 * @return true if hit
	 */
	public boolean checkIfHit() {
		if (Grid[x][y] == '1' || Grid[x][y] == '2' || Grid[x][y] == '3' || Grid[x][y] == '4' || Grid[x][y] == '5') {
			pos=Grid[x][y];
			Grid[x][y]='H';
			switch (pos) {
			case '1':
				if (p.getPlayerID() == 0) {
					p.getO1().getShip1().shipWasHit();
					if(p.getO1().getShip1().livesLeft==0) {
						p.getO1().getShip1().setSunk(true);
						check=true;
					}
				} else {
					p.getO2().getShip1().shipWasHit();
					if(p.getO2().getShip1().livesLeft==0) {
						p.getO2().getShip1().setSunk(true);
						check=true;
					}
				}
				break;
			case '2':
				if (p.getPlayerID() == 0) {
					p.getO1().getShip2().shipWasHit();
					if(p.getO1().getShip2().livesLeft==0) {
						p.getO1().getShip2().setSunk(true);
						check=true;
					}
				} else {
					p.getO2().getShip2().shipWasHit();
					if(p.getO2().getShip2().livesLeft==0) {
						p.getO2().getShip2().setSunk(true);
						check=true;
					}
				}
				break;
			case '3':
				if (p.getPlayerID() == 0) {
					p.getO1().getShip3().shipWasHit();
					if(p.getO1().getShip3().livesLeft==0) {
						p.getO1().getShip3().setSunk(true);
						check=true;
					}
				} else {
					p.getO2().getShip3().shipWasHit();
					if(p.getO2().getShip3().livesLeft==0) {
						p.getO2().getShip3().setSunk(true);
						check=true;
					}
				}
				break;
			case '4':
				if (p.getPlayerID() == 0) {
					p.getO1().getShip4().shipWasHit();
					if(p.getO1().getShip4().livesLeft==0) {
						p.getO1().getShip4().setSunk(true);
						check=true;
					}
				} else {
					p.getO2().getShip4().shipWasHit();
					if(p.getO2().getShip4().livesLeft==0) {
						p.getO2().getShip4().setSunk(true);check=true;
					}
				}
				break;
			case '5':
				if (p.getPlayerID() == 0) {
					p.getO1().getShip5().shipWasHit();
					if(p.getO1().getShip5().livesLeft==0) {
						p.getO1().getShip5().setSunk(true);
						check=true;
					}
				} else {
					p.getO2().getShip5().shipWasHit();
					if(p.getO2().getShip5().livesLeft==0) {
						p.getO2().getShip5().setSunk(true);
						check=true;
					}
				}
				break;
			}
			return true;
		}
		return false;
	}
	
	/**
	 * Getter method for Grid
	 * @return Grid
	 */
	public char[][] getGrid(){
		return Grid;
	}
	
	/**
	 * Method to check if sunk
	 * @return true if sunk
	 */
	public boolean checkIfSunk() {
		if(check)
			return true;
		return false;
	}
}
