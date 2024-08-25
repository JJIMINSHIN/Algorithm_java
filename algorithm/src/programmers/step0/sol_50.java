package programmers.step0;

import java.util.Arrays;

/************
 * @name : 카운트 다운
 * @date : 2024/8/25 16:59 PM
 * @time : 0 (ms)
 * @Description : 
 * 간단한 반복문으로 배열에 값 넣는 문제
 ************/

public class sol_50 {

	public static void main(String args[]) {
		long startTime = System.currentTimeMillis();

		
		System.out.println(new sol_50().solution(10,3));
		
		long endTime = System.currentTimeMillis();
		long duTime = endTime - startTime;
		System.out.println("active time = " + duTime + " m/s");
	}

	public int[] solution(int start_num, int end_num) {
        int[] answer = new int[start_num-end_num+1];
        for(int i=start_num; i>=end_num; i--) {
        	answer[start_num-i] = i;
        }
        return answer;
    }
	

}
