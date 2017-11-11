package happyface;

public enum Direction {
	LEFT("左"), RIGHT("右"), UP("上"), DOWN("下");

	private final String value;

	private Direction(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
