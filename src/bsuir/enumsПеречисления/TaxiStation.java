package bsuir.enumsПеречисления;

public enum TaxiStation {
	MERCEDEC(10), TOYOTA(7), VOLVO;
	private int freeCabs;
	TaxiStation() {
	}
	TaxiStation(int cabs){
		freeCabs = cabs;
	}
	public int getCabs(){
		return freeCabs;
	}
	public void setCabs(int cabs){
		freeCabs = cabs;
	}
	public String toString(){
		return String.format(name() + " : free cabs = "+freeCabs);
	}
}
