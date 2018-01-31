package happyface;

public class JudgementMan {
	private static final int GAME_MAX_COUNT = 10;
	private Player firstPlayer;
	private Player lastPlayer;

	public JudgementMan(Player firstPlayer, Player lastPlayer) {
		super();
		this.firstPlayer = firstPlayer;
		this.lastPlayer = lastPlayer;
	}

	public void gameStart() {
		System.out.println("ゲームスタート！");

		for (int i = 0; i < GAME_MAX_COUNT; i++) {
			System.out.println(String.format("\n【%d回戦目】_______________", i + 1));
			// 先攻のターン
			System.out.println(String.format("\n~先行の%sさんのターンです~", firstPlayer.getName()));
			battle(firstPlayer, lastPlayer);
			// 後攻のターン
			System.out.println(String.format("\n~後攻の%sさんのターンです~", lastPlayer.getName()));
			battle(lastPlayer, firstPlayer);
		}

	}

	public void judge(){
		System.out.println("\nゲーム終了!!\n結果発表をします\n");
		System.out.println(String.format("%sさんの勝利数: %d", firstPlayer.getName(), firstPlayer.getWinCount()));
		System.out.println(String.format("%sさんの勝利数: %d", lastPlayer.getName(), lastPlayer.getWinCount()));

		Player winner = judgeWinner(firstPlayer, lastPlayer);

		if (winner == null) {
			System.out.println("\nよって、、、引き分けです！(〃`･н･´〃)");
		} else {
			System.out.println(String.format("\nよって、、、勝者は%sさんです！＿（＾＾＃）（＃＾＾）／", winner.getName()));
		}

	}

	private void battle(Player firstPlayer, Player lastPlayer) {
		System.out.println(String.format("%sさん：「あっちむいてホイ！」\n", firstPlayer.getName()));
		if (attack(firstPlayer, lastPlayer)) {
			firstPlayer.notifyWin();
			System.out.println(String.format("%sさん攻撃成功ヾ(⌒(ﾉ'ω')ﾉわーい", firstPlayer.getName()));
		} else {
			System.out.println(String.format("%sさん攻撃失敗、、、ヾ(｡>﹏<｡)ﾉ", firstPlayer.getName()));
		}
	}

	private boolean attack(Player attack, Player defense) {
		Direction attackDirection = attack.offense();
		Direction defenceDirection = defense.defense();

		System.out.println(String.format("%sさんは%sを指した！", attack.getName(), attackDirection.getValue()));
		System.out.println(String.format("%sさんは%sを向いた！", defense.getName(), defenceDirection.getValue()));

		if (attackDirection.equals(defenceDirection)) {
			return true;
		}
		return false;
	}

	private Player judgeWinner(Player firstPlayer, Player lastPlayer) {
		if (firstPlayer.getWinCount() == lastPlayer.getWinCount()) {
			return null;
		} else if (firstPlayer.getWinCount() > lastPlayer.getWinCount()) {
			return firstPlayer;
		}
		return lastPlayer;
	}
}

