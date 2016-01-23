package bsuir.enums������������;

public enum Shape {
	RECTANGLE, TRIAGLE, CIRCLE;

	public double defineSquare(double... x) { // �������
		System.out.println(this.ordinal());
		switch (this) {
		case RECTANGLE: // �������������
			return x[0] * x[1];
		case TRIAGLE: // �����������
			return x[0] * x[1] / 2;
		case CIRCLE: // ����
			return Math.pow(x[0], 2) * Math.PI;
		default:
throw new EnumConstantNotPresentException(this.getDeclaringClass(), this.name());
		}
	}
}
