package student;

public class Runner {
	public static void main(String[] args) {
		Info i = new Info();
		Students s = new Students();
		s.setInformation(i);
		System.out.println(i.getName()+i.getSurname());
	}
}
