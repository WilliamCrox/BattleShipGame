/**
 * The main creates a Game type object and calls the start method to start the game.
 * 
 * @author William Crox
 * @date 01/01/2024
 *
 */
public class Main {

	public static void main(String[] args) {
       System.out.println("Welcome, you need choose if you want your ships to be initialised");
		System.out.println("1.randomly or 2.customly:");
		System.out.println("Please press 1 of you want the first option and 2 if you want the second one.");

		Scanner scan = new Scanner(System.in);
		String option = scan.nextLine();
		while (!option.equals("1") && !option.equals("2")) {
			System.out.println("Wrong input, please try again:");
			option = scan.nextLine();
		}

		System.out.println("Excellent choice!!!");

		Game game;

		switch (option) {
		case "1":
			game = new Game();
			game.start();
			break;

		case "2":
			game = new Game(true);
			game.start();
			break;
		}
	}

	
}
