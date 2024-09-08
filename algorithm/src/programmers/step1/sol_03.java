package programmers.step1;

/************
 * @name : 숫자 비교하기
 * @date : 2023/01/14 17:01 PM
 * @time : 0 (ms)
 * @Description :
 ************/

public class sol_03 {

	public static void main(String args[]) {
		long startTime = System.currentTimeMillis();

		int num1 = 27;
		int num2 = 19;

		System.out.println(new sol_03().solution(num1, num2));

		long endTime = System.currentTimeMillis();
		long duTime = endTime - startTime;
		System.out.println("active time = " + duTime + " m/s");
	}

	public int solution(int num1, int num2) {
		return num1 == num2 ? 1 : -1;
	}
}
