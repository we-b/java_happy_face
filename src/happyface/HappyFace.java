package happyface;

public class HappyFace {
	public static void main(String[] args) {
		Player first = new Tanaka();
		Player last = new Sato();

		JudgementMan judgementMan = new JudgementMan(first, last);
		judgementMan.gameStart();
		judgementMan.judge();
	}
}
