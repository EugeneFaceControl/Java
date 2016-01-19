package bsuir.logic;

public class Department {
	{
		System.out.println("logic(1)"+this.id);
	}
	static{
//		Один раз вызывается
		System.out.println("static logic");
	}
	private int id = 7;
	public Department(int id){
		this.id = id;
		System.out.println("конструктор id= "+id);
	}
	public int getID(){
		return id;
	}
	{
		System.out.println("logic(2)"+this.id);
	}
}
