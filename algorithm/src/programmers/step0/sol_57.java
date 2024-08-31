package programmers.step0;

/************
 * @name : 마지막 두 원소
 * @date : 2024/8/31 16:32 PM
 * @time :  0 (ms)
 * @Description :
 * 단순 구현문제
 * 조건 값을 변수로 담으면 좀 더 깔끔할 것 같음.
 ************/

public class sol_57 {

	public static void main(String args[]) {
		long startTime = System.currentTimeMillis();

		int[] num = { 2, 1, 6 };

		System.out.println(new sol_57().solution(num));

		long endTime = System.currentTimeMillis();
		long duTime = endTime - startTime;
		System.out.println("active time = " + duTime + " m/s");
	}

	public int[] solution(int[] num) {
		int len = num.length;
		int[] answer = new int[len+1];
		for(int i=0; i<len; i++) {
			answer[i] = num[i];
		}
		
		if(answer[len-1] >answer[len-2]) {
			answer[len] = (answer[len-1] - answer[len-2]);
		}else {
			answer[len] = (answer[len-1]*2);
		}
		return answer;
	}
}
