package bsuir.transfer;
import bsuir.transfer.bean.Account;
public class Runner {
	public static void main(String[] args) {
		Account from = new Account(78031864L, 285.5);
		Account to = new Account(58510009L, 12.1);
		TransferAction action = new TransferAction(52.0);
		boolean complete = action.transferIntoAccount(from, to);
		if(complete){
			System.out.print("����� " + action.getTransactionAmount()+ " ���������� �������");
			System.out.println(" �� ���� "+to.getId());
			System.out.println("�� ��� ����� ��������� �����: "+ to.getAmount());
			System.out.println("�� ����� "+ from.getId()+" �������� " + from.getAmount());
		}
	}
}
