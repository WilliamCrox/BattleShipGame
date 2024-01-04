/**
 * This class constructs ships. It's the super class for the classes Ship1,Ship2,Ship3,Ship4
 * and Ship5. It has methods to check if a ship is sunk, it can set a ship as sunk and each
 * ship has its own lives, depends on its length, and every time a ship is being hit, a live
 * it's taken.
 * 
 * @author Ken Liam
 * @date 01/01/2024
 *
 */
public class Ship {
	protected char shipID;
	protected int size;
	protected int livesLeft;
	protected boolean isSunk;

	/**
	 * This is the default constructor of the class. It sets the boolean attribute
	 * isSunk as false,every time a new ship is being constructed.
	 */
	public Ship() {
		this.isSunk = false;
	}

	/**
	 * Getter method for the ship name/number
	 * @return shipID
	 */
	public char getID() {
		return shipID;
	}

	/**
	 * Getter method for the ship length
	 * @return size
	 */
	public int getSize() {
		return size;
	}

	/**
	 * Getter method for the lives left
	 * @return livesLeft
	 */
	public int getLivesLeft() {
		return livesLeft;
	}

	/**
	 * Getter method to know if the ship has sunk
	 * @return isSunk
	 */
	public boolean isSunk() {
		return isSunk;
	}

	/**
	 * Setter method to set the ship sunk
	 * @param sunk
	 */
	public void setSunk(boolean sunk) {
		isSunk = sunk;
	}

	/**
	 * Method that is called when the ship is being hit, it takes one live from the ship and
	 * if the ship has no lives left, is set as sunk.
	 */
	public void shipWasHit() {
		if (livesLeft == 0) {
			isSunk = true;
		}
		livesLeft--;
	}
}
