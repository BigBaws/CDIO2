package cdio_2;

public class Game {
	private java.util.Scanner scan = new java.util.Scanner(System.in);
	private Player p1, p2;
	private Turn turn;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new Game();
	}
public Game(){
	System.out.println("player 1 enter your name");
	p1 = new Player(scan.nextLine());
	System.out.println("player 2 enter your name");
	p2= new Player(scan.nextLine());
while (p1.getpoints()<3000 && p2.getpoints()<3000){
	System.out.println(p1.getplayername()+"Roll Dice");
	p1.changepoints(turn.round());
	System.out.println(p2.getplayername()+"Roll Dice");	
	p2.changepoints(turn.round());
	
}
if(p1.getpoints()>=3000 && p2.getpoints()>=3000)
	System.out.println("simultaniuos victory, sadly this counts as a tie");
else if(p1.getpoints()>=3000)
	System.out.println("Congratulations "+p1.getplayername()+" you are victorious with "+p1.getpoints());
else
	System.out.println("Congratulations "+p2.getplayername()+" you are victorious with "+p2.getpoints());
	}
}
	

