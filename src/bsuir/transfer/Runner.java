package bsuir.transfer;
import bsuir.transfer.bean.Account;
public class Runner {
	public static void main(String[] args) {
		Account from = new Account(78031864L, 285.5);
		Account to = new Account(58510009L, 12.1);
		TransferAction action = new TransferAction(52.0);
		boolean complete = action.transferIntoAccount(from, to);
		if(complete){
			System.out.print("Сумма " + action.getTransactionAmount()+ " переведена успешно");
			System.out.println(" на счет "+to.getId());
			System.out.println("На его счету находится сумма: "+ to.getAmount());
			System.out.println("На счету "+ from.getId()+" осталось " + from.getAmount());
		}
	}
}
