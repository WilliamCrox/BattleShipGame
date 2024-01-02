/**
 * This class generates random coordinates(x,y) for the initial state of each ship
 * 
 * 
 * @author William Crox
 * @date 01/01/2024
 *
 */
public class Coordinates {
	private int x;
	private int y;
	
	/**
	 * This is the default and only constructor of the class coordinates,
	 * it generates randomly 2 integer numbers, from 0 to 9.
	 */
	public Coordinates() {
		x = (int) (Math.random() * 10);
		y = (int) (Math.random() * 10);
	}
	
	/**
	 * Getter method for the x coordinate
	 * 
	 * @return x coordinate
	 */
	public int getX() {
		return x;
	}
	
	/**
	 * Getter method for the y coordinate
	 * 
	 * @return y coordinate
	 */
	public int getY() {
		return y;
	}
}
