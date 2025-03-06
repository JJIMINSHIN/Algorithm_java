package programmers.level1;

/************
 * @info : 이상한 문자 만들기
 * @date : 2025/02/06 20:05 PM
 * @time : 24(ms)
 * @Description :
 * 처음 제출했을때 틀렸길래 왜 그런지 찾아보니 반례로
	 입력값 〉	"AA aa ZZ zz"
	 기댓값 〉	"Aa Aa Zz Zz"
 * 값을 구해보니, 0번쨰는 짝수취급해줘야하는데 기존에는 공백일때도 idx++를 해서 
 * 공백을 만나도 증가하므로, 단어가 아니라 전체 문자열 기준으로 짝/홀수 판별됨
 * 그래서 공백일시 초기화해줌!
 ************/

public class _20250206_02 {
	
	public String solution(String s) {
		StringBuilder res = new StringBuilder();
        int idx =0;
        for(int i=0; i<s.length(); i++) {
        	char c =  s.charAt(i);
        	if(c ==' ') {
        		res.append(c);
                idx =0;
            }
        	else {
        		res.append(idx%2 == 0? (c+"").toUpperCase() : (c+"").toLowerCase());
                idx++; 
        	}
        }
        
        return res.toString();
    }

}
