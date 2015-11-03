package TowerGame;

public class DefektSpil 
{
	public static void main(String[] args) 
	{
			int score1 = 1000;
			int score2 = 1000;
			int terning;
			
			
			while (true)
			{
				while (true)     // Det hele er i en while lykke, så spilleren kan få en ekstra tur, hvis han slår 10
				{
					System.out.println("Player1 rolls the dice");
					Terning kast = new Terning();
					terning = kast.kast();
					
					if (terning == 2)
					{
						score1 = score1 + 250;
						System.out.println("Player1 rolled a " +terning+ " landing on the tower, gaining 250 coins, he now has " +score1+ "");
					}
					if (terning == 3)
					{
						score1 = score1 - 100;
						System.out.println("Player1 rolled a " +terning+ " landing in the crater, losing 100 coins, he now has " +score1+ "");
					}
					if (terning == 4)
					{
						score1 = score1 + 100;
						System.out.println("Player1 rolled a " +terning+ " landing at the palace gates, gaining 100 coins, he now has " +score1+ "");
					}
					if (terning == 5)
					{
						score1 = score1 - 20;
						System.out.println("Player1 rolled a " +terning+ " landing in the cold desert, losing 20 coins, he now has " +score1+ "");
					}
					if (terning == 6)
					{
						score1 = score1 + 180;
						System.out.println("Player1 rolled a " +terning+ " landing in the Walled City, gaining 180 coins, he now has " +score1+ "");
					}
					if (terning == 7)
					{
						System.out.println("Player1 rolled a " +terning+ " landing in the Monestary... this doesn't do sh*t, he now still has " +score1+ "");
					}
					if (terning == 8)
					{
						score1 = score1 - 70;
						System.out.println("Player1 rolled a " +terning+ " landing in a black cave, losing 70 coins, he now has " +score1+ "");
					}
					if (terning == 9)
					{
						score1 = score1 + 60;
						System.out.println("Player1 rolled a " +terning+ " landing in the huts in the mountain, gaining 60 coins, he now has " +score1+ "");
					}
					if (terning == 10)
					{
						score1 = score1 - 80;
						System.out.println("Player1 rolled a " +terning+ " landing in the Werewall, losing 80 coins but getting another turn, he now has " +score1+ "");
					}
					if (terning == 11)
					{
						score1 = score1 - 50;
						System.out.println("Player1 rolled a " +terning+ " landing in the pit, losing 50 coins, he now has " +score1+ "");
					}
					if (terning == 12)
					{
						score1 = score1 + 650;
						System.out.println("Player1 rolled a " +terning+ " landing in a goldmine, gaining 650 coins, he now has " +score1+ "");
						
					}
					if (terning != 10)   //Her breaker jeg while lykken, hvis spilleren slår alt andet end 10.
					{
						break;
					}
				}
				// Hele while lykken bliver nu gentaget, bare for Player2, men dette skal laves om
				
				
				while (true)     // Samme grund til while lykke som før
				{
					System.out.println("Player2 rolls the dice");
					Terning kast = new Terning();
					terning = kast.kast();
						
					if (terning == 2)
					{
						score2 = score2 + 250;
						System.out.println("Player2 rolled a " +terning+ " landing on the tower, gaining 250 coins, he now has " +score2+ "");
					}
					if (terning == 3)
					{
						score2 = score2 - 100;
						System.out.println("Player2 rolled a " +terning+ " landing in the crater, losing 100 coins, he now has " +score2+ "");
					}
					if (terning == 4)
					{
						score2 = score2 + 100;
						System.out.println("Player2 rolled a " +terning+ " landing at the palace gates, gaining 100 coins, he now has " +score2+ "");
					}
					if (terning == 5)
					{
						score2 = score2 - 20;
						System.out.println("Player2 rolled a " +terning+ " landing in the cold desert, losing 20 coins, he now has " +score2+ "");
					}
					if (terning == 6)
					{
						score2 = score2 + 180;
						System.out.println("Player2 rolled a " +terning+ " landing in the Walled City, gaining 180 coins, he now has " +score2+ "");
					}
					if (terning == 7)
					{
						System.out.println("Player2 rolled a " +terning+ " landing in the Monestary... this doesn't do sh*t, he now still has " +score2+ "");
					}
					if (terning == 8)
					{
						score2 = score2 - 70;
						System.out.println("Player2 rolled a " +terning+ " landing in a black cave, losing 70 coins, he now has " +score2+ "");
					}
					if (terning == 9)
					{
						score2 = score2 + 60;
						System.out.println("Player2 rolled a " +terning+ " landing in the huts in the mountain, gaining 60 coins, he now has " +score2+ "");
					}
					if (terning == 10)
					{
						score2 = score2 - 80;
						System.out.println("Player2 rolled a " +terning+ " landing in the Werewall, losing 80 coins but getting another turn, he now has " +score2+ "");
					}
					if (terning == 11)
					{
						score2 = score2 - 50;
						System.out.println("Player2 rolled a " +terning+ " landing in the pit, losing 50 coins, he now has " +score2+ "");
					}
					if (terning == 12)
					{
						score2 = score2 + 650;
						System.out.println("Player2 rolled a " +terning+ " landing in a goldmine, gaining 650 coins, he now has " +score2+ "");
						
					}
					if (terning != 10)   //Her breaker jeg while lykken, hvis spilleren slår alt andet end 10.
					{
						break;
					}
				}
				
				if (score1 >=3000 && score2 >=3000)
				{
					System.out.println("Spillet er uafgjort, da begge spillere har opnået 3000 point");
					break;
				}
				if (score1 >= 3000)
				{
					System.out.println("Player 1 har vundet");
					break;
				}
				if (score2 >= 3000)
				{
					System.out.println("Player 2 har vundet");
					break;
				}
				
				
				
			}
			
		}

	}


	//baz(string x);
	//if (x=player2)
	//Terning terning = new Terning();
	//System.out.println(terning.kast());
	
