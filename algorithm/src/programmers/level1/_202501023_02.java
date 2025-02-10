package programmers.level1;

/************
 * @name : 두 정수 사이의 합
 * @date : 2025/01/03 16:54 PM
 * @time : 0 (ms)
 * @Description :
 * 원래는 min, max 변수 선언해서 담았는데 Math를 이용한 아주 이쁜문이 있길래 습득했다.
 ************/

public class _202501023_02 {
	public  long solution(int a, int b) {
		long answer = 0;

		for (int i = Math.min(a, b); i <= Math.max(a, b); i++) {
			answer += i;
		}
		return answer;
	}

}
