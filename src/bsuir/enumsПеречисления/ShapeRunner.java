package bsuir.enumsПеречисления;

public class ShapeRunner {
	public static void main(String[] args) {
		double x = 2, y = 3;
		Shape sh;
		sh = Shape.RECTANGLE;
		System.out.println(sh+" = "+ sh.defineSquare(x, y));
		sh = Shape.TRIAGLE;
		System.out.println(sh+" = "+ sh.defineSquare(x, y));
		sh = Shape.CIRCLE;
		System.out.println(sh+" = "+ sh.defineSquare(x, y));
		
	}
}
