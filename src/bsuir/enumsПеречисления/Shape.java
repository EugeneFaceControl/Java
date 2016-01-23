package bsuir.enumsПеречисления;

public enum Shape {
	RECTANGLE, TRIAGLE, CIRCLE;

	public double defineSquare(double... x) { // квадрат
		System.out.println(this.ordinal());
		switch (this) {
		case RECTANGLE: // прямоугольник
			return x[0] * x[1];
		case TRIAGLE: // треугольник
			return x[0] * x[1] / 2;
		case CIRCLE: // круг
			return Math.pow(x[0], 2) * Math.PI;
		default:
throw new EnumConstantNotPresentException(this.getDeclaringClass(), this.name());
		}
	}
}
