package homework10;

public class CountryPopulationMeasurer implements Measurable {

	public double measure(Object anObject) {
		Country pCountry = (Country) anObject;
		int popul = pCountry.getPopul();
		return popul;

	}

}
