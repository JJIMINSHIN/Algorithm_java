package programmers.step1;

/************
 * @name : 짝수의 합
 * @date : 2024/09/08 17:58 PM
 * @time : 0 (ms)
 * @Description : 
 ************/

public class sol_09 {

	public static void main(String args[]) {
		long startTime = System.currentTimeMillis();

		int num = 10;

		System.out.println(new sol_09().solution(num));
		long endTime = System.currentTimeMillis();
		long duTime = endTime - startTime;
		System.out.println("active time = " + duTime + " m/s");
	}
	
	public int solution(int n) {
        int answer = 0;
        for(int i=1; i<=n; i++){
            if(i%2 == 0 && i != 1){
                answer += i;
            }
        }
        return answer;
    }

}
