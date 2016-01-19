package bsuir.template;

public class Runner {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Message <Integer> ob1 = new Message<>();
		ob1.setValue(1);
		@SuppressWarnings("unused")
		int v1 = ob1.getValue();
		System.out.println(ob1);
		
		Message<String> ob2 = new Message<>("Java");
		String v2 = ob2.getValue();
		System.out.println(v2);
		
		@SuppressWarnings("rawtypes") //suppress - подавлять
		Message ob3 = new Message(); //raw type - обычный тип
		ob3 = ob1;
		System.out.println(ob3.getValue());
		ob3.setValue(new Byte((byte) 1));
		ob3.setValue("Java SE 7");
		System.out.println(ob3);
		ob3.setValue(71);
		System.out.println(ob3);
		ob3.setValue(null);
	}
}
