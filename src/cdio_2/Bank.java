package cdio_2;

public class Bank {
private int balance;
	


public Bank(){
	balance=1000;
		}
//amount skal erstates med et kald der høre til det enkelte felts point uddeling (metode kald).
public void change(int round){
balance=balance+round;
if (balance<0)
	balance=0;
}
public int getbalance(){
	return balance;
}
}
