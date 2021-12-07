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
		System.out.print("new Printer() ->\t"); // instance of ����
		print(new Printer());
		System.out.print("new LaserPrinter() ->\t");
		print(new LaserPrinter());
		System.out.print("new InkjetPrinter() ->\t");
		print(new InkjetPrinter());

		Printer p = new InkjetPrinter(); // ��ĳ����
		InkjetPrinter i;
		System.out.println("p�� ��ĳ���� ������ ��>> " + p.getModel());
		i = (InkjetPrinter) p; // �ٿ�ĳ����
		System.out.println("�ٿ�ĳ���� �� ���� ��ũ��  >> " + i.getInkLeft());
		i.setInkLeft(2000);
		System.out.println("�ٿ�ĳ���� �� �������� ��ũ��  >> " + i.getInkLeft());
		i.print();
		System.out.println("i print 1ȸ �� ���� ��ũ��   >> " + i.getInkLeft());
		System.out.println("i print 1ȸ �� ���� ���̰� �� �μ�Ƚ��   >> " + i.getPaperCount() + ", " + i.getPrintCount() + "ȸ");
		LaserPrinter j = new LaserPrinter(); // laser printer�� �۵��ϴ��� �׽�Ʈ
		System.out.println("j ���� ��ʰ�    >> " + j.getTonerLeft());
		j.print();
		System.out.println("j print 1ȸ �� ���� ��ʰ�   >> " + j.getTonerLeft());
		System.out.println("j print 1ȸ �� ���� ���̰� �� �μ�Ƚ��   >> " + j.getPaperCount() + ", " + j.getPrintCount() + "ȸ");
	}
}