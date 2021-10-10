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
			System.out.println((i + 1) + "학년의 학생 수는 " + sum + "명 입니다.");
			sum = 0;
		}

		System.out.print("전체 학생 수는 " + sumAll + "명 입니다.");
		return 0;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("어느 학교의 학년 수를 입력하시오.>>");
		Scanner scanner = new Scanner(System.in);
		int numGrade = scanner.nextInt();
		int[][] intArray = new int[numGrade][];

		for (int i = 0; i < intArray.length; i++) {
			System.out.print(i + 1 + "학년의 반의 갯수를 입력하시오.>>");
			int numClass = scanner.nextInt();
			intArray[i] = new int[numClass];

		}
		for (int i = 0; i < intArray.length; i++) {
			for (int j = 0; j < intArray[i].length; j++) {
				System.out.print((i + 1) + "학년 " + (j + 1) + "반의 학생 수를 입력하시오.>>");
				intArray[i][j] = scanner.nextInt();
			}
		}

		sumOfClass(intArray);

		scanner.close();
	}

}
