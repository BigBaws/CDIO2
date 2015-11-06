package TowerGame;

import static org.junit.Assert.*;

import org.junit.Test;

public class JUnitTest {

	Player p = new Player(null);


	@Test
	public void StartBeløb() 
	{
		assertEquals(1000, p.getPoints());
	}


	@Test
	public void NegativtPoint() 
	{
		p.setScore(-100);
		assertEquals(0, p.getPoints());
	}
	private static Fields[] list;
	@Test
	
	public void TestAfFelt2()
	{
		list = new Fields [3]; 
		list [1] = new Fields ("You start your journey",0);
		list [2] = new Fields ("Tower, which is really really tall",250);
		int diceSum = 2;
		p.setScore(list[diceSum].getValue()+p.getPoints());
		assertEquals(1250, p.getPoints());
		
	}
	public void TestAfVinder()
	{
		Game.main(new String[] {"p1", "3000", "p2", "1000"});
	}
	
	
	
	
}
