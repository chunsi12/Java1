package day0319.reference;

public class StringMethodEx {

	public static void main(String[] args) {
		String personId = "0003193123456";
		char gender = personId.charAt(6);
		
		if(gender == '1' || gender == '3') {
			System.out.println("남자입니다.");
		}else if(gender == '2' || gender == '4') {
			System.out.println("여자입니다.");
		}
		System.out.println("ABCD".length());
		System.out.println(personId.length());
		System.out.println("".length());
		
	}

}
