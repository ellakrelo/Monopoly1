import java.util.*;

public class Runner
	{
		static String currentPlayer = "";
		static ArrayList<Property> player1Owns = new ArrayList<Property>();
		static Player player1 = new Player(1500, "name", player1Owns, false);
		static ArrayList<Property> player2Owns = new ArrayList<Property>();
		static Player player2 = new Player(1500, "name", player2Owns, false);
		static ArrayList<Property> originalBoard = new ArrayList<Property>();
		
		public static void main(String[] args)
			{
				fillBoard();

			}
		
		public static void fillBoard()
		{
			originalBoard.add(new Go("Go"));
			originalBoard.add(new Street("Mediteranean", 60, null, "brown", false, 2));
			//originalBoard.add(new CommunityChest("Community Chest"));
			originalBoard.add(new Street("Baltic Avenue", 60, null, "brown", false, 4));
			//originalBoard.add(new Tax("Income Tax", 200));
			originalBoard.add(new Utility("Reading Railroad", 200, null, false));
			originalBoard.add(new Street("Oriental Avenue", 100, null, "light blue", false, 6));
			//originalBoard.add(new Chance("Chance"));
			originalBoard.add(new Street("Vermont Avenue", 100, null, "light blue", false, 6));
			originalBoard.add(new Street("Connecticut Avenue", 120, null, "light blue", false, 8));
			//originalBoard.add(new Jail("Jail");
			originalBoard.add(new Street("St. Charles Place", 140, null, "pink", false, 10));
			originalBoard.add(new Utility("Electric Company", 140, null,false));
			originalBoard.add(new Street("States Avenue", 140, null, "pink", false, 10));
			originalBoard.add(new Street("Virginia Avenue", 160, null, "pink", false, 12));
			originalBoard.add(new Utility("Pennsylvania Railroad", 140, null, false));
			originalBoard.add(new Street("St. James Place", 180, null, "orange", false, 14));
			//originalBoard.add(new CommunityChest("Community Chest"));
			originalBoard.add(new Street("Tennesee Avenue", 180, null, "orange", false, 14));
			originalBoard.add(new Street("New York Avenue", 200, null, "orange", false, 16));
			originalBoard.add(new Utility("Free Parking", 0, null, false));
			
			
			originalBoard.add(new Street("Pacific Avenue", 300, null, "green", false, 26));
			originalBoard.add(new Street("North Carolina Avenue", 300, null, "green", false, 26));
			
		}
	}
