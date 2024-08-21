package programmers.step0;

import java.util.ArrayList;

/************
 * @name : 길이에 따른 연산
 * @date : 2024/8/18 10:19 AM
 * @time : 0 (ms)
 * @Description : 
 * 11 이상이면 더하기, 미만이면 모든 원소 곱하기!
 * 곱하기 할때 주의점, answer =0으로 초기화 되어있었기 때문에 1로 변경 뒤, 11이상일때만 -1해주기
 ************/

public class sol_08 {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();

		int[] arr = {2, 3, 4, 5};
		System.out.println(new sol_08().solution(arr));

		long endTime = System.currentTimeMillis();
		long duTime = endTime - startTime;
		System.out.println("active time = " + duTime + " m/s");

	};
	
	public int solution(int[] num_list) {
        int answer = 1;
        int len = num_list.length;
        for(int i : num_list) {
        	if(len <11) {
        		answer *= i;
        	}else {
        		answer += i;
        	}
        }
        return len <11 ? answer : answer-1;
    }

	public ArrayList before_solution(int[] arr, int n) {
		ArrayList answer = new ArrayList();
		
		for(int i =0; i<arr.length; i++) {
			if(arr.length % 2 != 0) {
				if(i%2==0) answer.add(arr[i]+n);
				else answer.add(arr[i]);
			}else {
				if(i%2!=0)answer.add(arr[i]+n);
				else answer.add(arr[i]);
			}
		}
		
		return answer;
	}
	

}
