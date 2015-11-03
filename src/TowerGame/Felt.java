package TowerGame;

import java.awt.Color;

import desktop_fields.Field;
import desktop_fields.Shipping;
import desktop_fields.Start;
import desktop_fields.Street;
import desktop_resources.GUI;

public class Felt 
{
	private String navn;
	private int værdi;
	
	public Felt(String navn, int værdi) 
	{
		this.navn = navn;
		this.værdi = værdi;
	}

	public String getNavn() 
	{
		return navn;
	}

	public int getVærdi() 
	{
		return værdi;
	}
	
	
	
	public Felt() 
	{
	Field[] fields = new Field[12];
	Color color = Color.RED;
		fields[0] = new Street.Builder()
				.setTitle("START")
				.setDescription(" ")
				.setSubText("1")
				.setBgColor(Color.blue)
				.build();
				
				
		fields[1] = new Street.Builder()
				.setTitle("Tower")
				.setDescription("")
				.setSubText("2")
				.setBgColor(color)
				.build();
		
		fields[2] = new Street.Builder()
				.setTitle("Crater")
				.setDescription("")
				.setSubText("3")
				.setBgColor(color)
				.build();

		fields[3] = new Street.Builder()
				.setTitle("Palace Gates")
				.setDescription("")
				.setSubText("4")
				.setBgColor(color)
				.build();

		fields[4] = new Street.Builder()
				.setTitle("Cold Desert")
				.setDescription("")
				.setSubText("5")
				.setBgColor(color)
				.build();

		fields[5] = new Street.Builder()
				.setTitle("Walled City")
				.setDescription("")
				.setSubText("6")
				.setBgColor(color)
				.build();

		fields[6] = new Street.Builder()
				.setTitle("Monestary")
				.setDescription("")
				.setSubText("7")
				.setBgColor(color)
				.build();

		fields[7] = new Street.Builder()
				.setTitle("Black Cave")
				.setDescription("")
				.setSubText("8")
				.setBgColor(color)
				.build();

		fields[8] = new Street.Builder()
				.setTitle("Huts in the mountains")
				.setDescription("")
				.setSubText("9")
				.setBgColor(color)
				.build();

		fields[9] = new Street.Builder()
				.setTitle("The Werewall")
				.setDescription("")
				.setSubText("10")
				.setBgColor(color)
				.build();

		fields[10] = new Street.Builder()
				.setTitle("The Pit")
				.setDescription("")
				.setSubText("11")
				.setBgColor(color)
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
