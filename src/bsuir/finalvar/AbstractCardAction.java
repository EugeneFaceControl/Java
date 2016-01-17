package bsuir.finalvar;

public abstract class AbstractCardAction {
	private Long account;
	public AbstractCardAction(){
		
	}
	public abstract void doPayment(double amountPayment);
	
	public void setAccount(Long account){
		this.account = account;
	}
}
