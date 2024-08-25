package programmers.step0;

/************
 * @name : 배열 만들기 1
 * @date : 2024/8/25 16:54 PM
 * @time : 0 (ms)
 * @Description : 
 ************/

public class sol_51 {

	public static void main(String args[]) {
		long startTime = System.currentTimeMillis();

		
		System.out.println(new sol_51().solution(10,3));
		
		long endTime = System.currentTimeMillis();
		long duTime = endTime - startTime;
		System.out.println("active time = " + duTime + " m/s");
	}

	public int[] solution(int n, int k) {
		int len = n/k;
        int[] answer = new int[len];
        for(int i=1; i<=len; i++) {
        	answer[i-1] = i*k;
        }
        return answer;
    }
	

}
