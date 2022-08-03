package step2_01.array;

import java.util.Random;

/*
 * # 학생성적관리 프로그램[1단계] : 학생점수
 */

//7:39 - 43
public class ArrayEx04_정답 {

	public static void main(String[] args) {
		
		int[] arr = new int[5];
		int sum = 0;
		int avg = 0;
		int passNum = 0;
		// 문제1) arr배열에 1~100점 사이의 랜덤 정수를 5개 저장
		// 예   1) 87, 11, 92, 14, 47
		
		for (int i = 0 ; i < 5; i++) {
			Random ran = new Random();
			arr[i] = ran.nextInt(100) + 1;
			
			if (arr[i] >= 60) {
				passNum++;
			}
			sum += arr[i];
			System.out.print(arr[i] + " ");
			
		}
		
		// 문제2) 전교생의 총점과 평균 출력
		// 예   2) 총점(251) 평균(50.2)
		avg = sum / 5;
		System.out.println();
		System.out.print("총점 (" + sum + ") ");
		System.out.println("평균 (" + avg + ")");
		
		
		// 문제3) 성적이 60점 이상이면 합격. 합격생 수 출력
		// 예   3) 2명
		
		System.out.println(passNum + "명");

	}
	
}
