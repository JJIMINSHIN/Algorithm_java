package programmers.level1;

/************
 * @info : 삼총사
 * @date : 2025/02/20 16:37 PM
 * @time : 0(ms)
 * @Description :
 * 브루투포스 조합 문제
 * O(n3)이지만 입출력값으로 봤을땐 무리가 없이 빠르게 돌아감~
 ************/

public class _20250220_01 {
	public int solution(int[] number) {
        int answer = 0;
        int len = number.length;
        for(int i=0; i<len-2; i++) {
        	for(int j=i+1; j<len-1; j++) {
        		for(int k=j+1; k<len; k++) {
        			if(number[i]+number[j]+number[k] == 0) answer++;
        		}
        	}
        	
        }
        return answer;
    }

}
