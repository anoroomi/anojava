package homework7;

public class InkjetPrinter extends Printer {
	private int inkLeft;
	private int printCount;
	private int paperCount;
	private String name;

	public void print() {
		paperCount--; // ¡æ¿Ã¿‹∑Æ«—¿Â¡Ÿ¿Ω
		printCount++; // ¿Œº‚∏≈ºˆ«—¿Â¥√
		inkLeft -= 10; // ¿◊≈©¡Ÿ¿Ω

	}

	public InkjetPrinter() {
		inkLeft = 3000;
		setModel("model default ink");
		setManufact("unknown ink");
		setInterfacetype("unknown ink");
		setPrintCount(0);
		setPaperCount(200);

	}

	public int getInkLeft() {
		return inkLeft;
	}

	public void setInkLeft(int inkLeft) {
		this.inkLeft = inkLeft;
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
