package programmers.step0;

import java.util.Arrays;

/************
 * @name : 첫 번째로 나오는 음수
 * @date : 2024/8/25 16:54 PM
 * @time : 0 (ms)
 * @Description : 
 * 원소값이 음수면 ++한 cnt값 넣어주고 break;
 * 모든 값이 양수면 -1 리턴
 ************/

public class sol_49 {

	public static void main(String args[]) {
		long startTime = System.currentTimeMillis();

		int[] arr = {12, 4, 15, 46, 38, 2, 15};
		
		System.out.println(new sol_49().solution(arr));
		
		long endTime = System.currentTimeMillis();
		long duTime = endTime - startTime;
		System.out.println("active time = " + duTime + " m/s");
	}

	public int solution(int[] num_list) {
        int answer = -1;
        int cnt =0;
        for(int x : num_list) {
        	if(x <0) {
        		answer = cnt; 
        		break;
        	}
        	else cnt++;
        }
        return answer;
    }
	

}
