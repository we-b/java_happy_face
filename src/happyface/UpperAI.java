package happyface;

public class UpperAI implements AI {

	@Override
	public Direction decideAttackAction() {
		return Direction.UP;
	}

	@Override
	public Direction decideDefenseAction() {
		return Direction.UP;
	}

}
