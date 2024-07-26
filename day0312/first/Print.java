package day0312.first;

public class Print {
	
	public static void main(String[] args) {
		//System.out : 프로그램과 연결된 화면으로 내보낸다.
		System.out.println("출력 후 줄바꿈");
		//print : 내용 출력
		//ln : line Feed + Carriage Return : 줄바꿈(enter)
		System.out.print("출력");
		System.out.printf("포맷해서 출력");
		System.out.println();//줄바꿈
		//System.out.print(); 내용이 없는 print()는 존재하지 않음=>사용 X
		System.out.println();//줄바꿈
		System.out.printf("%d * %d = %d", 10, 20, 200);
	}

}