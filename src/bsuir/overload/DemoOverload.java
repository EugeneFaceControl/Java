package bsuir.overload;

public class DemoOverload {
	public static void printArgCount(int... args) {
		System.out.println("int args: " + args.length);
	}

	public static void printArgCount(Object... args) {
		System.out.println("Object args: " + args.length);
	}
//
	public static void printArgCount(Integer[]... args) {
		System.out.println("Integer[] args: " + args.length);
	}
	public static void printArgCount(Integer... args) {
		System.out.println("Integer args: " + args.length);
	}


	public static void main(String[] args) {
		Integer[] i = {1, 2, 3,4 ,5 };
		printArgCount(7, "No", true, null);
		printArgCount(i, i, i);
		printArgCount(i, 4, 71);
//		Тут вооще круто:
//		Тут просто Integer
		printArgCount(i);
//		Компилятор не может решить, через int выводить или Object
//		printArgCount(5, 6);
	}
}
