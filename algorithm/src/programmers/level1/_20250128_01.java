package programmers.level1;

import java.util.Arrays;

/************
 * @info : 문자열 내림차순으로 배치하기
 * @date : 2025/01/28 16:23 PM
 * @time : 1(ms)
 * @Description :
 * toCharArray를 알고난 뒤로 참 야무지게 쓰는중
 * 라이브러리 사용해서 간단하게 풀이함!
 ************/

public class _20250128_01 {
	
	public String solution(String s) {
        char[] chs = s.toCharArray();
		Arrays.sort(chs);
        StringBuilder sb = new StringBuilder(new String(chs));
        return sb.reverse().toString(); 
    }

}
