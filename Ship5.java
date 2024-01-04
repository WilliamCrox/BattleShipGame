/**
 * This class inherits from the Ship class. It's responsible for the ship that
 * has length=2.
 * 
 * @author Roy Faso
 * @date 01/01/2024
 *
 */
public class Ship5 extends Ship {

	/**
	 * The default constructor of the class. It inherits from the default constructor of
	 * Ship class and sets its own length, and lives depends on length.
	 */
	public Ship5() {
		shipID = '5';
		size = 2;
		livesLeft = size;
	}
	
}