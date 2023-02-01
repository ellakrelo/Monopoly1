
public abstract class Property
	{
		protected String name;
		protected int price;
		protected String owner;
		protected String color;
		protected boolean owned;
		protected int rent;
		protected int house1;
		protected int house2;
		protected int house3;
		protected int house4;
		protected int hotel;
		
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
		
		public int getHouse1()
			{
				return house1;
			}

		public void setHouse1(int house1)
			{
				this.house1 = house1;
			}

		public int getHouse2()
			{
				return house2;
			}

		public void setHouse2(int house2)
			{
				this.house2 = house2;
			}

		public int getHouse3()
			{
				return house3;
			}

		public void setHouse3(int house3)
			{
				this.house3 = house3;
			}

		public int getHouse4()
			{
				return house4;
			}

		public void setHouse4(int house4)
			{
				this.house4 = house4;
			}
		
		public int getHotel()
			{
				return hotel;
			}

		public void setHotel(int hotel)
			{
				this.hotel = hotel;
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
