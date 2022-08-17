package step2_01.array;

import java.util.Scanner;

/*
 * # 값 교체하기[2단계] 
 */

public class ArrayEx12_정답 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		int[] arr = {10,20,30,40,50};
		
		// 문제 1) 인덱스 2개를 입력받아 값 교체하기
		// 예    1) 인덱스1 입력 : 1
		//		   인덱스2 입력 : 3
		//		  {10, 40, 30, 20, 50}
		
		System.out.print("인덱스1 입력 : ");
		int index1 = scan.nextInt();

		System.out.print("인덱스2 입력 : ");
		int index2 = scan.nextInt();
		
		int temp = 0;
		
		for (int i = 0; i < arr.length; i++) {
			temp = arr[index1];
			arr[index1] = arr[index2];
			arr[index2] = temp;
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}



		System.out.println();
		
		// 문제 2) 값 2개를 입력받아 값 교체하기
		// 예    2) 값1 입력 : 10
		//        값2 입력 : 50
		//		  {50, 20, 30, 40, 10}
		
		
		System.out.print("값1 입력 : ");
		int num1 = scan.nextInt();
		System.out.print("값2 입력 : ");
		int num2 = scan.nextInt();
	
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num1) {
				index1 = i;
			}
			else if (arr[i] == num2) {
				index2 = i;
			}
		}
		
		arr[index1] = num2;
		arr[index2] = num1;
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		
		
		// 문제 3) 학번 2개를 입력받아 성적 교체하기
		// 예    3) 학번1 입력 : 1002
		//        학번2 입력 : 1003
		//		 {87, 45, 11, 98, 23}
		int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
		int[] scores  = {  87,   11,   45,   98,   23};

		System.out.print("학번1 입력 : ");
		int  hakbun1 = scan.nextInt();
		
		System.out.print("학번2 입력 : ");
		int hakbun2 = scan.nextInt();
		
		for (int i = 0; i < hakbuns.length; i++) {
			if (hakbun1 == hakbuns[i]) {
				index1 = i;
			}
			else if (hakbun2 == hakbuns[i]) {
				index2 = i;
			}
		}
		
		
		temp = scores[index1];
		scores[index1] = scores[index2];
		scores[index2] = temp;
		
		for(int i = 0; i < scores.length; i++) {
			System.out.print(scores[i] + " ");
		}
		
		
	}
	
}
