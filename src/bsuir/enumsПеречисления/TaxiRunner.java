package bsuir.enumsПеречисления;

public class TaxiRunner {
	public static void main(String[] args) {
		TaxiStation ts = TaxiStation.valueOf(TaxiStation.class, "Volvo".toUpperCase());
		// ordinal - порядковый номер
		System.out.println(ts + " : ordinal -> "+ ts.ordinal());	
		ts.setCabs(3);
		TaxiStation []station = TaxiStation.values();
		for(TaxiStation element: station){
			System.out.println(element);
		}
		
	}
}
