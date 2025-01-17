package programmers.level1;

import java.util.*;

/************
 * @name : 정수 내림차순으로 배치하기
 * @date : 2025/01/03 17:02 PM
 * @time : 45 (ms)
 * @Description :
 * 구글 검색해보니 string 배열 내림차순할때 
 * Arrays.sort() 와 Collections.reverseOrder를 조합해서 쓰길래 적용해봄
 ************/

public class _20250103_01 {
	public long solution(long n) {
        String answer = "";
        String[] str = (n+"").split("");
        Arrays.sort(str, Collections.reverseOrder());
        for(String s : str) {
        	answer+= s;
        }
        return Long.parseLong(answer);
    }
}
