package step2_01.array;

import java.util.Scanner;

/*
 * # ATM[3단계]
 * 
 * 1. 가입
 *  - 계좌번호와 비밀번호를 입력받아 가입
 *  - 계좌번호 중복검사
 * 2. 탈퇴
 *  -  계좌번호를 입력받아 탈퇴
 */


public class ArrayEx23_정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] accs = {1001, 1002, 0, 0, 0};
		int[] pws  = {1111, 2222, 0, 0, 0};
		
		int accsCnt = 2;
		int selectMenu = 0;
		boolean isRun = true;
		
		while (isRun) {
			
			for (int i = 0; i < accs.length; i++) {
				System.out.println( i+1 + "." + accs[i] + ":" + pws[i]);
			}
			
			System.out.println("1.가입");
			System.out.println("2.탈퇴");
			System.out.println("3.종료");
			System.out.print("메뉴 선택 : ");
			selectMenu = scan.nextInt();
			
			if		(selectMenu == 1) {
				System.out.print("[가입]계좌번호 입력 :");
				int id = scan.nextInt();
				int cnt = 0;
				for (int i = 0; i < accsCnt; i++) {
					if (id == accs[i]) {
						System.out.println("계좌번호가 중복됩니다."); 
						break;
					}
					cnt++;
				}
				if (cnt == accsCnt) {
					accs[accsCnt] = id;
					System.out.print("[가입]비밀번호 입력 :");
					int pw = scan.nextInt();
					pws[accsCnt] = pw;
					accsCnt ++;
				}
			
				
			}
			else if (selectMenu == 2) {
				int idx = accsCnt;
				System.out.print("[탈퇴]계좌번호 입력 :");
				int id = scan.nextInt();
				
				for (int i = 0; i < accsCnt; i++) {
					if (id == accs[i]) {
						idx = i;
					}
				}
				
				
				if (idx == accsCnt) {
					System.out.println("해당 계좌번호는 존재하지 않습니다.");
				}
				
				else {
					accs[idx] = 0;
					pws[idx] = 0;
				}
			}
			else if (selectMenu == 3) {
				break;
			}
			
		}

	}
}
