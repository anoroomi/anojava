package homework11;

public class Stringex {

	public static void main(String[] args) {
		String a= new String("  양념치킨");
		String b= new String(",페페로니피자  ");
		
		System.out.println(a+"의 길이는 "+a.length());
		System.out.println(a.contains("치"));
		
		a=a.concat(b); //문자열 연결 
		System.out.println(a);
		
		a=a.trim();
		System.out.println(a);

		a=a.replace("양념","간장");
		System.out.println(a);
		
		String s[] = a.split(","); // 문자열 분리
		for (int i=0; i<s.length; i++)
		System.out.println("분리된 문자열" + i + ": " + s[i]);
		
		a = a.substring(5); // 인덱스 5부터 끝까지 서브 스트링 리턴
		System.out.println(a);
		
		char c = a.charAt(2); // 인덱스 2의 문자 리턴
		System.out.println(c);
		
		

		
	}

}
