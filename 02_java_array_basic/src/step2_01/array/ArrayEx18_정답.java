package step2_01.array;

import java.util.Random;
import java.util.Scanner;

/*
 * # 미니마블
 * 
 * 1. 플레이어는 p1과 p2 2명이다.
 * 2. 1p는 사용자가 1~3 사이의 숫자를 입력해 이동하고 2p는 랜덤값으로 1~3값으로 이동한다.
 * 3. 이동하다가 다음 플레이어와 같은 위치에 놓이게 되면,
 *    상대 플레이어는 잡히게 되어 원점으로 되돌아간다.
 * 4. 먼저 3바퀴를 돌면 이긴다.
 *    
 *  1 0 0 0 0 0 0 0  [0바퀴]
 *  2 0 0 0 0 0 0 0  [0바퀴]
 *  [p1사용자]1~3 입력 : 3 
 *
 *  1 2 3 4 5 6 7 8  
 *  0 0 0 1 0 0 0 0  [0바퀴]
 *  2 0 0 0 0 0 0 0  [0바퀴]
 *  [p2컴퓨터] : 3
 *  [p2컴퓨터]가 p1을 잡았다! 
 *  
 *  1 2 3 4 5 6 7 8 
 *  1 0 0 0 0 0 0 0  [0바퀴]
 *  0 0 0 2 0 0 0 0  [0바퀴]
 * [p1사용자]1~3 입력 : 
 *
 *
 *
 */

public class ArrayEx18_정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] game = {1, 2, 3, 4, 5, 6, 7, 8};
		int[] p1   = {0, 0, 0, 0, 0, 0, 0, 0};
		int[] p2   = {0, 0, 0, 0, 0, 0, 0, 0};
		
		int turn = 0;
		
		int idx1 = 0;	
		int idx2 = 0;
		
		p1[idx1] = 1;
		p2[idx2] = 2;
		
		int win1 = 0;	
		int win2 = 0;	
		
		int sum1 = 0;
		int sum2 = 0;
		
		
		while (true) {
		
	
			for (int i = 0; i < game.length; i++) {
				System.out.print(game[i] + " ");
			}
			
			System.out.println();
			
			for(int i=0; i < p1.length; i++) {
				if (idx1 == i) {
					p1[idx1] = 1;
					System.out.print(p1[idx1] + " ");
				}
				else System.out.print(p1[i] + " ");
			}
			System.out.println("[" + win1 + "바퀴]");
			
			for(int i=0; i < p2.length; i++) {
				if (idx2 == i) {
					p2[idx2] = 2;
					System.out.print(p2[idx2] + " ");
				}
				else System.out.print(p2[i] + " ");
			}
			
			System.out.println("[" + win2 + "바퀴]");
			
			if (turn % 2 == 0) {
				System.out.print("[p1사용자]1~3입력 : ");
				p1[idx1] = 0;
				int index1 = scan.nextInt();
				idx1 += index1;
				System.out.println();
				if (idx1 == idx2) {
					System.out.println("[p1컴퓨터]가 p2을 잡았다 !");
					p2[idx2] = 0;
					idx2 = 0;
					win2 = 0;
				}
				if (idx1 > 7) {
					 win1++;
					 idx1 = idx1 - (p1.length-1);
				}
				turn++;
			}
			else {
				p2[idx2] = 0;
				Random ran = new Random();
				int index2 = ran.nextInt(3) + 1;
				idx2 += index2;
				System.out.print("[p2컴퓨터] :" + index2);
				System.out.println();
				if (idx2 == idx1) {
					System.out.println("[p2컴퓨터]가 p1을 잡았다 !");
					p1[idx1] = 0;
					idx1 = 0;
					win1 = 0;
				}
				if (idx2 > 7) {
					 win2++;
					 idx2 = idx2 - (p2.length-1);
				}
				turn++;
				System.out.println();
			}
			
			if (win1 == 3) {
				System.out.println("[p1사용자] 승리!");
				break;
			}
			
			else if (win2 == 3) {
				System.out.println("[p2사용자] 승리!");
				break;
			}
			
			
		}
		
		
		
		
		
	}
}
