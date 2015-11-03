package TowerGame;

import desktop_codebehind.Car;
import desktop_resources.GUI;

public class Spillet 

{
//	private Player p1, p2;
	private static Fields[] list;
	private static Dice[] dice = { new Dice(), new Dice() };
	public static void main(String[] args) 
	
	{
//		Score score = new Score();
//		Felter felt = new Felter();
		
		new Fields();
		java.util.Scanner tastatur = new java.util.Scanner(System.in);
//		Bank score = new Bank();
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

		

		list = new Fields [13];               // definerer samtlige felter, som jeg kan bruge senere:
		list [1] = new Fields ("Start",0);
		list [2] = new Fields ("Tower",250);
		list [3] = new Fields ("Crater",-100);
		list [4] = new Fields ("Palace Gates",100);
		list [5] = new Fields ("Cold Desert" , -20);
		list [6] = new Fields ("Walled City" , 180);
		list [7] = new Fields ("Monestary" , 0);
		list [8] = new Fields ("Black Cave" , -70);
		list [9] = new Fields ("Huts in the mountain" , 60);
		list [10] = new Fields ("The Werewall" , -80);
		list [11] = new Fields ("The Pit" , -50);
		list [12] = new Fields ("Goldmine" , 650);
		

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
		String playerName = p.getName();

		while (true)	
		{				
			GUI.getUserButtonPressed("Roll die", playerName+ "'s turn");
			GUI.removeAllCars(playerName);
			GUI.displayChanceCard(playerName+ " roll the dice");
			
			int dice1 = dice[0].roll();
			int dice2 = dice[1].roll();
			int diceSum = dice1 + dice2;
			p.setScore(list[diceSum].getValue());
			GUI.setBalance(playerName, p.getPoints());
			GUI.setDice(dice1, dice2);
			GUI.setCar(diceSum, playerName);
		
			
			if (list[diceSum].getValue()>0)              // Følgende er primært da det lyder forkert at sige "gaining -80" point
			{
				GUI.displayChanceCard(playerName+" rolled a " +diceSum+ " landing on "+list[diceSum].getNavn()+", gaining "+list[diceSum].getValue()+" coins, he now has " +p.getPoints()+ ", coins");
			}
			else if (list[diceSum].getValue()<=0)
			{
				GUI.displayChanceCard(playerName+" rolled a " +diceSum+ " landing on "+list[diceSum].getNavn()+", losing "+list[diceSum].getValue()*-1+" coins, he now has " +p.getPoints()+ ", coins");
			}
			
			if (diceSum != 10)
			{
				break;
			}
			
		}
	}
}
		
		

		
		