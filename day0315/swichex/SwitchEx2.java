package day0315.swichex;

public class SwitchEx2 {

	public static void main(String[] args) {
		int year = 2024;
		int month = 3;
		int day = 0;
		switch (month) {
		case 1: case 3 : case 7: case 8: case 10 : case 12:
			day = 31;
		case 4: case 6: case 9: case 11:
			day = 30;
		case 2:
			if((year % 4 == 0 && year % 100 !=0)|| year % 400 == 0) {
				day = 29;
			}else day = 28;
			break;
		}//switch end
		System.out.printf("%d년 %d월의 마지막 날은 %d일 입니다.", year, month, day);

	}

}
