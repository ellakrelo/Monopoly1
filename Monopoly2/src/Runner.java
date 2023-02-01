import java.util.*;

public class Runner
	{
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
			

			
		}
		
		public static void beginGame()
		{
			
		}
	}
