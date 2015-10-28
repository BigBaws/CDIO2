package cdio_2;

public class Dice {
	private int die1;
	private int die2;
	
	public int rolldice(){
		die1=(int) ((Math.random()*6)+1);
		die2=(int) ((Math.random()*6)+1);
		return die1+die2;
	}
	
}
