/**
 * This class creates the grid with the five ships for one player. It checks each ship if is being
 * initialised at a valid position and if not it changes its position until is valid,
 * with the help of the Coordinates.
 * 
 * @author Ken Liam
 * @date 01/01/2024
 *
 */
public class Ocean {

	private char[][]Grid;
	private Ship1 ship1;
	private Ship2 ship2;
	private Ship3 ship3;
	private Ship4 ship4;
	private Ship5 ship5;
	private Coordinates P;
	
	/**
	 * The default constructor of the class. It initialises the 10x10 grid with the
	 * character '0'. After that, it initialises the five ships.
	 */
	public Ocean() {
		Grid=new char[10][10];
		for(int i=0;i<10;i++)
			for(int j=0;j<10;j++)
				Grid[i][j]='0';
		
		ship1=new Ship1();
		initializeShip(ship1);
		ship2=new Ship2();
		initializeShip(ship2);
		ship3=new Ship3();
		initializeShip(ship3);
		ship4=new Ship4();
		initializeShip(ship4);
		ship5=new Ship5();
		initializeShip(ship5);

	}
	
	/**
	 * Getter method for ship1
	 * @return ship1
	 */
	public Ship1 getShip1() {
		return ship1;
	}
	
	/**
	 * Getter method for ship2
	 * @return ship2
	 */
	public Ship2 getShip2() {
		return ship2;
	}
	
	/**
	 * Getter method for ship3
	 * @return ship3
	 */
	public Ship3 getShip3() {
		return ship3;
	}
	
	/**
	 * Getter method for ship4
	 * @return ship4
	 */
	public Ship4 getShip4() {
		return ship4;
	}
	
	/**
	 * Getter method for ship5
	 * @return ship5
	 */
	public Ship5 getShip5() {
		return ship5;
	}
	
	/**
	 * This method is responsible to check if the ship position is valid, if not it
	 * uses the Coordinates classes to get new position until is valid
	 * {@link Ship}
	 * @param sh
	 */
	public void initializeShip(Ship sh) {
		//length
		int length=sh.getSize();
		//new coordinates
		P=new Coordinates();
		int X=P.getX();
		int Y=P.getY();
		
		char c=sh.getID();
		//hor or ver variable
		int HorOrVer=(int)(Math.random()*2);
		if(HorOrVer==0) {
			boolean check=false;
			//check if the position is valid,else generate randomly new position until is valid
			while(check==false) {
				while(X<0||X>9||Y<0||Y>9||X+length>9||Y+length>9) {
					P=new Coordinates();
					X=P.getX();
					Y=P.getY();
				}
				int count=0;
				for(int k=X;k<X+length;k++) {
					if(Grid[k][Y]=='0')
						count++;
				}
				if(count==length)
					check=true;
				else {
					P=new Coordinates();
					X=P.getX();
				}
			}
			for(int i=X;i<X+length;i++)
				Grid[i][Y]=c;
		}
		
		//if vertical
		else {
			boolean check=false;
			//check if the position is valid,else generate randomly new position until is valid
			while(check==false) {
				while(X<0||X>9||Y<0||Y>9||X+length>9||Y+length>9) {
					P=new Coordinates();
					X=P.getX();
					Y=P.getY();
				}
				int count=0;
				for(int k=Y;k<Y+length;k++) {
					if(Grid[X][k]=='0')
						count++;
				}
				if(count==length)
					check=true;
				else {
					P=new Coordinates();
					Y=P.getY();
				}
			}
			for(int i=Y;i<Y+length;i++)
				Grid[X][i]=c;
		}
		
	}
	
	/**
	 * Getter method to return the grid array
	 * @return Grid
	 */
	public char[][] getGrid(){
		return Grid;
	}
	
}
