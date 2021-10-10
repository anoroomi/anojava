package irregularArrayEx1;

import java.util.Scanner;

public class IrregularArrayEx1 {

	static int sumOfClass(int[][] arr) {
		int sum = 0;
		int sumAll = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
				sumAll += arr[i][j];
			}
			System.out.println((i + 1) + "�г��� �л� ���� " + sum + "�� �Դϴ�.");
			sum = 0;
		}

		System.out.print("��ü �л� ���� " + sumAll + "�� �Դϴ�.");
		return 0;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("��� �б��� �г� ���� �Է��Ͻÿ�.>>");
		Scanner scanner = new Scanner(System.in);
		int numGrade = scanner.nextInt();
		int[][] intArray = new int[numGrade][];

		for (int i = 0; i < intArray.length; i++) {
			System.out.print(i + 1 + "�г��� ���� ������ �Է��Ͻÿ�.>>");
			int numClass = scanner.nextInt();
			intArray[i] = new int[numClass];

		}
		for (int i = 0; i < intArray.length; i++) {
			for (int j = 0; j < intArray[i].length; j++) {
				System.out.print((i + 1) + "�г� " + (j + 1) + "���� �л� ���� �Է��Ͻÿ�.>>");
				intArray[i][j] = scanner.nextInt();
			}
		}

		sumOfClass(intArray);

		scanner.close();
	}

}
