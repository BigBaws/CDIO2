package cdio_2;

import desktop_resources.GUI;

public class Game {
	private java.util.Scanner scan = new java.util.Scanner(System.in);
	private Player p1, p2;
	private Turn turn;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new Game();
	}
public Game(){
Fields field=new Fields();
	System.out.println("player 1 enter your name");
	p1 = new Player();
	GUI.setCar(1, p1.getplayername());
	System.out.println("player 2 enter your name");
	p2= new Player();
	GUI.setCar(1, p2.getplayername());
while (p1.getpoints()<3000 && p2.getpoints()<3000){
	System.out.println(p1.getplayername()+"Roll Dice");
	p1.changepoints(turn.round());
	GUI.setBalance(p1.getplayername(), p1.getpoints());
	System.out.println(p2.getplayername()+"Roll Dice");	
	p2.changepoints(turn.round());
	GUI.setBalance(p2.getplayername(), p2.getpoints());
	
}
if(p1.getpoints()>=3000 && p2.getpoints()>=3000){
	GUI.displayChanceCard("simultaniuos victory, sadly this counts as a tie </html>");
	GUI.getUserButtonPressed("The End", "OK");}
else if(p1.getpoints()>=3000){
	GUI.displayChanceCard("Congratulations "+p1.getplayername()+" you are victorious with "+p1.getpoints()+"</html>");
	GUI.getUserButtonPressed("The End", "OK");
}
else{
	GUI.displayChanceCard("Congratulations "+p2.getplayername()+" you are victorious with "+p2.getpoints()+"</html>");
	GUI.getUserButtonPressed("The End", "OK");
	
}
}
}
	

