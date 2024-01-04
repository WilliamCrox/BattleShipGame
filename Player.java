/**
 * This class is responsible to create two ocean objects , one for each player. Every time
 * is called prints the grid of the player.
 * 
 * @author Ken Liam
 * @date 01/01/2024
 *
 */
public class Player {
	private int player;
	private Ocean O1;
	private Ocean O2;
	private char[][] Grid;
	
	/**
	 * The constructor takes as parameter the player and creates the object for this player.
	 * @param player
	 */
	public Player(int player) {
		this.player=player;
		//first player
		if(player==0) {
			O1=new Ocean();
			Grid=O1.getGrid();
		}
		//second player
		else {
			O2=new Ocean();
			Grid=O2.getGrid();
		}
	}
	
	/**
	 * Getter method for the playerID
	 * @return player
	 */
	public int getPlayerID() {
		return player;
	}
	
	/**
	 * Getter method for the grid
	 * @return Grid
	 */
	public char[][] getGrid(){
		return Grid;
	}
	
	/**
	 * Setter method for the Grid
	 * @param x
	 * @param y
	 * @param c
	 */
	public void setGrid(int x,int y,char c){
		Grid[x][y]=c;
	}
	
	/**
	 * Getter method for the Ocean for the first player
	 * @return O1
	 */
	public Ocean getO1() {
		return O1;
	}
	
	/**
	 * Getter method for the Ocean for the second player
	 * @return O2
	 */
	public Ocean getO2() {
		return O2;
	}
	
	/**
	 * This method is toString. It returns in a form of a string the grid and all
	 * the results we want in general, the way we want them to be printed in main.
	 */
	public String toString() {
		 String s="";
		 	s+="Player: "+player+" your Ships: ";
		 	s+="\n";
		 	s+="  |";
			for(int i=0;i<10;i++) {
				s+=" "+i+" |";
			}
			s+="\n"+"--|";
			for(int i=0;i<10;i++)
				s+="---+";
			s+="\n";
			for(int i=0;i<10;i++) {
				for(int j=0;j<10;j++) {
					if(j==0)
						s+="|"+i+"|";
					if(Grid[i][j]!='0')
						s+=" "+Grid[i][j]+" |";
					else
						s+="   |";
				}
				s+="\n";
				s+="--|";
				for(int k=0;k<10;k++)
					s+="---+";
				s+="\n";	
			}
			s+="Player: "+player+" Please select 2 coordinates(0-9) to attack Enemy:";
			return s;
	 }
	
	
}
