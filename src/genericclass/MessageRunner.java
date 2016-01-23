package genericclass;

public class MessageRunner {
	public static void main(String[] args) {
		Message <Integer> ob1 = new Message<>();
		ob1.setValue(1);
		Integer v1 = ob1.getValue();
		System.out.println(v1);
		
		Message<String> ob2 = new Message <>("Java");
		String v2 = ob2.getValue();
		System.out.println(v2);
		
		@SuppressWarnings("rawtypes")
		Message ob3 = new Message();
		ob3 = ob1;
		System.out.println(ob3);
		ob3 = ob2;
		System.out.println(ob3);
		
		
	}
}
