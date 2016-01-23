package genericclass;

public class Exam <T extends Number>{
	@SuppressWarnings("unused")
	private String name;
	private T mark;
	
	public Exam(T mark, String name){
		this.mark = mark;
		this.name = name;
	}
	
	public T getMark(){
		return mark;
	}
	
	private double getRound(){
		return Math.round(mark.doubleValue());
	}
	
	public boolean equalsTomark(Exam <T> ob){
		return getRound() == ob.getRound();
	}
}
