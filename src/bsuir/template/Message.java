package bsuir.template;

public class Message <T> {
	private T value;
	public Message() {
		// TODO Auto-generated constructor stub
	}
	public Message(T value){
		this.setValue(value);
	}
	public T getValue() {
		return value;
	}
	public void setValue(T value) {
		this.value = value;
	}
	public String toString(){
		if(value == null){
			return null;
		}
		return value.getClass().getName()+": "+value;
	}
	public String ifDone(){
		return "It works!";
	}
	
}
