package bsuir.immutable;

public class ImmutableRunner {
	public static void main(String[] args) {
		ImmutableObject io = new ImmutableObject("Hi", 432);
		System.out.println(io.getName());
		io.setName("New");
		System.out.println(io.getName());
	}
}
