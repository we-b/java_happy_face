package happyface;

public class UpDownAI implements AI {
	private int count = 0;

	@Override
	public Direction decideAttackAction() {
		count++;
		if (count % 2 == 0) {
			return Direction.UP;
		}
		return Direction.DOWN;
	}

	@Override
	public Direction decideDefenseAction() {
		if (count % 2 == 0) {
			return Direction.UP;
		}
		return Direction.DOWN;
	}
}
