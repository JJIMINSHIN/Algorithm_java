package programmers.step1;

/************
 * @name : 몫 구하기
 * @date : 2022/12/25 17:58 PM
 * @time :  0 (ms)
 * @Description :
 ************/

public class sol_06 {

	public static void main(String args[]) {
		long startTime = System.currentTimeMillis();

		int num1 = 27;
		int num2 = 19;
		
		System.out.println(new sol_06().solution(num1, num2));

		long endTime = System.currentTimeMillis();
		long duTime = endTime - startTime;
		System.out.println("active time = " + duTime + " m/s");
	}

	public int solution(int num1, int num2) {
        return num1/num2;
    }
}
