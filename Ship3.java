/**
 * This class inherits from the Ship class. It's responsible for the ship that
 * has length=3.
 * 
 * @author Roy Faso
 * @date 01/01/2024
 *
 */
public class Ship3 extends Ship {

	/**
	 * The default constructor of the class. It inherits from the default constructor of
	 * Ship class and sets its own length, and lives depends on length.
	 */
	public Ship3() {
		shipID = '3';
		size = 3;
		livesLeft = size;
	}
	
}