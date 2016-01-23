package bsuir.varargs;

public class DemoVarargs {
//	... Значит неопрделенное количество
	public static int defineArgCount(Integer... args) {
		if (args.length == 0) {
			System.out.print(" No arg ");
		} else {
			int i = 1;
			for (int element : args) {

				System.out.print(" arg" + i + ": " + element);
				i++;
			}
		}
		return args.length;
	}

	public static void main(String[] args) {
		System.out.println(" N = " + defineArgCount(7, 71, 555));
		Integer[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		System.out.println(" N = " + defineArgCount(arr));
		System.out.println(defineArgCount());
		
//		Только одного типа
//		System.out.println(defineArgCount(arr, arr));
//		System.out.println(defineArgCount(71, arr));
	}
}
