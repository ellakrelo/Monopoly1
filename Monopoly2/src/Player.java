import java.util.*;

public class Player
	{
		protected int money;
		protected String name;
		protected ArrayList <Property> properties = new ArrayList<Property>();
		protected boolean inJail;
		
		public Player(int m, String n, ArrayList<Property> p, boolean i)
		{
			money = m;
			name = n;
			properties = p;
			inJail = i;
		}

		public int getMoney()
			{
				return money;
			}

		public void setMoney(int money)
			{
				this.money = money;
			}

		public String getName()
			{
				return name;
			}

		public void setName(String name)
			{
				this.name = name;
			}

		public ArrayList<Property> getProperties()
			{
				return properties;
			}

		public void setProperties(ArrayList<Property> properties)
			{
				this.properties = properties;
			}

		public boolean isInJail()
			{
				return inJail;
			}

		public void setInJail(boolean inJail)
			{
				this.inJail = inJail;
			}
	}
