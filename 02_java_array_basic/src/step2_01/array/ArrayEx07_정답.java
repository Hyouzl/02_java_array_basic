package step2_01.array;

/*
 * # 학생성적관리 프로그램[4단계] : 1등학생
 */

//24 - 27
public class ArrayEx07_정답 {

	public static void main(String[] args) {
		
		int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
		int[] scores  = {  87,   11,   45,   98,   23};
		
		// 문제) 1등학생의 학번과 성적 출력
		// 정답) 1004번(98점)
		
		int max = 0;
		int max_hakbun = 0;
		
		for (int i = 0; i < 5; i++) {
			if (max < scores[i]) {	
				max = scores[i];
				max_hakbun = hakbuns[i];
			}
		}
		
		System.out.println("1등학생의 학번 : " + max_hakbun + " , 점수 : " + max + "점");
		
		
	}
	
}
