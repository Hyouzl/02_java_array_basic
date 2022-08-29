package step2_01.array;

import java.util.Scanner;

public class ArrayEx24_테스트문제1_2 {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in); 
		
		// 문제 8) 아래 d에서 scanner로 내가 입력한 값만 빼고 e에 저장 
		int[] d = { 10,20,30,40,50 };
		int[] e = { 0,0,0,0,0 };
		
		System.out.print("문제 8) 입력 : ");
		int num = scan.nextInt();
		
		for (int i = 0; i < e.length; i++) {
			if (d[i] == num) {
				d[i] = 0;
			}
			e[i] = d[i];
		}
		
		System.out.print("{");
		for(int i = 0; i < e.length - 1; i++) {
			System.out.print(e[i] + ",");
		}
		System.out.print(e[e.length-1] + "}");
		System.out.println();
		
		
		// 예) 30 ==> e = {10,20,40,50,0};
		
		System.out.println();
		

		// 문제 9) 아래 f에서 scanner로 내가 입력한 번호와 값을 빼고 d에 저장 
		int[] f = { 1001, 40, 1002, 65, 1003,  70 };
		int[] g = { 0,0,0,0,0,0 };
		
		// 예) 1002 ==> {1001, 40, 1003, 70 , 0, 0};
		
		System.out.print("문제 9) 번호 입력 : ");
		int idx = scan.nextInt();
		System.out.print("값 입력 : ");
		num = scan.nextInt();
		
		for (int i = 0; i < f.length; i++) {
			if (i == idx) {
				f[i] = 0;
			}
			else if (f[i] == num) {
				f[i] = 0;
			}
		}
		
		int index = 0;
		for (int i = 0; i < f.length; i++) {
			if (f[i] != 0) {
				g[index] = f[i];
				index++;
			}
		}
		System.out.print("{");
		for (int i = 0; i < g.length - 1; i++) {
			System.out.print(g[i] + ",");
		}
		
		System.out.println(g[g.length-1] + "}");
		
		
		System.out.println();
		
		// 문제 10) 숫자를 하나 입력받고 아래 배열을 앞으로 하나씩 밀어낸후 맨뒤에 저장
		int[] h = { 10,20,30,40,50 };
		// 예)  60 ==> {20,30,40,50,60};
		
		System.out.print("문제 10) 입력 : ");
		num = scan.nextInt();
	
		for (int i = 0; i < h.length - 1; i++) {
			h[i] = h[i+1];
		}
		
		h[h.length-1] = num;
		
		System.out.print("{");
		for (int j = 0; j < h.length - 1; j++) {
			System.out.print(h[j] + ",");
		}
		System.out.println(h[h.length - 1] + "}");
		System.out.println();
		
		// 문제 11) 숫자를 하나 입력받고 아래 배열을 뒤로 하나씩 밀어낸후 맨 앞에 저장 
		int[] i = { 10,20,30,40,50 };
		// 예) 60 ==> {60,10,20,30,40};
		
		System.out.print("문제 11) 입력 : ");
		num = scan.nextInt();
		
		for (int j = i.length - 1; j > 0; j--) {
			i[j] = i[j-1];
		}
		
		i[0] = num;
		
		
		System.out.print("{");
		for (int j = 0; j < i.length - 1; j++) {
			System.out.print(i[j] + ",");
		}
		System.out.println(i[i.length - 1] + "}");
		System.out.println();
		
		
		// 문제 12) 아래배열을 거꾸로 저장 
		int[] j = { 1,2,3,4,5 };
		int[] k = { 0,0,0,0,0 };
		//예) k => {5,4,3,2,1};

		idx = 0;
		for (int r = j.length - 1; r >= 0; r--) {
			k[idx] = j[r];
			idx++;
		}
		System.out.print("문제 12) ");
		
		System.out.print("{");
		for (int r = 0; r < k.length - 1; r++) {
			System.out.print(k[r] + ",");
		}
		System.out.println(k[k.length-1] + "}");
		
	}

}
