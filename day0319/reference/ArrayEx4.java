package day0319.reference;

import java.util.Arrays;

public class ArrayEx4 {

	public static void main(String[] args) {
		// 100, 98, 100, 88, 90
		// 5개의 성적의 총점, 평균, 최대값, 최소값을 출력하세요
		
		int sum = 0;
		int [] score = {100, 98, 100, 88, 90};
		double avg = 0.0;
		for(int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		avg = (double)sum / score.length;
		System.out.println("총점 : "+sum);
		System.out.printf("평균 : %.2f", avg);
		
		int max = score[0];
		int min = score[0];
		
		for(int i = 1; i < score.length; i++) {
			//최대값 
			if(max < score[i]) {
				max = score [i]; //새로 꺼내온 값이 더 크면 max 값이 변경
			}
			//최소값
			if(min > score[i]) {
				min = score [i]; //새로 꺼내온 값이 더 작으면 min 변경
			}
		}
		System.out.println("MAX : "+max);
		System.out.println("MIN : "+min);
		
		//오름차순 정렬 -메모리에 저장된 배열내 순서를 변경
		Arrays.sort(score);
		System.out.println(Arrays.toString(score));//배열 안에 있는 내용을 한줄(문자열)로 꺼내옴
		//int[] 변수 출력시 -> 배열 타입@배열 주소 (16진수)

	}

}
