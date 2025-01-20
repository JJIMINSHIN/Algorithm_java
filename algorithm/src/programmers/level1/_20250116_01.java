package programmers.level1;

/************
 * @info : 자연수 뒤집어 배열로 만들기
 * @date : 2025/01/16 16:14 PM
 * @time : 23(ms)
 * @Description :
 * Strigbuilder로 reverse할까 하다가 그냥 정석으로 풀었다~
 ************/

public class _20250116_01 {
	public int[] solution(long n) {
		String[] s = (n+"").split("");
		
		int ans[] = new int[s.length];
		for(int i=0; i<s.length; i++) {
			ans[i] = Integer.parseInt(s[s.length-i-1]);
		}
        return ans;
    }

}
