package programmers.level1;

/************
 * @name : 문자열 내 p와 y의 개수
 * @date : 2025/01/14 17:12 PM
 * @time : 0 (ms)
 * @Description :
 * 간단한 구현 문제, 삼항연산자 통해서 풇이
 ************/


public class _20250114_03 {
	
	boolean solution(String s) {
        int yCnt =0;
        int pCnt =0;
        
        for(char c : s.toUpperCase().toCharArray()) {
        	if(c == 'Y') yCnt++;
        	else if(c =='P') pCnt++;
        }
        
        return yCnt != pCnt ? false : true;
    }

}
