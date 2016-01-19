package bsuir.exam;

public class Runner {
	public static void main(String[] args) {
		Exam<Double> md1 = new Exam<>(71.41D, "Progr");
		Exam<Double> md2 = new Exam<>(71.45D, "Progr");
		System.out.println(md1.eqalsToMark(md2));

		Exam<Integer> mi = new Exam<>(71, "Progr");
		System.out.println(mi.eqalsToMark(md1));
	}
}
