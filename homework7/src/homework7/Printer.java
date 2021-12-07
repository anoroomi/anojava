package homework7;

public class Printer {
	private String model; // 모델
	private String manufact; // 제조사
	private String interfacetype; // 인터페이스종류
	private int printCount; // 인쇄매수
	private int paperCount; // 종이잔량

	public void print() {
		paperCount--; // 종이잔량한장줄음
		printCount++; // 인쇄매수한장늘

	}

	public Printer() {
		model = "default printer";
		manufact = "unknown manufact printer";
		interfacetype = "unknown interface printer";

	}

	public Printer(String name) {
		model = "default printer";
		manufact = "unknown manufact printer";
		interfacetype = "unknown interface printer";

	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getManufact() {
		return manufact;
	}

	public void setManufact(String manufact) {
		this.manufact = manufact;
	}

	public String getInterfacetype() {
		return interfacetype;
	}

	public void setInterfacetype(String interfacetype) {
		this.interfacetype = interfacetype;
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

}
