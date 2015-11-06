package TowerGame;

import desktop_codebehind.Car;
import desktop_resources.GUI;

public class Game 

{

	private static Fields[] list;
	private static Dice[] dice = { new Dice(), new Dice() };
	public static void main(String[] args) 
	
	{

		
		new Fields(); 
		

		Player p1, p2;             // Er til for at nedenstående linje vil fungere.
		if(args.length == 0)       // Er kun til for at lave en JUnitTest.
		{
		String player1Name = GUI.getUserString("Choose your name player 1");

		if (player1Name.equals("")) // Spiller 1 bliver oprettet i GUI'en
		{
			player1Name = "Player 1";
			GUI.displayChanceCard("No name input for player 1, default has been set");
			GUI.showMessage("");
		}
		String player2Name = GUI.getUserString("Choose your name player 2");
		if (player2Name.equals(""))
		{
			player2Name = "Player 2";
			GUI.displayChanceCard("No name input for player 2, default has been set");
			GUI.showMessage("");
		}
		p1 = new Player(player1Name);

		p2 = new Player(player2Name);
		
		} 
		else                       // Er kun til for at lave en JUnitTest
		{
			p1 = new Player(args[0]);
			int i = Integer.parseInt(args[1]);
			p1.setScore(i);

			p2 = new Player(args[2]);
			int u = Integer.parseInt(args[3]);
			p2.setScore(u);
			
		
		}
		

		GUI.addPlayer(p2.getName(), p2.getPoints());
		GUI.addPlayer(p1.getName(), p1.getPoints());
		

		list = new Fields [13];         // definerer samtlige felter, som jeg kan bruge senere, samt tilføjer tekst:
		list [1] = new Fields ("You start your journey",0);
		list [2] = new Fields ("Tower, which is really really tall",250);
		list [3] = new Fields ("the crater, which is really really deep",-100);
		list [4] = new Fields ("the grand Palace Gates",100);
		list [5] = new Fields ("Cold Desert where you have to buy a camel in order to get out" , -20);
		list [6] = new Fields ("Walled City where the residents help you out" , 180);
		list [7] = new Fields ("Monestary. The monks let you rest for free" , 0);
		list [8] = new Fields ("Black Cave where you panic and lose some gold" , -70);
		list [9] = new Fields ("Huts in the mountain, where the local residents help you out" , 60);
		list [10] = new Fields ("The Werewall, which is really scary, giving you an extra turn to get out" , -80);
		list [11] = new Fields ("The Pit where you have to pay a few people to get you out" , -50);
		list [12] = new Fields ("Goldmine... You're about to be rich" , 650);
		

		GUI.displayChanceCard(p1.getName()+ " starts");

		
		while (p1.getPoints() < 3000 && p2.getPoints() < 3000)
		{
			tur(p1);
			tur(p2);
			
		}
		if (p1.getPoints() >= 3000 && p2.getPoints() >= 3000)
		{
			GUI.displayChanceCard("Both players got 3000 coins, it's a tie!");
		}
		else if (p1.getPoints() >= 3000) 
		{
			GUI.displayChanceCard(p1.getName()+" won - Congratulations!");
		}
		else
		{
			GUI.displayChanceCard(p2.getName()+" won - Congratulations!");
		}

	
		


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
			p.setScore(list[diceSum].getValue()+p.getPoints());
			GUI.setBalance(playerName, p.getPoints());
			GUI.setDice(dice1, dice2);
			GUI.setCar(diceSum, playerName);
			
			
			if (list[diceSum].getValue()>0)     // Følgende er primært da det lyder forkert at sige "gaining -80" point
			{
				GUI.displayChanceCard(playerName+" rolled a " +diceSum+ " landing on "+list[diceSum].getNavn()+". "+playerName+" gained "+list[diceSum].getValue()+" coins, and now has " +p.getPoints()+ " coins");
			}
			else if (list[diceSum].getValue()<=0)
			{
				GUI.displayChanceCard(playerName+" rolled a " +diceSum+ " landing on "+list[diceSum].getNavn()+". "+playerName+" lost "+list[diceSum].getValue()*-1+" coins, and now has " +p.getPoints()+ " coins");
			}			
			if (diceSum != 10)
			{
				break;
			}
			
		}
	}
}
		
		

		
		