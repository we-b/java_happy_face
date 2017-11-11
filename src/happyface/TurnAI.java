package happyface;

public class TurnAI implements AI {
	private Direction direction = Direction.DOWN;

	@Override
	public Direction decideAttackAction() {
		direction = getNextDirection(direction);
		return direction;
	}

	@Override
	public Direction decideDefenseAction() {
		direction = getNextDirection(direction);
		return direction;
	}

	private Direction getNextDirection(Direction preDirection) {
		switch (preDirection) {
		case LEFT:
			return Direction.UP;
		case UP:
			return Direction.RIGHT;
		case RIGHT:
			return Direction.DOWN;
		case DOWN:
			return Direction.LEFT;
		default:
			return Direction.UP;
		}
	}
}
