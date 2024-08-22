package programmers.step0;

/************
 * @name : n보다 커질 때까지 더하기
 * @date : 2024/8/22 15:47 AM
 * @time : 0 (ms)
 * @Description : 
 * 	n보다 큰 숫자가 될때까지의 합 더해주기
 * 	n과 원소의 합의 값이 같아도 더해주기
 ************/

public class sol_46 {

	public static void main(String args[]) {
		long startTime = System.currentTimeMillis();

		int[] arr = {58, 44, 27, 10, 100};
		System.out.println(new sol_46().solution(arr,139));

		long endTime = System.currentTimeMillis();
		long duTime = endTime - startTime;
		System.out.println("active time = " + duTime + " m/s");
	}
	
	public int solution(int[] numbers, int n) {
        int answer = 0;
        for(int i : numbers) {
        	if(answer <n || answer == n) answer +=i;
        }
        return answer;
    }

	
}
