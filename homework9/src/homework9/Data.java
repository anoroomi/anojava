package homework9;

public class Data {

	public static double average(Measurable[] objects) {
		double sum = 0;
		for (Measurable obj : objects) {
			sum += obj.getMeasure();

		}
		if (objects.length > 0)
			return sum / objects.length;
		else
			return 0;

	}

	public static Measurable larger(Measurable obj1, Measurable obj2) {

		if (obj1.getMeasure() > obj2.getMeasure())
			return obj1;
		else
			return obj2;

	}

	public static Measurable smaller(Measurable obj1, Measurable obj2) {

		if (obj1.getMeasure() > obj2.getMeasure())
			return obj2;
		else
			return obj1;

	}
}
