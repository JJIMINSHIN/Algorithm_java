package programmers.step0;

/************
 * @name : 공배수
 * @date : 2024/5/26 15:43 PM
 * @time :  0 (ms)
 * @Description :
 * 
 ************/
public class sol_22 {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		
		System.out.println(new sol_22().solution(55, 10, 5));
		
		long endTime = System.currentTimeMillis();
		long duTime = endTime - startTime;
		System.out.println("active time = " + duTime + " m/s");
	};
    public int solution(int number, int n, int m) {
        return number % n ==0 && number % m ==0 ? 1 : 0;
    }
}
