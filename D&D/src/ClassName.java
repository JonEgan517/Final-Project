public class ClassName
	{
		String name;
		int hp;
		int attack;
		
		public ClassName(String n, int h, int a)
			{
				name = n;
				hp = h;
				attack = a; 
			}

		public String getName()
			{
				return name;
			}

		public void setName(String name)
			{
				this.name = name;
			}

		public int getHp()
			{
				return hp;
			}

		public void setHp(int hp)
			{
				this.hp = hp;
			}

		public int getAttack()
			{
				return attack;
			}

		public void setAttack(int attack)
			{
				this.attack = attack;
			}

	}