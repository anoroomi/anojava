package homework10;

public class MeasurerTest {

	public static void main(String[] args) {
		Country[] countries = new Country[3];
		countries[0] = new Country("Uruguay", 176220, 3477000);
		countries[1] = new Country("Thailand", 513120, 69800000);
		countries[2] = new Country("Belgium", 30510, 11560000);

		Measurable areaMeas = new CountryAreaMeasurer();
		Measurable populMeas = new CountryPopulationMeasurer();

		double areaAverage = Data.average(countries, areaMeas);
		double populAverage = Data.average(countries, populMeas);
		
		System.out.println("Expected Average Area:239550 Population:28279000");
		System.out.println("-----------------------------------------------------");
		System.out.println("Average Area: "+areaAverage);
		System.out.println("Average Population: "+populAverage);

	}

}
