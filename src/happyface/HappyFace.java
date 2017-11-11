package happyface;

public class HappyFace {
	public static void main(String[] args) {
		Player first = new Player(new TurnAI(), "A");
		Player last = new Player(new UpperAI(), "B");
		
		JadgementMan jadgementMan = new JadgementMan(first, last);
		jadgementMan.gameStart();
		jadgementMan.jadge();
	}
}
