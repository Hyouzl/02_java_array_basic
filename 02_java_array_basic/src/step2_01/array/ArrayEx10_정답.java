package step2_01.array;

import java.util.Scanner;

/*
 * # 즉석복권
 * 
 * 1. 숫자 7이 연속으로 3번 등장하면, 당첨복권이다.
 * 2. 메뉴를 선택해서 1번 2번 3번이 당첨인지 확인한다.
 * 3. 0번은 반복문을 종료한다.
 * 
 */

//21
public class ArrayEx10_정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] lotto1 = {0, 0, 7, 7, 7, 0, 0, 0};
		int[] lotto2 = {7, 0, 7, 7, 0, 0, 0, 0};
		int[] lotto3 = {7, 0, 7, 7, 7, 0, 7, 0};
		int sel      = 0;
		//boolean[] jackpot = { false , false , false , false , false , false , false , false };
		int[] jackpot = { 0, 0, 0, 0, 0, 0, 0, 0};
	
		while (true) {
					
			System.out.println("\n[1]번복권 결과확인");
			System.out.println("[2]번복권 결과확인");
			System.out.println("[3]번복권 결과확인");
			System.out.println("[0]종료");
			System.out.print("메뉴 선택 : ");
			sel = scan.nextInt();
			int cnt = 0;
		
			
			if (sel == 1) {
				for (int i = 0; i < 8; i++) {
						if (lotto1[i] == 7) {
							jackpot[i]++;
							if (i-1 != 0 || jackpot[i - 1] == 1)
								cnt++;
						}
					}
				
				if (cnt == 2) System.out.println("1번당첨");
				else System.out.println("1번 꽝");
			}
			
			else if (sel== 2) {
				for (int i = 0; i < 8; i++) {
					if (lotto2[i] == 7) {
						jackpot[i]++;
						if (i-1 != 0 || jackpot[i - 1] == 1)
							cnt++;
					}
				}
				if (cnt == 2) System.out.println("2번당첨");
				else System.out.println("2번 꽝");
			}
			
			else if (sel== 3) {
				for (int i = 0; i < 8; i++) {
					if (lotto2[i] == 7) {
						jackpot[i] += 1;
						if (i-1 != 0 || jackpot[i - 1] == 1)
							cnt++;
					}
				}
				if (cnt == 3) System.out.println("3번당첨");
				else System.out.println("3번 꽝");
			}
			
			
		/*	if (num == 1) {
				if (cnt == 3) System.out.println("1번당첨");
				else System.out.println("1번 꽝");
			}
			else if (num == 2) {
				if (cnt == 3) System.out.println("2번 당첨");
				else  System.out.println("2번 꽝");
			}
			else if (num == 3) {
				if (cnt == 3) System.out.println("3번 당첨");
				else  System.out.println("3번 꽝");
			} */

			
			
		}
		
	}
}
