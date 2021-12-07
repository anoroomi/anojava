package homework10;

public class Data {

	public static double average(Object[] objects,Measurable meas) {
		double sum = 0.0;
		for (Object obj : objects) {
			sum += meas.measure(obj);

		}
		if (objects.length > 0)
			return sum / objects.length;
		else	
			return 0;

	}


}
