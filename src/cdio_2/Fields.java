package cdio_2;
import java.awt.Color;
import desktop_fields.Start;
import desktop_resources.GUI;
import desktop_fields.Field;
import desktop_fields.Shipping;
public class Fields {
	int fieldvalue;
    String fieldtext;
		
		public Fields() {
	Field[] fields = new Field[12];
	fields[0] = new Start.Builder()
			.setTitle("Home")
			.setDescription("Start")
			.setSubText(" ")
			.setBgColor(Color.GREEN)
			.build();
	fields[1] = new Shipping.Builder()
			.setTitle("Tower")
			.setDescription("Tower")
			.setSubText("+250")
			.setBgColor(Color.YELLOW)
			.setFgColor(Color.RED)
            .setRent("250")
			.build();
	fields[2] = new Shipping.Builder()
			.setTitle("Crater")
			.setDescription("Crater")
			.setSubText("-100")
			.setBgColor(Color.RED)
            .setRent("-100")
			.build();
	fields[3] = new Shipping.Builder()
			.setTitle("Palace gates")
			.setDescription("Palace gates")
			.setSubText("+100")
			.setBgColor(Color.YELLOW)
            .setRent("100")
			.build();
	fields[4] = new Shipping.Builder()
			.setTitle("Cold Desert")
			.setDescription("Cold Desert")
			.setSubText("-20")
			.setBgColor(Color.RED)
            .setRent("-20")
			.build();
	fields[5] = new Shipping.Builder()
			.setTitle("Walled City")
			.setDescription("Walled City")
			.setSubText("+180")
			.setBgColor(Color.YELLOW)
            .setRent("180")
			.build();
	fields[6] = new Shipping.Builder()
			.setTitle("Monastary")
			.setDescription("Monastary")
			.setSubText("0")
			.setBgColor(Color.GREEN)
            .setRent("0")
			.build();
	fields[7] = new Shipping.Builder()
			.setTitle("Black Cave")
			.setDescription("Black Cave")
			.setSubText("-70")
			.setBgColor(Color.RED)
            .setRent("-70")
			.build();
	fields[8] = new Shipping.Builder()
			.setTitle("Huts in the Mountain")
			.setDescription("Huts in the Mountain")
			.setSubText("+60")
			.setBgColor(Color.YELLOW)
            .setRent("60")
			.build();
	fields[9] = new Shipping.Builder()
			.setTitle("The Werewall")
			.setDescription("The werewolf wall")
			.setSubText("-80")
			.setBgColor(Color.RED)
            .setRent("-80")
			.build();
	fields[10] = new Shipping.Builder()
			.setTitle("The Pit")
			.setDescription("The Pit")
			.setSubText("-50")
			.setBgColor(Color.RED)
            .setRent("-50")
			.build();
	fields[11] = new Shipping.Builder()
			.setTitle("Goldmine")
			.setDescription("Goldmine")
			.setSubText("+650")
			.setBgColor(Color.YELLOW)
            .setRent("650")
			.build();
	GUI.create(fields);
}
}
