package bsuir.transfer2;

import bsuir.transfer.bean.Account;

public class TransferAction {
	public static double transactionAmount;
//	private int id;

	public static boolean transferIntoAccount(Account from, Account to) {
		double demand = from.getAmount() - transactionAmount;
		if (demand >= 0) {
			from.setAmount(demand);
			to.addAmount(transactionAmount);
			return true;
		} else {
			return false;
		}
		

	}
	public void increaseAmount(){
		transactionAmount ++;
	}
}
