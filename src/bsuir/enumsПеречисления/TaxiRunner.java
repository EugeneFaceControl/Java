package bsuir.enums������������;

public class TaxiRunner {
	public static void main(String[] args) {
		TaxiStation ts = TaxiStation.valueOf(TaxiStation.class, "Volvo".toUpperCase());
		// ordinal - ���������� �����
		System.out.println(ts + " : ordinal -> "+ ts.ordinal());	
		ts.setCabs(3);
		TaxiStation []station = TaxiStation.values();
		for(TaxiStation element: station){
			System.out.println(element);
		}
		
	}
}
