package cdio_2;

import java.awt.Color;

import desktop_codebehind.Car;
import desktop_resources.GUI;

public class Player {
private String name;
private Bank bank= new Bank();
public Player(String name) {
	this.name = name;
	Car car = new Car.Builder()
			.typeTractor()
			.patternHorizontalDualColor()
			.primaryColor(Color.RED)
			.secondaryColor(Color.BLUE)
			.build();
	GUI.addPlayer(name, getpoints(),car);
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
