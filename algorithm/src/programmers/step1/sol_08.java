package programmers.step1;

/************
 * @name : 각도기
 * @date : 2024/09/09 13:52 PM
 * @time :  0 (ms)
 * @Description :
 * 삼항 연산자 사용해서 처리
 ************/

public class sol_08 {

	public static void main(String args[]) {
		long startTime = System.currentTimeMillis();

		int num = 120;
		
		System.out.println(new sol_08().solution(num));
		long endTime = System.currentTimeMillis();
		long duTime = endTime - startTime;
		System.out.println("active time = " + duTime + " m/s");
	}

	public int solution(int angle) {
		return angle == 90 ? 2 : angle <90 ? 1 : angle ==180 ? 4 : 3;
    }
	
}
