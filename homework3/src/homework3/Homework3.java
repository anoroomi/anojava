package homework3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Homework3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("�̸��� �Է��ϼ���");
		Scanner scanner = new Scanner(System.in);

		String name = scanner.next(); // ���ڿ� �б�
		System.out.println("��� ���ø� �Է��ϼ���");
		String city = scanner.next(); // ���ڿ� �б�
		
		int age;
		double weight;
		boolean single;
		System.out.println("���̸� �Է��ϼ���");
		while (true) {

			try {
				age = scanner.nextInt();
			} // ���� �б�
			catch (InputMismatchException e) {
				System.out.println("������ �ƴմϴ�. �ٽ� �Է��ϼ���");
				scanner.next();
				continue;
			}
			break;
		}

		
		System.out.println("ü���� �Է��ϼ���");
		while (true) {
			try {
				weight = scanner.nextDouble();
			} catch (InputMismatchException e) {
				System.out.println("�Ǽ��� �ƴմϴ�. �ٽ� �Է��ϼ���");
				scanner.next();
				continue;
			}
			break;

		} // �Ǽ� �б�
		
		System.out.println("���ſ��θ� �Է��ϼ���");
		while (true) {
			try {
				single = scanner.nextBoolean();
			} // ���� �б�
			catch (InputMismatchException e) {
				System.out.println("true, false�� �Է��ϼ���");
				scanner.next();
				continue;
			}
			break;
		}
		System.out.print("�̸��� " + name + ", ��� ���ô� " + city + ", ���̴� " + age + "��, ü���� " + weight + "kg, ���� ���δ� " + single + "�Դϴ�.");
		scanner.close(); // scanner �ݱ�
	}

}