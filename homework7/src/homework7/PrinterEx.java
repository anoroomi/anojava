package homework7;

public class PrinterEx {
	static void print(Printer p) {
		if (p instanceof Printer)
			System.out.print("Printer ");
		if (p instanceof LaserPrinter)
			System.out.print("LaserPrinter ");
		if (p instanceof InkjetPrinter)
			System.out.print("InkjetPrinter ");
		System.out.println();
	}

	public static void main(String[] args) {
		System.out.print("new Printer() ->\t"); // instance of 연습
		print(new Printer());
		System.out.print("new LaserPrinter() ->\t");
		print(new LaserPrinter());
		System.out.print("new InkjetPrinter() ->\t");
		print(new InkjetPrinter());

		Printer p = new InkjetPrinter(); // 업캐스팅
		InkjetPrinter i;
		System.out.println("p를 업캐스팅 했을때 모델>> " + p.getModel());
		i = (InkjetPrinter) p; // 다운캐스팅
		System.out.println("다운캐스팅 후 기존 잉크값  >> " + i.getInkLeft());
		i.setInkLeft(2000);
		System.out.println("다운캐스팅 후 지정해준 잉크값  >> " + i.getInkLeft());
		i.print();
		System.out.println("i print 1회 후 남은 잉크값   >> " + i.getInkLeft());
		System.out.println("i print 1회 후 남은 종이값 및 인쇄횟수   >> " + i.getPaperCount() + ", " + i.getPrintCount() + "회");
		LaserPrinter j = new LaserPrinter(); // laser printer도 작동하는지 테스트
		System.out.println("j 기존 토너값    >> " + j.getTonerLeft());
		j.print();
		System.out.println("j print 1회 후 남은 토너값   >> " + j.getTonerLeft());
		System.out.println("j print 1회 후 남은 종이값 및 인쇄횟수   >> " + j.getPaperCount() + ", " + j.getPrintCount() + "회");
	}
}