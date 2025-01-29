package programmers.level1;

/************
 * @info : 음양 더하기
 * @date : 2025/01/20 15:08 PM
 * @time : 0(ms)
 * @Description :
 * 문제 자체는 어렵지 않았는데 아래 처럼 푼 사람이 있었어 참고!
 * answer += absolutes[i] * (signs[i]? 1: -1);
 ************/

public class _20250120_01 {
	public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for (int i = 0; i < absolutes.length; i++) {
        	if(signs[i] == true) answer += absolutes[i];
        	else answer += (-absolutes[i]);
		}
        return answer;
    }
}
