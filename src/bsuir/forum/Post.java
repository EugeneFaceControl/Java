package bsuir.forum;

public class Post <T1, T2 extends Number>{
	private T1 message;
	private T2 id;
	public T1 getMessage(){
		return message;
	}
	public T2 getId() {
		return id;
	}
	public void setId(T2 id) {
		this.id = id;
	}
}
