package programmers.step1;

/************
 * @name : 두 수의 곱
 * @date : 2024/9/1 16:39 PM
 * @time :  0 (ms)
 * @Description :
 ************/

public class sol_02 {

	public static void main(String args[]) {
		long startTime = System.currentTimeMillis();

		int num1 = 27;
		int num2 = 19;
		
		System.out.println(new sol_02().solution(num1, num2));

		long endTime = System.currentTimeMillis();
		long duTime = endTime - startTime;
		System.out.println("active time = " + duTime + " m/s");
	}

	public int solution(int num1, int num2) {
        return num1*num2;
    }
}
