package day0314.conversion;

public class ConversionEx2 {

	public static void main(String[] args) {
		short s1 = 10;
		short s2 = 20;
		
		//short s3 = s1 + s2;
		short s3 = (short)(s1 + s2);
		// 10과 20이라는 값을 꺼내온다 -> int, 저장하는 공간도 int로 바꿈
		int s4 = s1 + s2;
		System.out.println(s3);
		
		

		System.out.println('A'+'B'); //'A':65, 'B':66//131
		System.out.println("A"+"B"); //이어쓰기 AB
		System.out.println("A"+'B'); // AB String은 문자열 => char가 여러개 있는 모양

	}

}
