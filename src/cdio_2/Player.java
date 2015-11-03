package cdio_2;

import desktop_resources.GUI;

public class Player {
private String name;
private Bank bank= new Bank();
public Player() {
	GUI.displayChanceCard("------- Greetings Traveler -------- <br><br> Who are you?");
    name = GUI.getUserString("");
	GUI.addPlayer(name, bank.getbalance());
	}
	public String getplayername(){
		return name;
	}
	public int getpoints(){
	return	bank.getbalance();
	}
	public void changepoints(int round){
		bank.change(round);
	}
}
