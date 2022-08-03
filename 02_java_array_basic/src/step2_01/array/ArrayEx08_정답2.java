package step2_01.array;

import java.util.Random;

public class ArrayEx08_정답2 {
	/*
	 * # OMR카드
	 * 
	 * 1. 배열 answer는 시험문제의 정답지이다.
	 * 2. 배열 hgd에 1~5 사이의 랜덤 숫자 5개를 저장한다.
	 * 3. answer와 hgd 값을 비교해 정오표를 출력한다.
	 * 4. 한 문제당 20점이다.
	 * 
	 * 예)
	 * answer  = {1, 3, 4, 2, 5}
	 * hgd     = {1, 1, 4, 4, 3}
	 * 정오표  = {O, X, O, X, X}
	 * 성적    = 40점
	 */

		public static void main(String[] args) {
			
			int[] answer = {1, 3, 4, 2, 5};
			int[] hgd = new int[5];
			char[] mark = new char[5];
			
			for (int i = 0; i < 5; i++) {
				Random ran = new Random();
				hgd[i] = ran.nextInt(5) + 1;
			}
			
			for (int i = 0; i < 5; i++) {
				if (hgd[i] == answer[i]) {
					mark[i] = 'O';
				}
				else mark[i] = 'X';
			}
		}
			
}
		
	
