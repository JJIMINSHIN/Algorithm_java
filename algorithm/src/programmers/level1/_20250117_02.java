package programmers.level1;

/************
 * @info : 서울에서 김서방 찾기
 * @date : 2025/01/17 15:50 PM
 * @time : 28(ms)
 * @Description :
 * 귀여운 문제 ㅎㅎ
 * 간단한 for문으로 해결
 ************/

public class _20250117_02 {
	public String solution(String[] seoul) {
		int idx =0;
		for(String str : seoul) {
			if("Kim".equals(str)) break;
			idx++;
		}
		return "김서방은 "+idx+"에 있다";
	}
}
