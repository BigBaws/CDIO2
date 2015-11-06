package TowerGame;

public class Player 
{

	private Bank b = new Bank();
	private String name;

	public Player(String name) 
	{
		this.name = name;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public int getPoints() 
	{
		return b.getscore();
	}

	public void setScore(int score) 
	{
		b.setscore(score);
		if (b.getscore() < 0) 
		{
			b.setscore(0);
		}
	}
	
}
