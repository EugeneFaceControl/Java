package bsuir.logic;

public class Department {
	{
		System.out.println(this.id);
	}
	static{
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
}
