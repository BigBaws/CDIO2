package cdio_2;

public class Bank {
private int balance;
	


public Bank(){
	balance=1000;
		}
//amount skal erstates med et kald der høre til det enkelte felts point uddeling (metode kald).
public int gain(){
	balance=balance+amount;
	return balance;
}
public int lose(){
	balance=balance-amount;
	return balance;
}
}
