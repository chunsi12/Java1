package day0319.reference;

public class NullPointerEx {

	public static void main(String[] args) {
		String s = "AAA";
		String n = null; //모든 참조형 타입 변수는 null값을 저장할 수 있다.
		
		System.out.println(s);
		System.out.println(n);
		
		System.out.println(s.equals(n)); //객체가 없는데 그 객체 사용시 nullPointerException 발생
		
		System.out.println("프로그램 종료");

	}

}
