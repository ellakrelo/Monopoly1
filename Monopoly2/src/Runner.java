import java.util.*;
import java.io.File;
import java.io.IOException;

public class Runner {
  static Scanner userIntInput = new Scanner(System.in);
  static Scanner userInput = new Scanner(System.in);
  static String currentPlayer = "";
  static int playerLocation = 0;
  static String name = "";
  static ArrayList<Property> player1Owns = new ArrayList<Property>();
  static Player player1 = new Player(1500, "name", player1Owns, false, false);
  static ArrayList<Property> player2Owns = new ArrayList<Property>();
  static Player player2 = new Player(1500, "name", player2Owns, false, false);
  static ArrayList<Property> board = new ArrayList<Property>();
  static int input = 0;
  static Scanner originalBoard;

  public static void main(String[] args) throws IOException 
	  {
		welcome();
	    beginGame();
	  }

  public static void welcome() throws IOException 
  {
	  System.out.println("Welcome to Monopoly! What is your name?");
	  name = userInput.next();
	  System.out.println("Welcome " + name + "!");
	  System.out.println("What board would you like to play on?\n  1) Original\n  2) Fallout");
	  input = userIntInput.nextInt();
	  if (input == 1) 
	    	{
	    		originalBoard = new Scanner(new File("OriginalBoard.txt"));
	    		fillBoard();
	    	}
	  else
		  {
			   originalBoard = new Scanner(new File("FalloutBoard.txt"));
			   fillBoard();
		  }
  }
  
  public static void fillBoard() throws IOException 
	  {	
	
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
				        else if(type.equals("Tax"))
				        	{
					          String n = originalBoard.next();
					          int p = originalBoard.nextInt();
	
					          board.add(new Tax(n,p));
				        	}
	
	    			}

	    		} 
  public static void beginGame() 
	  {
		  options();
	  }
  
  public static void rollDice()
  {
	  int dice1 = (int)(Math.random()*5) + 1;
	  int dice2 = (int)(Math.random()*5) + 1;
	  int total = dice1 + dice2;
	  
	  property(total);
  }
  
  public static void options()
  {
	  System.out.println("Would you like to \n  1) Roll the Dice \n  2) List Inventory");
	  input = userIntInput.nextInt();
	  
	  if(input == 1)
		  {
			  rollDice();
		  }
	  else
		  {
			  System.out.println("");
			  for(Property p: player1Owns)
				  {
					  System.out.println(p + ") " + p.getName());
				  }
		  }
  }
  
  public static void property(int total)
  {
	  playerLocation += total;
	  
	  if(playerLocation > 40)
		  {
			  playerLocation -= 40;
		  }
	  if(board.get(playerLocation).isOwned() == false)
		  {
			  if(playerLocation == 0)
				  {
					  player1.setMoney(player1.getMoney() + 200);
				  }
			  System.out.println("You have landed on " + board.get(playerLocation).getName() + ". Would you like to buy it for $" + board.get(playerLocation).getPrice() + "?");
			  buy();
		  }
  }
  
  public static void buy()
  {
	  System.out.println("  1) Yes\n  2) No\n  3) Print Current Balence");
	  input = userIntInput.nextInt();
	  
	  if(input == 1)
		  {
			  System.out.println("You have bought  " + board.get(playerLocation).getName() + "for $" + board.get(playerLocation).getPrice() + ".");
			  
			  System.out.println("Your current balence is $" + player1.getMoney());
			  options();
			  
		  }
	  else if(input == 2)
		  {
			  System.out.println("You have declined to buy " + board.get(playerLocation).getName() + ".");
			  options();
		  }
	  else
		  {
			  System.out.println("Your current balence is $" + player1.getMoney() +".");
			  buy();
		  }
  }
}
