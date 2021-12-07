package homework10;

public class CountryAreaMeasurer implements Measurable {

	public double measure(Object anObject) {
		Country aCountry=(Country)anObject;
		double area=aCountry.getArea();
		return area;
	}

}
