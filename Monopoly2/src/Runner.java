import java.util.*;
import java.io.File;
import java.io.IOException;

public class Runner
	{
		static Scanner userIntInput = new Scanner(System.in);
		static String currentPlayer = "";
		static ArrayList<Property> player1Owns = new ArrayList<Property>();
		static Player player1 = new Player(1500, "name", player1Owns, false, false);
		static ArrayList<Property> player2Owns = new ArrayList<Property>();
		static Player player2 = new Player(1500, "name", player2Owns, false, false);
		static ArrayList<Property> board = new ArrayList<Property>();
		
		public static void main(String[] args) throws IOException
			{
				fillBoard();
				beginGame();
			}
		
		public static void fillBoard() throws IOException
		{
			System.out.println("What board would you like to play on?\n1) Original\n2) Fallout");
			int input = userIntInput.nextInt();

			if(input == 0)
				{
					Scanner originalBoard = new Scanner(new File("Original Board"));
					
				}
			else
				{
					Scanner falloutBoard = new Scanner(new File("Fallout Board"));
				}

			
		}
		
		public static void beginGame()
		{
			
		}
	}
