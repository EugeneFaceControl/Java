package bsuir.immutable;

public class ImmutableObject {
	private String name;

	@SuppressWarnings("unused") // подавляющие предупреждения
	private int id;

	public ImmutableObject(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
