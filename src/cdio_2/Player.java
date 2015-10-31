package cdio_2;

public class Player {
private String name;
private java.util.Scanner input = new java.util.Scanner(System.in);
	public void createplayer(){
		name=input.next();
	}
	public String getplayername(){
		return name;
	}
	
}
