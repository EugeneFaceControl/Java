package genericclass;

public class ExamRunner {
	public static void main(String[] args) {
		Exam<Double> ob1 = new Exam<Double>(71D, "Works");
		Exam<Double> ob2 = new Exam<>(71D, "Well");
		if(ob1.equalsTomark(ob2))
			System.out.println("Everything is ok");
		else
			System.out.println("Try again(");
	}
}
