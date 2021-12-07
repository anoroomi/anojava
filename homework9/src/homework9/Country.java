package homework9;

public class Country implements Measurable, Comparable {

	private String name;
	private double area;
	
	public Country(String name, double area) {
		this.name=name;
		this.area=area;
		
		
	}
	public int compareTo(Object otherObject) {
		Country other = (Country) otherObject;
		if (this.area < other.area)
			return -1;
		if (this.area > other.area)
			return 1;
		return 0;
	}

	public String getName() {
		return name;
	}

	public double getArea() {
		return area;
	}

	public double getMeasure() {
		return area;
	}

}
