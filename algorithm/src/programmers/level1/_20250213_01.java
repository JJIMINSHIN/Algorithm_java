package programmers.level1;

/************
 * @info : 3진법 뒤집기
 * @date : 2025/02/13 11:40 AM
 * @time : 0(ms)
 * @Description :
 * 어렵지 않게 풀었던 문제, 
 * Integer.parseInt(sb.toString(), 3); // Integer.parseInt(변환할 문자열, 문자열이 표현된 진법)
 ************/

public class _20250213_01 {
	
	public int solution(int n) {
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toString(n,3)).reverse();
        return Integer.parseInt(sb.toString(), 3);
	}

}
