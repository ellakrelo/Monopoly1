
public class Go extends Property
	{
		public Go(String n)
		{
			name = n;
		}
		
		public void passGo()
		{
			if(Runner.currentPlayer.equals(Runner.player1.getName()))
				{
					Runner.player1.setMoney(Runner.player1.getMoney() + 200);
				}
			else
				{
					Runner.player2.setMoney(Runner.player2.getMoney() + 200);
				}
		}
	}
