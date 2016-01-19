package bsuir.exam;

public class Exam <T extends Number>{
	private String name;
	private T mark;
	public Exam(T mark, String name){
		this.setName(name);
		this.setMark(mark);
	}
	
		public T getMark() {
		return mark;
	}
	public void setMark(T mark) {
		this.mark = mark;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
		
}
//	@SuppressWarnings("unused")
	private double roundMark(){
		return Math.round(mark.doubleValue());
	}
	public boolean eqalsToMark(Exam<?> ob){
		return roundMark() == ob.roundMark(); 
	}
}