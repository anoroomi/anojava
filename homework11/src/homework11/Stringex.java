package homework11;

public class Stringex {

	public static void main(String[] args) {
		String a= new String("  ���ġŲ");
		String b= new String(",����δ�����  ");
		
		System.out.println(a+"�� ���̴� "+a.length());
		System.out.println(a.contains("ġ"));
		
		a=a.concat(b); //���ڿ� ���� 
		System.out.println(a);
		
		a=a.trim();
		System.out.println(a);

		a=a.replace("���","����");
		System.out.println(a);
		
		String s[] = a.split(","); // ���ڿ� �и�
		for (int i=0; i<s.length; i++)
		System.out.println("�и��� ���ڿ�" + i + ": " + s[i]);
		
		a = a.substring(5); // �ε��� 5���� ������ ���� ��Ʈ�� ����
		System.out.println(a);
		
		char c = a.charAt(2); // �ε��� 2�� ���� ����
		System.out.println(c);
		
		

		
	}

}
