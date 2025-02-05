package programmers.level1;

/************
 * @info : 약수의 개수와 덧셈
 * @date : 2025/01/27 18:42 PM
 * @time : 47(ms)
 * @Description :
 * 약수 문제는 항상 어렵다.. 이번엔 남들의 도움을 많이 얻었으니 다음엔 혼자 풀어보자!
 * 꼭 블로그로 정리해두기!!
 ************/

public class _20250127 {
	
	public int solution(int left, int right) {
        int answer = 0;
        for (int i = left; i <=right; i++) {
        	int cnt =0;
        	
            for (int j = 1; j * j <= i; j++) {
            	if(i%j ==0) {
            		cnt++;
            		if (j != (i / j)) cnt++; // 16인 경우 (4,4) 두개를 포함하지 않고 하나만 추가시킴
            	}
            }//forj
            
            if(cnt%2 ==0) answer +=i;
            else answer -=i;
		}
        return answer;
    }

}
