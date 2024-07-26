package day0319.reference;

public class ArrayEx1 {

	public static void main(String[] args) {
		//'j', 'a','v','a' 를 배열에 모아서 저장
		char [] carr = new char[4];//char 데이터를 저장할 수 있는 4칸 배열 생성
		
		carr[0] = 'j';
		carr[1] = 'a';
		carr[2] = 'v';
		carr[3] = 'a';
		//char[3] = 'a';
		//carr[4] = 'A';
		char c = carr [0];
		System.out.println("carr[0] : "+c);
		//for : 배열의 전체 데이터 출력
		for(int i = 0; i < 4; i++) {
			System.out.println(carr[i]);
		}
		for(int i = 0; i < carr.length; i++) {
			System.out.println(carr[i]);
		}
		System.out.println("carr.length :" + carr.length);
		
		System.out.println(carr);

	}

}
