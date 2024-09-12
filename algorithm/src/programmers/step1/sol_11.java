package programmers.step1;

/************
 * @name : 양꼬치
 * @date : 2024/09/10 10:40 AM
 * @time :  0 (ms)
 * @Description :
 ************/

public class sol_11 {

	public static void main(String args[]) {
		long startTime = System.currentTimeMillis();

		System.out.println(new sol_11().solution(20, 3));
		long endTime = System.currentTimeMillis();
		long duTime = endTime - startTime;
		System.out.println("active time = " + duTime + " m/s");
	}

	public int solution(int n, int k) {
		return (n*12000)+(k-(n/10))*2000;
    }
}
