package bsuir.transfer;
import bsuir.transfer.bean.Account;
public class TransferAction {
	//60
	private double transactionAmount; 
	public TransferAction (double amount){
		if(amount>0){
			transactionAmount = amount;
		} else {
			throw new IllegalArgumentException();
		}
	}
	
	public boolean transferIntoAccount(Account from, Account to){
		//getAmount 90
		double demand = from.getAmount()-transactionAmount; //demand - остаток, а вообще спрос
		if(demand>=0){
			from.setAmount(demand); //30
			to.addAmount(transactionAmount);//60
			return true;
		} else {
			return false;
		}
	}
	public double getTransactionAmount() {
		return transactionAmount;
	}
	
}
