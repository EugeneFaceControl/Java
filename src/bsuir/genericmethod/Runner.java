package bsuir.genericmethod;

public class Runner {
	public static void main(String[] args) {
		SimpleActionCourse sap = new SimpleActionCourse(new Course());
		System.out.println(sap.printReport(new Course(7112)));
//		System.out.println(sap.printReport(3543));
		SimpleActionCourse sa = new <String> SimpleActionCourse();
		System.out.println(sa.calculateMark(new Course(454)));
		sa.<Integer>check();
	}
}
