package programmers.level1;

/************
 * @info : 내적
 * @date : 2025/01/22 17:40 PM
 * @time : 1(ms)
 * @Description :
 * 내적 고등학교때 이후로 증말 오랜만이다! 간단한 구현문제로~
 ************/

public class _20250123_01 {
	public int solution(int[] a, int[] b) {
		int ans=0;
		for(int i=0; i<a.length; i++) {
			ans += (a[i]*b[i]);
		}
		return ans;
    }
}
