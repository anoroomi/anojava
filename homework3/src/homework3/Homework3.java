package homework3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Homework3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("이름을 입력하세요");
		Scanner scanner = new Scanner(System.in);

		String name = scanner.next(); // 문자열 읽기
		System.out.println("사는 도시를 입력하세요");
		String city = scanner.next(); // 문자열 읽기
		
		int age;
		double weight;
		boolean single;
		System.out.println("나이를 입력하세요");
		while (true) {

			try {
				age = scanner.nextInt();
			} // 정수 읽기
			catch (InputMismatchException e) {
				System.out.println("정수가 아닙니다. 다시 입력하세요");
				scanner.next();
				continue;
			}
			break;
		}

		
		System.out.println("체중을 입력하세요");
		while (true) {
			try {
				weight = scanner.nextDouble();
			} catch (InputMismatchException e) {
				System.out.println("실수가 아닙니다. 다시 입력하세요");
				scanner.next();
				continue;
			}
			break;

		} // 실수 읽기
		
		System.out.println("독신여부를 입력하세요");
		while (true) {
			try {
				single = scanner.nextBoolean();
			} // 논리값 읽기
			catch (InputMismatchException e) {
				System.out.println("true, false로 입력하세요");
				scanner.next();
				continue;
			}
			break;
		}
		System.out.print("이름은 " + name + ", 사는 도시는 " + city + ", 나이는 " + age + "살, 체중은 " + weight + "kg, 독신 여부는 " + single + "입니다.");
		scanner.close(); // scanner 닫기
	}

}