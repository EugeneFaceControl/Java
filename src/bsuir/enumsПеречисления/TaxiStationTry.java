package bsuir.enumsПеречисления;

public enum TaxiStationTry {
	RENO(10), VOLVO(5), KIA;
	
	private int freeCabs;
	TaxiStationTry(){
	}
	TaxiStationTry(int freeCabs){
		this.setFreeCabs(freeCabs);
	}
	public int getFreeCabs() {
		return freeCabs;
	}
	public void setFreeCabs(int freeCabs) {
		this.freeCabs = freeCabs;
	}
	
	@Override
	public String toString() {
		return name()+": free cabs = "+freeCabs;
	}
}
