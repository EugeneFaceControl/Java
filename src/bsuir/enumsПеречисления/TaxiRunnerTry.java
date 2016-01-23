package bsuir.enumsПеречисления;

public class TaxiRunnerTry {
	public static void main(String[] args) {
		TaxiStationTry ts = TaxiStationTry.KIA;
		System.out.println(ts+" ordinal -> "+ ts.ordinal());
		
		TaxiStationTry []station = TaxiStationTry.values();
		for(TaxiStationTry elem : station){
			System.out.println(elem);
		}
	}
}
