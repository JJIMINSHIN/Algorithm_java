package programmers.step1;

/************
 * @name : 두 수의 합
 * @date : 2024/09/10 10:40 AM
 * @time :  0 (ms)
 * @Description :
 ************/

public class sol_10 {

	public static void main(String args[]) {
		long startTime = System.currentTimeMillis();

		int num1 = 7;
		int num2 = 3;
		
		
		System.out.println(new sol_10().solution(num1, num2));
		long endTime = System.currentTimeMillis();
		long duTime = endTime - startTime;
		System.out.println("active time = " + duTime + " m/s");
	}

	public int solution(int num1, int num2) {
		return num1+num2;
    }
}
