package programmers.step0;

/*
 * 글자 지우기
 * @author JIMIN
 *
 */
public class sol_35 {
	
	public static void main(String[] args) {
		int[] indices= {1, 16, 6, 15, 0, 10, 11, 3};
		System.out.println(new sol_35().solution("apporoograpemmemprs", indices));
	};
	
	public String solution(String my_string, int[] indices) {
        String answer = "";
        String[] result = my_string.split("");
        for(int i=0; i<indices.length; i++) {
    		result[indices[i]] = "";
        }
        
        for(String x : result) {
        	if(!"".equals(x)) answer += x;
        }
        return answer;
    }

}

/*
이중 for문 돌렸을때 시간
테스트 1 〉	통과 (1.76ms, 83.5MB)
테스트 2 〉	통과 (1.31ms, 66.5MB)
테스트 3 〉	통과 (1.30ms, 74.3MB)
테스트 4 〉	통과 (1.97ms, 76.9MB)
테스트 5 〉	통과 (1.44ms, 77.8MB)
테스트 6 〉	통과 (2.06ms, 78.3MB)
테스트 7 〉	통과 (1.41ms, 69.9MB)
테스트 8 〉	통과 (5.88ms, 73.2MB)
테스트 9 〉	통과 (1.40ms, 68.7MB)
테스트 10 〉	통과 (8.72ms, 77.9MB)
테스트 11 〉	통과 (1.71ms, 69.4MB)
테스트 12 〉	통과 (1.40ms, 71.2MB)
테스트 13 〉	통과 (2.38ms, 73.1MB)
테스트 14 〉	통과 (2.44ms, 76.5MB)
테스트 15 〉	통과 (1.42ms, 73.3MB)
테스트 16 〉	통과 (1.49ms, 68MB)
테스트 17 〉	통과 (2.40ms, 78.8MB)
테스트 18 〉	통과 (2.58ms, 71.5MB)
 */

/* for문을 각자 돌렸을때     => 얼핏 보기엔 비슷한것 같아도 테스트 10에서 거의 6배 차이가나는걸 확인 할 수 있었다.
 * 불필요한 메모리 사용을 지양하자.!
테스트 1 〉	통과 (1.73ms, 75.4MB)
테스트 2 〉	통과 (1.32ms, 71.2MB)
테스트 3 〉	통과 (1.61ms, 74.6MB)
테스트 4 〉	통과 (1.75ms, 78.6MB)
테스트 5 〉	통과 (1.61ms, 78.7MB)
테스트 6 〉	통과 (1.23ms, 71.7MB)
테스트 7 〉	통과 (2.66ms, 72.2MB)
테스트 8 〉	통과 (2.16ms, 76.4MB)
테스트 9 〉	통과 (1.87ms, 74.6MB)
테스트 10 〉	통과 (1.43ms, 75.1MB)
테스트 11 〉	통과 (2.24ms, 74.8MB)
테스트 12 〉	통과 (1.70ms, 75.6MB)
테스트 13 〉	통과 (1.47ms, 71.8MB)
테스트 14 〉	통과 (2.15ms, 75.4MB)
테스트 15 〉	통과 (1.50ms, 78.7MB)
테스트 16 〉	통과 (2.50ms, 71.9MB)
테스트 17 〉	통과 (2.33ms, 78.4MB)
테스트 18 〉	통과 (1.61ms, 71.8MB) 
*/
