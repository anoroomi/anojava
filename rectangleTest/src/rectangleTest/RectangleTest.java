package rectangleTest;

import java.util.Scanner;

class Rectangle {
	int width;
	int height;

	public int getArea() {
		return width * height;
	}

}

public class RectangleTest {
	public static void main(String[] args) {
		Rectangle rect = new Rectangle();
		Scanner scanner = new Scanner(System.in);
		System.out.println("�簢���� �ʺ�� ���̸� ��ĭ���� �и��Ͽ� �Է��ϼ���. ");
		rect.width = scanner.nextInt();
		rect.height = scanner.nextInt();
		System.out.println("�簢���� ������ " + rect.getArea());
		scanner.close();
	}
}
