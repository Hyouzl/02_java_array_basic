package step2_01.array;

/*
 * # 4의 배수만 저장
 * 
 * - arr 배열에서 4의 배수의 개수를 계산하여 4의 배수만큼 temp 배열을 생성한뒤에 
 *   arr배열의 4의 배수들을  temp로 옮겨닮아보시오.
 * 
 */

public class ArrayEx13_정답 {

	public static void main(String[] args) {
		
		int[] arr = {44, 11, 29, 24, 76};
		int[] temp = null;
		int cnt =0;
		int j = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 4 == 0) {
				cnt++;
			}
		}
		
		temp = new int[cnt];
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 4 == 0) {
				if (j != cnt-1) {
				temp[j] = arr[i];
				j++;
				}
				else {
					temp[j] = arr[i];
					break;
				}
			}
		}
		
		for (int i = 0; i < cnt; i++) {
			System.out.print(temp[i] + " ");
		}
		
		
	}
	
}
