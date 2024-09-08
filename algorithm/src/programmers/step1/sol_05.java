package programmers.step1;

/************
 * @name : 두 수의 차
 * @date : 2024/09/08 15:29 PM
 * @time :  0 (ms)
 * @Description :
 ************/

public class sol_05 {

	public static void main(String args[]) {
		long startTime = System.currentTimeMillis();

		int num1 = 27;
		int num2 = 19;
		
		System.out.println(new sol_05().solution(num1, num2));

		long endTime = System.currentTimeMillis();
		long duTime = endTime - startTime;
		System.out.println("active time = " + duTime + " m/s");
	}

	public int solution(int num1, int num2) {
        return num1-num2;
    }
}
