package programmers.step0;

import java.util.Arrays;

/************
 * @name : n 번째 원소까지
 * @date : 2024/8/24 16:32 PM
 * @time : 0 (ms)
 * @Description : 
 * 간단히 풀 수 있는 문제
 * 다른 사람 풀이 보니깐 Arrays.copyOf 자바 메서드 사용해서 푸는 것 확인
 * 속도 차이는 별로 안나지만, 알아두기~
 ************/

public class sol_48 {

	public static void main(String args[]) {
		long startTime = System.currentTimeMillis();

		int[] arr = {5, 2, 1, 7, 5};
		
		System.out.println(new sol_48().solution(arr, 3));
		
		long endTime = System.currentTimeMillis();
		long duTime = endTime - startTime;
		System.out.println("active time = " + duTime + " m/s");
	}

	public int[] solution(int[] num_list, int n) {
        int[] answer = new int[n];
        for(int i=0; i<n; i++){
        	answer[i] = num_list[i];
        }
        return answer;
    }
	
	public int[] solution2(int[] num_list, int n) {
		return Arrays.copyOf(num_list, n);
    }
	
	

}
