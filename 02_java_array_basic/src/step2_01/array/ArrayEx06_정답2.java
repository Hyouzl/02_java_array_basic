package step2_01.array;

import java.util.Scanner;

public class ArrayEx06_정답2 {

	public static void main(String[] args) {

		int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
		int[] scores  = {  87,   11,   45,   98,   23};
		
		// 문제) 학번을 입력받아 성적 출력
		// 		단, 없는학번 입력 시 예외처리
		// 예)
		// 학번 입력 : 1002		성적 : 11점
		// 학번 입력 : 1000		해당학번은 존재하지 않습니다.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("학번 입력 : ");
		int num = scan.nextInt();
		int score = 0;
		boolean isHakbun = false;
		
		for (int i = 0; i < 5; i++) {
			if (num == hakbuns[i]) {
				isHakbun = true;
				score = scores[i];
			}
		}
		
		if (isHakbun == true) {
			System.out.println("성적 : " + score + "점");
		}
		else System.out.println("해당학번은 존재하지 않습니다.");
		
		
		
	}

}
