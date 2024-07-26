package day0319.reference;

public class StringmethodEx3 {
	//String 간 크기비교 : compareTo()사용
	public static void main(String[] args) {
		
		String str1= "ABC";
		String str2= "ABD";
		
		//boolean b = str1 > str2; //부등호 연산자는 숫자만 사용가능
		
		int i = str1.compareTo(str2);
		if(i == 0) {
			System.out.println("두 글자는 같습니다.");
		}else if (i > 0) {//did
			System.out.println(str1+ "이/가"+str2+"보다 큽니다.");
		}else if(i < 0) {
			System.out.println(str2+"이/가"+str1+"보다 큽니다.");
		}

	}

}
