package studentHogwards;

public class Runner {
	public static void main(String[] args) {
		Student s = new Student();
		s.setFaculty("Gryffindor");
		StudentsMatrix sm = new StudentsMatrix();
		SelectFaculty sf = new SelectFaculty();
		sf.selection(sm, s);
		sf.printing();
	}
}
