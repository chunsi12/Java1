package day0315.operator;

public class OperatorEx7 {

	public static void main(String[] args) {
		int i = 10;//1010
		int j = 7; //0111
		
		System.err.println(i & j);//빨강글씨// 2
		System.out.println(i | j);
		System.out.println(i ^ j);
		System.out.println(~i);//0 00001010->1 11110101
		
		System.out.println(i << 2);// 00001010 // 10*2의 2승= 40
		System.out.println(i >> 2);// 00001010 // 10/2의 2승= 2
		
	}

}
