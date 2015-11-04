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

	@Test
	public void x()
	{
		
	}
	
	
	
}
