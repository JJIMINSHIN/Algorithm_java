package programmers.level1;

import java.util.Arrays;

/************
 * @info : 예산
 * @date : 2025/02/06 19:33 PM
 * @time : 0(ms)
 * @Description :
 * 그리드 알고리즘
 * 현재 순간에 가장 최적인 선택을 반복해서 최적해를 구하는 알고리즘
 * 해당 문제에서 가장 최적의 선택은 정렬을해서 예산전까지의 합을 구하는것!
 ************/

public class _20250206_01 {
	
	public int solution(int[] d, int budget) {
        int res = 0; //예산 합
        int cnt =0; //지원 부서
        
        Arrays.sort(d);
        
        for(int cost : d) {
        	if(cost + res > budget) break;
        	res += cost;
        	cnt++;
        }
        return cnt;
    }

}
