package TowerGame;

public class Bank 
{
	private int score;
	
	public Bank()
	{
		score = 1000; 
		
	}
	public int getscore()
	{
		return score;
	}
	
	public void setscore (int score) 
	{
		this.score += score;
	}
}
