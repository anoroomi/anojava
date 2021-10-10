package homework6;

import java.util.Scanner;

public class RectangleTest {
	public static void main(String[] args) {
		Rectangle[] r;
		int a = 0;
		double sum = 0;

		Scanner scanner = new Scanner(System.in);
		System.out.println("�� �簢���� ������ �Է��ϼ���.");
		a = scanner.nextInt();
		r = new Rectangle[a];

		for (int i = 0; i < r.length; i++) {
			r[i] = new Rectangle();
		}
		System.out.println(a + "���� �簢���� �ʱⰪ�� �ʺ�,���� " + r[0].getWidth() + "�Դϴ�.");
		for (int i = 0; i < r.length; i++) {
			System.out.println((i + 1) + "�� �簢���� ������ �ʺ�� ���̸� ��ĭ���� �и��Ͽ� �Է��ϼ���. ");
			int width = scanner.nextInt();
			int height = scanner.nextInt();
			r[i] = new Rectangle(width, height);
			sum += r[i].getArea();
			System.out.println((i + 1) + "�� �簢���� ������ " + r[i].getArea());
			System.out.println((i + 1) + "�� �簢���� ID�� " + r[i].getRectangleID());
			System.out.println("���� ������ �簢���� ������ " + Rectangle.getNumberOfRectangles() + "�� �Դϴ�.");
		}
		System.out.println("��� �簢���� ������ ����� " + (sum / a) + "�Դϴ�.");
		
		scanner.close();
	}
}
