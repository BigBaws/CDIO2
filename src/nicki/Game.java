package nicki;

import desktop_resources.GUI;

public class Game {

	private Dice[] dice = { new Dice(), new Dice() };
	Fields[] fields = new Fields[13];


	public static void main(String[] args) {
		new Game();
	}

	public Game() {
		
		new Fields();
		
		// Setup of players
		String player1navn = GUI.getUserString("Choose your name player 1");
		Player p1 = new Player(player1navn);
		String player2navn = GUI.getUserString("Choose your name player 2");
		Player p2 = new Player(player2navn);
		
		GUI.addPlayer(p1.getName(), p1.getPoints());
		GUI.addPlayer(p2.getName(), p2.getPoints());
		
		fields[2] = new Fields("Tower", 250);
		fields[3] = new Fields("Crater", -100);
		fields[4] = new Fields("Palace gates", 100);
		fields[5] = new Fields("Cold desert", -20);
		fields[6] = new Fields("Walled city", 180);
		fields[7] = new Fields("Monestary", 0);
		fields[8] = new Fields("Black cave", -70);
		fields[9] = new Fields("Huts in the mountain", 60);
		fields[10] = new Fields("The werewolf-wall", -80);
		fields[11] = new Fields("The pit", -50);
		fields[12] = new Fields("Goldmine", 650);
		
		// Player 1 starter altid, og herefter vælges turen afhængig af hvad man slår.
		
		GUI.displayChanceCard(p1.getName()+ " starts");
		Player current = p1;
		while (p1.getPoints() <= 3000 && p2.getPoints() <= 3000) {


			boolean extra = tur(current);
			while (extra) {
				extra = tur(current);
			}
			if (current == p1) {
				current = p2;
			} else {
				current = p1;
			}

		}
		if (p1.getPoints() >= 3000) {
			GUI.displayChanceCard(p1.getName()+" won - Congratulations!");
		} else {
			GUI.displayChanceCard(p2.getName()+" won - Congratulations!");
		}

	}

	// Selve spillet
	private boolean tur(Player p) {
		
	
		GUI.getUserButtonPressed("Roll die", p.getName()+ "'s turn");
		GUI.removeAllCars(p.getName());
		GUI.displayChanceCard(p.getName()+ " roll the dice");
		
		//Definerer de to terninger:
		int dice1 = dice[0].roll();
		int dice2 = dice[1].roll();
		
		// definerer summen af de to terninger
		int sum = dice1 + dice2; 
		
		// Opdaterer den aktuelle spiller med de point som feltet giver og udskriver i GUI'en
		p.setPoints(fields[sum].getValue()+p.getPoints());
		GUI.setBalance(p.getName(), p.getPoints());
		GUI.setDice(dice1, dice2);
		GUI.setCar(sum, p.getName());

		if (fields[sum].getValue() > 0) {
			GUI.displayChanceCard(p.getName()+" rolled a " +sum+ " landing on "+fields[sum].getName() +", gaining "+fields[sum].getValue()+" coins, he now has " +p.getPoints()+ ", coins");
			
		} else if (fields[sum].getValue() == 0) {
			GUI.displayChanceCard(p.getName()+" rolled a " +sum+ " landing on "+fields[sum].getName()+", neither losing nor rewareded any points. He now has " +p.getPoints()+ ", coins");
			
		} else {
			GUI.displayChanceCard(p.getName()+" rolled a " +sum+ " landing on "+fields[sum].getName()+", losing "+fields[sum].getValue()+" coins, he now has " +p.getPoints()+ ", coins");
		}
		return sum == 10;

	}

}
