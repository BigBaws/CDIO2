package TowerGame;

import desktop_codebehind.Car;
import desktop_resources.GUI;

public class Spillet 

{
	private Player p1, p2;
	private static Felt[] list;
	public static void main(String[] args) 
	{
//		Score score = new Score();
//		Felter felt = new Felter();
		
		new Felt();
		java.util.Scanner tastatur = new java.util.Scanner(System.in);
		Bank score = new Bank();
//		int terning1;
//		int terning2;
//		int terning;

//		p1 = new Player(scan.nextLine());
//		GUI.getUserString("Name");	
//		GUI.getUserSelection("Choose your avatar", "selection1", "selection2");
		String player1navn = GUI.getUserString("Choose your name player 1");
		Player p1 = new Player(player1navn);
		String player2navn = GUI.getUserString("Choose your name player 2");
		Player p2 = new Player(player2navn);
		
		GUI.addPlayer(p1.getName(), p1.getPoints());
		GUI.addPlayer(p2.getName(), p2.getPoints());

		

		list = new Felt [13];               // definerer samtlige felter, som jeg kan bruge senere:
		list [1] = new Felt ("Start",0);
		list [2] = new Felt ("Tower",250);
		list [3] = new Felt ("Crater",-100);
		list [4] = new Felt ("Palace Gates",100);
		list [5] = new Felt ("Cold Desert" , -20);
		list [6] = new Felt ("Walled City" , 180);
		list [7] = new Felt ("Monestary" , 0);
		list [8] = new Felt ("Black Cave" , -70);
		list [9] = new Felt ("Huts in the mountain" , 60);
		list [10] = new Felt ("The Werewall" , -80);
		list [11] = new Felt ("The Pit" , -50);
		list [12] = new Felt ("Goldmine" , 650);
		

		GUI.displayChanceCard(p1.getName()+ " starts");

		while (p1.getPoints() <= 3000 || p1.getPoints() <= 3000)
		{
			tur(p1);
			tur(p2);
			
		}
			

	
		


//		
//		
//		list[terning].getNavn();
//		list[terning].getVærdi();
		
	}
	private static void tur(Player p) 
	{
		String spillerNavn = p.getName();
		int terning1;
		int terning2;
		int terning;
		while (true)	
		{				

			GUI.getUserButtonPressed("Roll die", spillerNavn+ "'s turn");
			GUI.displayChanceCard(spillerNavn+ " roll the dice");
			Terning kast1 = new Terning();                     // Slår med terningen, kalder min terninge-klasse
			terning1 = kast1.kast();
			Terning kast2 = new Terning();                     // Slår med terningen, kalder min terninge-klasse
			terning2 = kast2.kast();
			terning = terning1 + terning2;                     // De to terninger bliver lagt sammen
			p.setScore(list[terning].getVærdi());
			GUI.setBalance(spillerNavn, p.getPoints());
			GUI.setDice(terning1, terning2);
			GUI.setCar(terning, spillerNavn);
			
			

			if (list[terning].getVærdi()>0)              // Følgende er primært da det lyder forkert at sige "gaining -80" point
			{
				GUI.displayChanceCard(spillerNavn+" rolled a " +terning+ " landing on "+list[terning].getNavn()+", gaining "+list[terning].getVærdi()+" coins, he now has " +p.getPoints()+ ", coins");
			}
			else if (list[terning].getVærdi()<=0)
			{
				GUI.displayChanceCard(spillerNavn+" rolled a " +terning+ " landing on "+list[terning].getNavn()+", losing "+list[terning].getVærdi()*-1+" coins, he now has " +p.getPoints()+ ", coins");
			}
			
			if (terning != 10)
			{
				break;
			}
			
		}
	}
}
		
		

		
		