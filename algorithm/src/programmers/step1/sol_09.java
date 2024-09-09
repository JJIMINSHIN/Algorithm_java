package programmers.step1;

/************
 * @name : 짝수의 합
 * @date : 2024/09/08 17:58 PM
 * @time : 0 (ms)
 * @Description : 반올림 round 올림 ceil 내림 floor 까먹지 않기! (sol2, 다른사람 문제풀이 참고) 굳이
 *              double로 형변환하지 않고 분자값에 1000곱해서 진행하면 깔끔.
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
