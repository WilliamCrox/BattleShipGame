/**
 * This class inherits from the Ship class. It's responsible for the ship that
 * has length=5.
 * 
 * @author Roy Faso
 * @date 01/01/2024
 *
 */
public class Ship1 extends Ship {

	/**
	 * The default constructor of the class. It inherits from the default constructor of
	 * Ship class and sets its own length, and lives depends on length.
	 */
	public Ship1() {
		shipID = '1';
		size = 5;
		livesLeft = size;
	}

}
