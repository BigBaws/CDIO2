package cdio_2;

public class Printer {
public void print(){
	Dice dice= new Dice();
	//amount skal erstates med et kald der høre til det enkelte felts point uddeling (metode kald).
switch(dice.getsum()){
case 2:
	//tower
	System.out.println("With the help of the alchemists of the tower, you invent a wonder drug that cures any cold instantaniuosly. Financial succes Ho', you gain " +amount);
	break;
case 3:
	//crater
	System.out.println("Your caravan suddenly turned into a crater. WHAT HAPPENED!?, you lose " +amount);
	break;
case 4:
	//palace gates
	System.out.println("You meet many nobles at the palace gates and manage to convince some of them to fund a caravan expedition, you gain " +amount);
	break;
case 5:
	//cold desert
	System.out.println("The Desert is much colder than you would've ever imagined, you light a fire using some of your wares, you lose "+amount);
	break;
case 6:
	//walled city
	System.out.println("The Walled City seldomly lets in outsiders, your wares are foreign and exotic to it's inhabitants. Your wares sells incredibly well, you gain "+amount);
	break;
case 7:
	//monastary +0
	System.out.println("The monastary provides shelter from all the evil in the world but there isn't any economical gain in visiting it.");
	break;
case 8:
	//black cave -70
	System.out.println("Pirates from the black cave rob you, you lose "+amount);
	break;
case 9:
	// huts in the mountains +60
	System.out.println("The harsh people of the mountains are skilled artisans but lack merchant experience. You manage to stuck up your wares cheaper than you would've in a city, you gain " +amount);
	break;
case 10:
	//the werewall (werewolf-wall) -80 + ekstra tur
	System.out.println("Meeting the gang of werewolf that always walks in a row, known as 'The Werewall', isn't pleasant but it gets your adrenaline pumping when you suddenly need to run for your life, you lose "+amount +"but you get an additional turn");
	break;
case 11:
	//the pit -50
	System.out.println("No man can go without exitement you spend 50 as entrance fee into the lounge area of the PIT, the match was exciting but no money is earned, you lose " +amount);
	break;
case 12:
	//goldmine +650
	System.out.println("The mine you own has struck gold, you gain" + amount +"Hussah");
	break;
}
}
}
