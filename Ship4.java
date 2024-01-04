/**
 * This class inherits from the Ship class. It's responsible for the ship that
 * has length=3.
 * 
 * @author Roy Faso
 * @date 01/01/2024
 *
 */
public class Ship4 extends Ship {

	/**
	 * The default constructor of the class. It inherits from the default constructor of
	 * Ship class and sets its own length, and lives depends on length.
	 */
	public Ship4() {
		shipID = '4';
		size = 3;
		livesLeft = size;
	}
	
}