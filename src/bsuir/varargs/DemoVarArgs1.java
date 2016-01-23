package bsuir.varargs;

public class DemoVarArgs1 {
	public static int defineArgCount(Integer... args){
		if(args.length == 0)
			System.out.println("No args!");
		else{
			for(int i = 0;i<args.length;i++){
				System.out.print(args[i]+" ");
			}
		}
		return args.length;
	}
	public static void defineArgCount(int x1, int x2){
		System.out.println();
		System.out.println(x1*x2);
	}
	@SuppressWarnings("static-access") //Õì
	public static void main(String[] args) {
		DemoVarArgs1 dva1 = new DemoVarArgs1();
		dva1.defineArgCount(5464, 656, 46);
		dva1.defineArgCount(1231232213, 1212312312);
	}
}

