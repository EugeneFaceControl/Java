package bsuir.transfer2;

import bsuir.transfer.bean.Account;

public class Runner {
	public static void main(String[] args) {
		Account from = new Account(78031864L, 285.5);
		Account to = new Account(58510009L, 12.1);
		TransferAction.transferIntoAccount(from, to);
		TransferAction.transactionAmount = 70.5;
	}
}
