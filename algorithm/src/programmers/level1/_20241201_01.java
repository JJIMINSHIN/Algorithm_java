package programmers.level1;

/************
 * @name : 자릿수 더하기
 * @date : 2024/12/01 15:18 PM
 * @time : 35 (ms)
 * @Description :
 * 다른 사람들 풀이 보니 이런식으로 풀면 리소스를 잡아먹는다는 사람 반, 가독성을 위해 형변환 코드가 좋다는 사람 반~
 * n의 범위가 100,000,000이건데 1억 넣고 돌려봐도 34ms밖에 안걸려서 그렇게까지 리소스를 잡아먹는지는 모르겟다.!
 ************/

public class _20241201_01 {
	public int solution(int n) {
		int answer = 0;
		
		String[] arr = (n+"").split("");
		for(String s : arr) {
			answer += Integer.parseInt(s);
		}

		return answer;
	}

}
