package programmers.step1;

/************
 * @name : 나이 출력
 * @date : 2024/09/08 15:26 PM
 * @time : 0 (ms)
 * @Description :
 * 어차피 '2022년 기준'이라고 박아놨기 때문에 따로 변수처리 안함.
 ************/

public class sol_04 {

	public static void main(String args[]) {
		long startTime = System.currentTimeMillis();

		int num = 23;

		System.out.println(new sol_04().solution(num));

		long endTime = System.currentTimeMillis();
		long duTime = endTime - startTime;
		System.out.println("active time = " + duTime + " m/s");
	}

	public int solution(int num) {
		return 2022 -num+1;
	}
}
