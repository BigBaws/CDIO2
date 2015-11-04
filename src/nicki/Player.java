package nicki;

public class Player {

	private String name;

	private Bank b = new Bank();

	public Player(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPoints() {
		return b.getPlayerScore();
	}

	public void setPoints(int points) {
		b.setPlayerScore(points);
		if (b.getPlayerScore() < 0) {
			b.setPlayerScore(0);
		}
	}

}
