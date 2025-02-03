package programmers.level1;

/************
 * @info : 가운데 글자 가져오기
 * @date : 2025/01/23 16:37 PM
 * @time : 2(ms)
 * @Description :
 * 어제 풀려다가 갑자기 머리 안돌아가서 그냥 오늘 풀었다~~
 * 단순 구현문제! 가끔 구현문제는 정석으로 푸는게 머리에서 안헷갈리고 좋다
 ************/

public class _20250124_01 {
	public String solution(String s) {
		int len = s.length();
		if(len %2 !=0) {
			return s.charAt(len/2)+"";
		}else {
			return s.charAt(len/2-1)+""+s.charAt(len/2)+"";
		}
    }
}
