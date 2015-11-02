package cdio_2;

public class Player {
private String name;
private Bank bank= new Bank();
public Player(String name) {
	this.name = name;
	}
	public String getplayername(){
		return name;
	}
	public int getpoints(){
	return	bank.getbalance();
	}
	public void changepoints(int amount){
		bank.change(amount);
	}
}
