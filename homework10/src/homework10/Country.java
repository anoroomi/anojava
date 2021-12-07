package homework10;

public class Country{

	private String name;
	private double area;
	private int popul;
	
	public Country(String name, double area, int popul) {
		this.name=name;
		this.area=area;
		this.popul=popul;
		
	}

	public String getName() {
		return name;
	}

	public double getArea() {
		return area;
	}


	public int getPopul() {
		return popul;
	}

}
