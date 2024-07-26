package day0315.ifex;

public class IfEx2 {

	public static void main(String[] args) {
		int no = 100;
		String str = "50미만";
		
		if(no >= 50) {
			str = "50이상";
		}
		System.out.println(no + ":"+str);

	}

}
