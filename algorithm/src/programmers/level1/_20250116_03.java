package programmers.level1;

/************
 * @info : 하샤드 수
 * @date : 2025/01/16 17:06 PM
 * @time : 23(ms)
 * @Description :
 * stream을 이용한 풀이
 * 나는 if로 return 분기 쳐줬는데 다른 사람풀이 보니 if문 돌리지 않고 retrun 해주면 되는거 확인!
 ************/

public class _20250116_03 {
	public boolean solution(int x) {
        int n = (x+"").chars().map(c -> c-'0').sum();
        return x% n == 0;
	}
}
