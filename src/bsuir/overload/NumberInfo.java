package bsuir.overload;

public class NumberInfo {
	public static void viewNum(Integer i){
		System.out.println("Integer = "+i);
	}
	public static void viewNum(int i){
		System.out.println("int = "+i);
	}
	public static void viewNum(Float i){
		System.out.println("Float = "+i);
	}
	public static void viewNum(Number i){
		System.out.println("Number = "+i);
	}
	public static void main(String[] args) {
		Number[] num = {new Integer(7), 71, 3.14f, 7.2};
		for (Number n : num){
			viewNum(n);
		}
		viewNum(new Integer(7));
		viewNum(71);
		viewNum(3.14f);
		viewNum(7.2);
	}
}
