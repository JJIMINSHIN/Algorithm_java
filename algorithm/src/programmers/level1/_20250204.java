package programmers.level1;

/************
 * @info : 크기가 작은 부분 문자열
 * @date : 2025/02/04 18:05 PM
 * @time : 0(ms)
 * @Description :
 * 최대공약수, 최소공배수 구하는 방법은 따로 정리함!
 ************/

public class _20250204 {
	
	public int solution(String t, String p) {
		int cnt = 0;
		long n = 0l;
		long pN = Long.parseLong(p);
		for (int i = 0; i <= t.length() - p.length(); i++) {
			n = Long.parseLong(t.substring(i, i + p.length()));
			if(n<=pN) cnt++;
		}
		return cnt;
	}
}
