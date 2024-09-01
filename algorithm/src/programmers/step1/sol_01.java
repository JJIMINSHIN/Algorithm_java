package programmers.step1;

/************
 * @name : 나머지 구하기
 * @date : 2024/9/1 16:37 PM
 * @time :  0 (ms)
 * @Description :
 ************/

public class sol_01 {

	public static void main(String args[]) {
		long startTime = System.currentTimeMillis();

		int num1 = 3;
		int num2 = 2;
		
		System.out.println(new sol_01().solution(num1, num2));

		long endTime = System.currentTimeMillis();
		long duTime = endTime - startTime;
		System.out.println("active time = " + duTime + " m/s");
	}

	public int solution(int num1, int num2) {
        return num1%num2;
    }
}
