import java.util.*;
import java.io.File;
import java.io.IOException;

public class Runner {
  static Scanner userIntInput = new Scanner(System.in);
  static String currentPlayer = "";
  static ArrayList<Property> player1Owns = new ArrayList<Property>();
  static Player player1 = new Player(1500, "name", player1Owns, false, false);
  static ArrayList<Property> player2Owns = new ArrayList<Property>();
  static Player player2 = new Player(1500, "name", player2Owns, false, false);
  static ArrayList<Property> board = new ArrayList<Property>();
  static int input = 0;

  public static void main(String[] args) throws IOException 
	  {
	    fillBoard();
	    beginGame();
	  }

  public static void fillBoard() throws IOException 
	  {
	    System.out.println("What board would you like to play on?\n  1) Original\n  2) Fallout");
	    input = userIntInput.nextInt();
	
	    if (input == 1) 
	    	{
	    		Scanner originalBoard = new Scanner(new File("Original Board"));
	
	    		while (originalBoard.hasNext()) 
	    			{
	    				String type = originalBoard.next();
	
				        if (type.equals("Street")) 
				        	{
					          String name = originalBoard.next();
					          int price = originalBoard.nextInt();
					          String owner = originalBoard.next();
					          String color = originalBoard.next();
					          boolean owned = originalBoard.nextBoolean();
					          int rent = originalBoard.nextInt();
					          int h1 = originalBoard.nextInt();
					          int h2 = originalBoard.nextInt();
					          int h3 = originalBoard.nextInt();
					          int h4 = originalBoard.nextInt();
					          int hotel = originalBoard.nextInt();
				
					          board.add(new Street(name, price, owner, color, owned, rent, h1, h2, h3, h4, hotel));
				        	} 
				        
				        else if (type.equals("CommunityChest")) 
				        	{
					        	String name = originalBoard.next();
						        board.add(new CommunityChest(name));
				        	}
				        else if(type.equals("Go"))
				        	{
				        		String name = originalBoard.next();
				        		board.add(new Go(name));
				        	}
				        else if(type.equals("Chance"))
				        	{
				        		String name = originalBoard.next();
				        		board.add(new Chance(name));
				        	}
				        else if(type.equals("Jail"))
				        	{
				        		String name = originalBoard.next();
				        		board.add(new Jail(name));
				        	}
				        else if(type.equals("GoToJail"))
				        	{
				        		String name = originalBoard.next();
				        		board.add(new GoToJail(name));
				        	}
				        else if (type.equals("Utility")) 
				        	{
					          String name = originalBoard.next();
					          int price = originalBoard.nextInt();
					          String owner = originalBoard.next();
					          boolean owned = originalBoard.nextBoolean();
					          int rent = originalBoard.nextInt();
					
					          board.add(new Utility(name, price, owner, owned, rent));
				        	} 
				        else
				        	{
					          String n = originalBoard.next();
					          int p = originalBoard.nextInt();
	
					          board.add(new Tax(n,p));
				        	}
	
	    			}

	    		} 
	    else 
	    	{
	    		Scanner falloutBoard = new Scanner(new File("Fallout Board"));

	    		while (falloutBoard.hasNext()) 
	    			{
	    			String type = falloutBoard.next();

			        if (type.equals("Street")) 
			        	{
				          String name = falloutBoard.next();
				          int price = falloutBoard.nextInt();
				          String owner = falloutBoard.next();
				          String color = falloutBoard.next();
				          boolean owned = falloutBoard.nextBoolean();
				          int rent = falloutBoard.nextInt();
				          int h1 = falloutBoard.nextInt();
				          int h2 = falloutBoard.nextInt();
				          int h3 = falloutBoard.nextInt();
				          int h4 = falloutBoard.nextInt();
				          int hotel = falloutBoard.nextInt();
				
				          board.add(new Street(name, price, owner, color, owned, rent, h1, h2, h3, h4, hotel));
			        	} 
			        else if (type.equals("CommunityChest") || type.equals("Go") || type.equals("Chance") || type.equals("Jail") || type.equals("GoToJail")) 
			        	{
			        		String name = falloutBoard.next();

					        switch (type) 
					        	{
					            case "CommunityChest":
					              board.add(new CommunityChest(name));
					              break;
					            case "Go":
					              board.add(new Go(name));
					              break;
					            case "Chance":
					              board.add(new Chance(name));
					              break;
					            case "Jail":
					              board.add(new Jail(name));
					              break;
					            case "GoToJail" : board.add(new GoToJail(name));
					              break;
					          	}
			        	} 
			        else if (type.equals("Utility")) 
			        	{
				          String name = falloutBoard.next();
				          int price = falloutBoard.nextInt();
				          String owner = falloutBoard.next();
				          boolean owned = falloutBoard.nextBoolean();
				          int rent = falloutBoard.nextInt();

				          board.add(new Utility(name, price, owner, owned, rent));
			        	} 
			        else
			        	{
			        		String n = falloutBoard.next();
			        		int p = falloutBoard.nextInt();

			        		board.add(new Tax(n,p));
			        	}
	    			}
	    	}

	  }

  public static void beginGame() 
	  {
//	    for(Property p : board)
//	      {
//	        System.out.println(p);
//	      }
		  rollDice();
	  }
  
  public static void rollDice()
  {
	  
  }
}
