package TowerGame;

public class Felter 
{
	
	private int feltv�rdi;
	
	public void Felter()
	{
		feltv�rdi = 0; 
		
	}
	public int getfieldvalue(int sum)
	{
		if (sum == 2) 
		{
			feltv�rdi = 250;
		}
		switch (sum) 
		{
		case 3:  break;
		case 4:  break;
		default:
			break;
		}
		return feltv�rdi;

	}
	
}
