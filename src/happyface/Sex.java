package happyface;

public enum Sex {
	MAN("男"), WOMAN("右");

	private final String value;

	private Sex(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

}
