package happyface;

import java.util.Random;

public class TurnAI implements AI {
	private Direction direction;

	@Override
	public Direction decideAttackAction() {
		decideAction();
		direction = getNextDirection(direction);
		return direction;
	}

	@Override
	public Direction decideDefenseAction() {
		decideAction();
		direction = getNextDirection(direction);
		return direction;
	}

	public void decideAction() {
		Random rnd = new Random();
		int num = rnd.nextInt(4);
		
		switch (num) {
		case 0:
			this.direction = Direction.DOWN;
			break;
		case 1:
			this.direction = Direction.UP;
			break;
		case 2:
			this.direction = Direction.LEFT;
			break;
		case 3:
			this.direction = Direction.RIGHT;
			break;
		default:
			this.direction = Direction.UP;
		}
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

