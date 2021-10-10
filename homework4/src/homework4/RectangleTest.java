package homework4;

import java.util.Scanner;

public class RectangleTest {
	public static void main(String[] args) {
		Rectangle rect = new Rectangle();
		Scanner scanner = new Scanner(System.in);
		System.out.println("사각형의 너비와 높이를 빈칸으로 분리하여 입력하세요. ");
		rect.width = scanner.nextInt();
		rect.height = scanner.nextInt();
		System.out.println("사각형의 면적은 " + rect.getArea());
		scanner.close();
	}
}
