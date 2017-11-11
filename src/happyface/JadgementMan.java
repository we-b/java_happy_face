package happyface;

public class JadgementMan {
	private static final int GAME_MAX_COUNT = 10;
	private Player firstPlayer;
	private Player lastPlayer;
	
	public JadgementMan(Player firstPlayer, Player lastPlayer) {
		super();
		this.firstPlayer = firstPlayer;
		this.lastPlayer = lastPlayer;
	}

	public void gameStart() {

		for (int i = 0; i < GAME_MAX_COUNT; i++) {
			// 先攻のターン
			battle(firstPlayer, lastPlayer);
			// 後攻のターン
			battle(lastPlayer, firstPlayer);
		}

	}

	public void jadge(){
		System.out.println(String.format("%sの勝利数: %d", firstPlayer.getName(), firstPlayer.getWinCount()));
		System.out.println(String.format("%sの勝利数: %d", lastPlayer.getName(), lastPlayer.getWinCount()));

		Player winner = jadgeWinner(firstPlayer, lastPlayer);

		if (winner == null) {
			System.out.println("引き分けです！");
		} else {
			System.out.println(String.format("勝者は%sです！", winner.getName()));
		}

	}
	
	private void battle(Player firstPlayer, Player lastPlayer) {
		System.out.println("あっちむいてホイ！");
		if (attack(firstPlayer, lastPlayer)) {
			firstPlayer.notifyWin();
			System.out.println(String.format("%sの勝利です", firstPlayer.getName()));
		}
	}

	private boolean attack(Player attack, Player defense) {
		Direction attackDirection = attack.offense();
		Direction defenceDirection = defense.defense();

		System.out.println(String.format("%sは%sを指した！", attack.getName(), attackDirection.getValue()));
		System.out.println(String.format("%sは%sを向いた！", defense.getName(), defenceDirection.getValue()));

		if (attackDirection.equals(defenceDirection)) {
			return true;
		}
		return false;
	}

	private Player jadgeWinner(Player firstPlayer, Player lastPlayer) {
		if (firstPlayer.getWinCount() == lastPlayer.getWinCount()) {
			return null;
		} else if (firstPlayer.getWinCount() > lastPlayer.getWinCount()) {
			return firstPlayer;
		}
		return lastPlayer;
	}
}
