package bsuir.genericmethod;

public class SimpleActionCourse {
	public <T1 extends Course> SimpleActionCourse(T1 course){
		
	}
	public <T2> SimpleActionCourse(){
		
	}
	public <T3 extends Course> int calculateMark(T3 course){
		return course.course;
	}
	public <T4 extends Course> boolean printReport(T4 course){
		if(course != null){
			return true;
		} else
			return false;
	}
	public <T5> void check(){
		System.out.println("Вот так вот");
	}
}
