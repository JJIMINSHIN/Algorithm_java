package programmers.level1;

/************
 * @info : 최대공약수와 최소공배수
 * @date : 2025/02/03 16:33 PM
 * @time : 0(ms)
 * @Description :
 * 최대공약수, 최소공배수 구하는 방법은 따로 정리함!
 ************/

public class _20250203 {
	
	public int[] solution(int n, int m) {
		int gcd = getGCD(n, m); // 최대공약수 구하기
		int lcm = (n * m) / gcd; // 최소공배수 구하기

		return new int[] { gcd, lcm }; // 결과 배열 반환
	}

	private int getGCD(int n, int m) {
		while (m != 0) {
            int temp = m;
            m = n % m;
            n = temp;
        }
        return n;
	}

}
