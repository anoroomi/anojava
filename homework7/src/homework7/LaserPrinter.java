package homework7;

public class LaserPrinter extends Printer {
	private int tonerLeft;
	private int printCount;
	private int paperCount;
	private String name;

	public void print() {
		paperCount--; // �����ܷ���������
		printCount++; // �μ�ż������
		tonerLeft -= 10; // �������

	}

	public LaserPrinter() {
		tonerLeft = 5000;
		setModel("model default laser");
		setManufact("unknown laser");
		setInterfacetype("unknown laser");
		setPrintCount(0);
		setPaperCount(300);

	}

	public int getTonerLeft() {
		return tonerLeft;
	}

	public void setTonerLeft(int tonerLeft) {
		this.tonerLeft = tonerLeft;
	}

	public int getPrintCount() {
		return printCount;
	}

	public void setPrintCount(int printCount) {
		this.printCount = printCount;
	}

	public int getPaperCount() {
		return paperCount;
	}

	public void setPaperCount(int paperCount) {
		this.paperCount = paperCount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
