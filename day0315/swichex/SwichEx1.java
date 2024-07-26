package day0315.swichex;

public class SwichEx1 {

	public static void main(String[] args) {
		int rank = 1;
		String medal;
		
		switch(rank) {//long을 제외한 정수형, string
		case 1 : 
			medal = "gold"; break;
		case 2 :
			medal = "silver"; break;
		case 3 :
			medal = "bronze"; break;
		default:
			medal = "dia"; 
		}
		System.out.println("your medal color is "+ medal);
		
		String lang = "en";
		switch(lang) {
		 case "ko": System.out.println("안녕하세요"); break;
		 case "en": System.out.println("hello"); break;
		 case "du": System.out.println("guten tag"); break;
		
		}

	}

}
