package cdio_2;

import desktop_resources.GUI;

public class Turn {
Dice dice = new Dice();
Printer printer= new Printer();

private int points;
public int round(){
	dice.rolldice();
	GUI.setDice(dice.getdie1value(), dice.getdie2value());
	printer.print(dice.getsum());
	switch (dice.getsum()){
	case 2:
		points= 250;
	break;
	case 3:
		points= -100;
		break;
	case 4:
		points= 100;
		break;
	case 5:
		points= -20;
		break;
	case 6:
		points= 180;
		break;
	case 7:
		points= 0;
		break;
	case 8:
		points= -70;
		break;
	case 9:
		points= 60;
		break;
	case 10:
		//input pause til manuelt ekstra slag.
		points=-80+round();
		break;
	case 11:
		points= -50;
		break;
	case 12:
		points= 650;
		break;
	}
	return points;
	
}
	
}
