import java.util.*;

public class Runner
	{
		static Scanner userIntInput = new Scanner(System.in);
		static String currentPlayer = "";
		static ArrayList<Property> player1Owns = new ArrayList<Property>();
		static Player player1 = new Player(1500, "name", player1Owns, false, false);
		static ArrayList<Property> player2Owns = new ArrayList<Property>();
		static Player player2 = new Player(1500, "name", player2Owns, false, false);
		static ArrayList<Property> originalBoard = new ArrayList<Property>();
		
		public static void main(String[] args)
			{
				fillBoard();
				beginGame();
			}
		
		public static void fillBoard()
		{
			System.out.println("What board would you like to play on?\n1) Original\n2) put other board here");
			int input = userIntInput.nextInt();

			
		}
		
		public static void beginGame()
		{
			
		}
	}
