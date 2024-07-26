package day0314.conversion;

public class ConversionEx1 {

	public static void main(String[] args) {
		
		byte b1 = 10;
		int i1 = b1; // int = byte -> int = int
		
		System.out.println("b1 : "+b1);
		System.out.println("i1 : "+i1);
		
		int i2 = 300;
		byte b2 = (byte)i2;//큰 타입-> 작은 타입 정보손실이 발생함 -> 안됨
		//(변경할 타입)을 명시해서 손실이 발생하더라도 강제로 변환.
		System.out.println("b2 : "+b2);
		System.out.println("i2 : "+i2);

	}

}
