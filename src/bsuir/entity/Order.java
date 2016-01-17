package bsuir.entity; //объект, сущность

public class Order {
//	private int id;
	static int bonus;
	public final int MIN_TAX = 8 + (int) (Math.random());
	public final static int PURCHASE_TAX = 6;
	
	public double calculatePrice(double price, double counter){
		double amount;
		amount = (price - bonus)*counter;
		double tax = amount*PURCHASE_TAX;
		return amount+tax;
	}
}
