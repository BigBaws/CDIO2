package cdio_2;

public class Dice {
	private int die1;
	private int die2;
	
	public void rolldice(){
		die1=(int) ((Math.random()*6)+1);
		die2=(int) ((Math.random()*6)+1);
	}
	public int getdie1value(){
		return die1;
	}
	public int getdie2value(){
		return die2;
	}
	public int getsum(){
		return die1+die2;
	}
}
