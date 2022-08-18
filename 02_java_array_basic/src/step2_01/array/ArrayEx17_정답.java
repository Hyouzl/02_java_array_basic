package step2_01.array;

import java.util.Scanner;

/* 
 * # 틱택토
 * 
 * 1. 구글에 검색해보면 실제로 게임을 진행해볼 수 있음
 * 2. 미니 오목처럼 1p 혹은 2p가 먼저 가로로 3줄 , 세로로 3줄, 대각선 3줄을 선택한 플레이어가 승리하는 게임
 * 3. 1p가 입력한 부분은 화면에 O표시 , 2p가 입력한 부분은 화면에 X표시
 * 
 * === 틱택토 ===
 * [X][X][O]
 * [ ][O][ ]
 * [ ][ ][ ]
 * [p1]인덱스 입력 : 6
 * === 틱택토 ===
 * [X][X][O]
 * [ ][O][ ]
 * [O][ ][ ]
 * [p1]승리
 * 
 */

public class ArrayEx17_정답 {

	public static void main(String[] args) {
		
		int[] game = new int[9];
		
		for (int i = 0; i < game.length; i++) {
			game[i] = 0;
		}
		int player = 1;
		int win = 0;
		
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			
					
			System.out.println("=== 틱택토 ===");
			for (int i = 0; i < game.length; i++) {
				if (game[i] == 1) System.out.print("[X]");
				else if (game[i] == 2) System.out.print("[O]");
				else System.out.print("[ ]");
				if ((i+1)%3 == 0) System.out.println();
			}
			
			// 가로
			
			
			for (int i = 0; i < 6; i +=3) {
				if (game[i] == 1 && game[i+1] == 1 && game[i+2] == 1) {
					System.out.println("[p1] win!");
					win++;
				}
				else if (game[i] == 2 && game[i+1] == 2 && game[i+2] == 2) {
					System.out.println("[p2] win!");
					win++;
				}
			}
			
			//세로
						
			for (int i = 0; i < 3; i++) {
				if (game[i] == 1 && game[i+3] == 1 && game[i+6] == 1) {
					System.out.println("[p1] win!");
					win++;
				}
				else if (game[i] == 2 && game[i+3] == 2 && game[i+6] == 2) {
					System.out.println("[p2] win!");
					win++;
				}
			}
						
			//대각선
					
				

			if (win == 1) break;

			if (player == 1) {
				System.out.print("[p1]인덱스 입력 : ");
				int index = scan.nextInt();
				
				if (game[index] == 0) {
					game[index] = 1;
					player = 2;
				}
				else continue;
			}
			
			else if (player == 2) {
				System.out.print("[p2]인덱스 입력 : ");
				int index = scan.nextInt();
				
				if (game[index] == 0) {
					game[index] = 2;
					player = 1;
				}
				else continue;
			
		}
		
	}
		
	}
		
}
