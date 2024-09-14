package programmers.step1;

/************
 * @name : 중복된 숫자 개수
 * @date : 2024/09/14 15:23 PM
 * @time : 0 (ms)
 * @Description :
 ************/

public class sol_11 {

	public static void main(String args[]) {
		long startTime = System.currentTimeMillis();

		int[] arr = { 0, 2, 3, 4};

		System.out.println(new sol_11().solution(arr,1));
		long endTime = System.currentTimeMillis();
		long duTime = endTime - startTime;
		System.out.println("active time = " + duTime + " m/s");
	}

	public int solution(int[] array, int n) {
		int answer = 0;
		for(int s : array) {
			if(s == n) answer++;
		}
		return answer;
	}
}
