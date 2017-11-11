package happyface;

public class Player {
	private AI ai;
	private String name;
	private int winCount = 0;

	public Player(AI ai, String name) {
		super();
		this.ai = ai;
		this.name = name;		this.winCount = 0;
	}

	public Direction offense() {
		return ai.decideAttackAction();
	}

	public Direction defense() {
		return ai.decideDefenseAction();
	}
	
	public void notifyWin()
	{
		winCount += 1;
	}
	
	public int getWinCount(){
		return winCount;
	}
	
	public String getName() {
		return name;
	}
	
	
}
