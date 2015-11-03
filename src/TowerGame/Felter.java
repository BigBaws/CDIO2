package TowerGame;

public class Felter 
{
	
	private int feltværdi;
	
	public void Felter()
	{
		feltværdi = 0; 
		
	}
	public int getfieldvalue(int sum)
	{
		if (sum == 2) 
		{
			feltværdi = 250;
		}
		switch (sum) 
		{
		case 3:  break;
		case 4:  break;
		default:
			break;
		}
		return feltværdi;

	}
	
}
