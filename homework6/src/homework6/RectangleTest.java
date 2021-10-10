package homework6;

import java.util.Scanner;

public class RectangleTest {
	public static void main(String[] args) {
		Rectangle[] r;
		int a = 0;
		double sum = 0;

		Scanner scanner = new Scanner(System.in);
		System.out.println("총 사각형의 개수를 입력하세요.");
		a = scanner.nextInt();
		r = new Rectangle[a];

		for (int i = 0; i < r.length; i++) {
			r[i] = new Rectangle();
		}
		System.out.println(a + "개의 사각형의 초기값은 너비,높이 " + r[0].getWidth() + "입니다.");
		for (int i = 0; i < r.length; i++) {
			System.out.println((i + 1) + "번 사각형의 측정된 너비와 높이를 빈칸으로 분리하여 입력하세요. ");
			int width = scanner.nextInt();
			int height = scanner.nextInt();
			r[i] = new Rectangle(width, height);
			sum += r[i].getArea();
			System.out.println((i + 1) + "번 사각형의 면적은 " + r[i].getArea());
			System.out.println((i + 1) + "번 사각형의 ID는 " + r[i].getRectangleID());
			System.out.println("현재 생성된 사각형의 개수는 " + Rectangle.getNumberOfRectangles() + "개 입니다.");
		}
		System.out.println("모든 사각형의 면적의 평균은 " + (sum / a) + "입니다.");
		
		scanner.close();
	}
}
