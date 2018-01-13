package happyface;

public class HappyFace {
	public static void main(String[] args) {
		Player first = new Tanaka();
		Player last = new Sato();
		
		JadgementMan jadgementMan = new JadgementMan(first, last);
		jadgementMan.gameStart();
		jadgementMan.jadge();
	}
}
