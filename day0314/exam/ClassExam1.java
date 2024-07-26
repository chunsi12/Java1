package day0314.exam;

import java.util.Scanner;

public class ClassExam1 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("삼각형의 밑변 > ");
		int width = s.nextInt();
		
		System.out.println("삼각형의 높이 > ");
		int height = s.nextInt();
		
		System.out.println("넓이 : "+((double)width*height/2));
		System.out.println("넓이 : "+(width*height/2.0));
		
			
	}

}
