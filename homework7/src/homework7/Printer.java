package homework7;

public class Printer {
	private String model; // ��
	private String manufact; // ������
	private String interfacetype; // �������̽�����
	private int printCount; // �μ�ż�
	private int paperCount; // �����ܷ�

	public void print() {
		paperCount--; // �����ܷ���������
		printCount++; // �μ�ż������

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
