package nicki;

import java.awt.Color;


import desktop_fields.Street;
import desktop_resources.*;

public class Fields {


	public String getName() {
		return name;
	}

	public int getValue() {
		return value;
	}

	private String name;
	private int value;

	public Fields(String name, int value) {
		this.name = name;
		this.value = value;
	}

	public Fields() {

		desktop_fields.Field[] fields = new desktop_fields.Field[12];


		fields[0] = new Street.Builder()
				.setTitle("Start")
				.setSubText("1")
				.setBgColor(Color.WHITE)
				.build();

		fields[1] = new Street.Builder()
				.setTitle("Tower")
				.setSubText("2")
				.setBgColor(Color.YELLOW)
				.build();

		fields[2] = new Street.Builder()
				.setTitle("Crater")
				.setSubText("3")
				.setBgColor(Color.BLUE)
				.build();

		fields[3] = new Street.Builder()
				.setTitle("Palace Gates")
				.setSubText("4")
				.setBgColor(Color.GREEN)
				.build();

		fields[4] = new Street.Builder()
				.setTitle("Cold desert")
				.setSubText("5")
				.setBgColor(Color.ORANGE)
				.build();

		fields[5] = new Street.Builder()
				.setTitle("Walled city")
				.setSubText("6")
				.setBgColor(Color.LIGHT_GRAY)
				.build();

		fields[6] = new Street.Builder()
				.setTitle("Monestary")
				.setSubText("7")
				.setBgColor(Color.BLUE)
				.build();

		fields[7] = new Street.Builder()
				.setTitle("Black cave")
				.setSubText("8")
				.setBgColor(Color.GREEN)
				.build();

		fields[8] = new Street.Builder()
				.setTitle("Huts in the mountain")
				.setSubText("9")
				.setBgColor(Color.magenta)
				.build();

		fields[9] = new Street.Builder()
				.setTitle("The werewolf-wall")
				.setSubText("10")
				.setBgColor(Color.orange)
				.build();

		fields[10] = new Street.Builder()
				.setTitle("The pit")
				.setSubText("11")
				.setBgColor(Color.CYAN)
				.build();

		fields[11] = new Street.Builder()
				.setTitle("Goldmine")
				.setSubText("12")
				.setBgColor(Color.RED)
				.build();

		GUI.create(fields);


	}
}
