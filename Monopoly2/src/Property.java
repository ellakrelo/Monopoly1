
public abstract class Property
	{
		protected String name;
		protected int price;
		protected String owner;
		protected String color;
		protected boolean owned;
		protected int rent;
		
		public String getName()
			{
				return name;
			}
		
		public void setName(String name)
			{
				this.name = name;
			}
		
		public int getPrice()
			{
				return price;
			}
		
		public void setPrice(int price)
			{
				this.price = price;
			}
		
		public String getOwner()
			{
				return owner;
			}
		
		public void setOwner(String owner)
			{
				this.owner = owner;
			}
		
		public String getColor()
			{
				return color;
			}

		public void setColor(String color)
			{
				this.color = color;
			}

		public boolean isOwned()
			{
				return owned;
			}
		
		public void setOwned(boolean owned)
			{
				this.owned = owned;
			}
		
		public int getRent()
			{
				return rent;
			}

		public void setRent(int rent)
			{
				this.rent = rent;
			}

		public void owned()
		{
			if(owned)
				{
					if(owner.equals(Runner.currentPlayer))
						{
							System.out.println("You already own this property!");
							
						}
					else
						{
							System.out.println(owner + " already owns this property. You must pay $" + rent + " in rent to them");
						}
				}
		}
		
		public void colorCheck()
		{
			
		}
		
	}
