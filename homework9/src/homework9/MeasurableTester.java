package homework9;

import java.util.Arrays;

public class MeasurableTester {

	public static void main(String[] args) {
		Measurable[] accounts = new Measurable[3];
		accounts[0] = new BankAccount(6000);
		accounts[1] = new BankAccount(1000);
		accounts[2] = new BankAccount(2000);

		Arrays.sort(accounts);

		for(Measurable me:accounts) {
			System.out.print(((BankAccount)me).getBalance()+" ");
		}
		System.out.println();
		

		double averageBalance = Data.average(accounts);
		System.out.println("Average balance: " + averageBalance);

		Measurable[] countries = new Measurable[3];

		countries[0] = new Country("Uruguay", 176220);
		countries[1] = new Country("Thailand", 513120);
		countries[2] = new Country("Belgium", 30510);
		
		Arrays.sort(countries);
		for(Measurable me1:countries) {
			System.out.print(((Country)me1).getName()+": "+((Country)me1).getArea()+" ");
		}
		System.out.println();
	
		
		double averageArea = Data.average(countries);
		System.out.println("Average area: " + averageArea);

		Measurable maxCountry = Data.larger(countries[0], countries[1]);
		Country maxCountry1 = (Country) maxCountry;
		String name = maxCountry1.getName();
		System.out.println("the larger country between " + ((Country) countries[0]).getName() + " and "
				+ ((Country) countries[1]).getName() + " is " + name);

		Measurable minCountry = Data.smaller(countries[1], countries[2]);
		Country minCountry1 = (Country) minCountry;
		String name1 = minCountry1.getName();
		System.out.println("the smaller country between " + ((Country) countries[1]).getName() + " and "
				+ ((Country) countries[2]).getName() + " is " + name1);

	}

}
