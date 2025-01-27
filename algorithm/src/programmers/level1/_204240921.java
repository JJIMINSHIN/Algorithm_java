package programmers.level1;

/************
 * @name : x만큼 간격이 있는 n개의 숫자
 * @date : 2024/09/21 00:09 AM
 * @time : 0 (ms)
 * @Description :
 * 테스트 13, 14 오류가 발생해서 왜지? 생각해 봤더니 for문을 int형으로 넣어주고 있었다.
 * 그러니깐 long형식을 집어넣었을때 오류가 반환되지 않았을까~
 * 1) answer[(int) (i-1)] = (i*x);로 i를 int로 형변환
 * 2) int idx =0; idx++로 그냥 변수하나 더 선언해줌
 * int값은 전역변수로 해줘야함~ 왜냠, 1에서 더이상 증가하지 않을테니!
 ************/

public class _204240921 {

	public static void main(String args[]) {
		long startTime = System.currentTimeMillis();

		System.out.println(new _204240921().solution(-4, 3));
		long endTime = System.currentTimeMillis();
		long duTime = endTime - startTime;
		System.out.println("active time = " + duTime + " m/s");
	}

    public long[] solution(int x, int n) {
        long[] answer = new long[n];
    	int idx=0;
        for(long i=1; i<=n; i++) {
        	answer[idx++] = (i*x);
        }
        return answer;
    }
}
