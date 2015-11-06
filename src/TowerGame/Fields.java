package TowerGame;

import java.awt.Color;

import desktop_fields.Field;
import desktop_fields.Shipping;
import desktop_fields.Start;
import desktop_fields.Street;
import desktop_resources.GUI;

public class Fields 
{
	private String name;
	private int value;
	
	public Fields(String name, int value) 
	{
		this.name = name;
		this.value = value;
	}

	public String getNavn() 
	{
		return name;
	}

	public int getValue() 
	{
		return value;
	}
	
	
	
	public Fields() 
	{
	Field[] fields = new Field[12];
	Color color = Color.RED;
		fields[0] = new Street.Builder()
				.setTitle("START")
				.setDescription("")
				.setSubText("1")
				.setBgColor(Color.white)
				.build();
				
				
		fields[1] = new Street.Builder()
				.setTitle("Tower")
				.setDescription("")
				.setSubText("2")
				.setBgColor(Color.CYAN)
				.build();
		
		fields[2] = new Street.Builder()
				.setTitle("Crater")
				.setDescription("")
				.setSubText("3")
				.setBgColor(Color.GRAY)
				.build();

		fields[3] = new Street.Builder()
				.setTitle("Palace Gates")
				.setDescription("")
				.setSubText("4")
				.setBgColor(Color.blue)
				.build();

		fields[4] = new Street.Builder()
				.setTitle("Cold Desert")
				.setDescription("")
				.setSubText("5")
				.setBgColor(Color.green)
				.build();

		fields[5] = new Street.Builder()
				.setTitle("Walled City")
				.setDescription("")
				.setSubText("6")
				.setBgColor(Color.magenta)
				.build();

		fields[6] = new Street.Builder()
				.setTitle("Monestary")
				.setDescription("")
				.setSubText("7")
				.setBgColor(Color.pink)
				.build();

		fields[7] = new Street.Builder()
				.setTitle("Black Cave")
				.setDescription("")
				.setSubText("8")
				.setBgColor(Color.darkGray)
				.build();

		fields[8] = new Street.Builder()
				.setTitle("Huts in the mountains")
				.setDescription("")
				.setSubText("9")
				.setBgColor(Color.yellow)
				.build();

		fields[9] = new Street.Builder()
				.setTitle("The Werewall")
				.setDescription("")
				.setSubText("10")
				.setBgColor(Color.WHITE)
				.build();

		fields[10] = new Street.Builder()
				.setTitle("The Pit")
				.setDescription("")
				.setSubText("11")
				.setBgColor(Color.orange)
				.build();

		fields[11] = new Street.Builder()
				.setTitle("Goldmine")
				.setDescription("")
				.setSubText("12")
				.setBgColor(color)
				.build();
		
		GUI.create(fields);
	}
				
	
}
