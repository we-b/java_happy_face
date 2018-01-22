package happyface;

abstract public class Player {
	private AI ai;
	private int winCount = 0;
	private Profile profile;

	public Player() {
		 ai = createAi();
		 profile = createProfile();
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
		return profile.getName();
	}

	abstract protected Profile createProfile();
	abstract protected AI createAi();
}
