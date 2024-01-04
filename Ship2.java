/**
 * This class inherits from the Ship class. It's responsible for the ship that
 * has length=4.
 * 
 * @author Roy Faso
 * @date 01/01/2024
 *
 */
public class Ship2 extends Ship {

	/**
	 * The default constructor of the class. It inherits from the default constructor of
	 * Ship class and sets its own length, and lives depends on length.
	 */
	public Ship2() {
		shipID = '2';
		size = 4;
		livesLeft = size;
	}

}