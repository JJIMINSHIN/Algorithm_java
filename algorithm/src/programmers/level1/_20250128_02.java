package programmers.level1;

/************
 * @info : 부족한 금액 계산하기
 * @date : 2025/01/28 16:23 PM
 * @time : 0(ms)
 * @Description :
 * 첫 풀이에서 69.6이라는 애매한 점수를 받았다
 * 어디서 실패가 났을까~ 보다보니
 * 값을 더해주는 부분에서 res += (price*cnt)이런식으로 코드를 짜놔서 그런것..
 * price*i로 바꿔주니 모든 케이스 통과!
 * 다른 사람보니 등차수열로 가볍게 푼것도 확인
 * 등차수열 합공식 r(n(n+1))/2 
 * 내가 같은 코드로 돌려보니깐 안되는것 확인 
 * price = 2500, money = 1000000000, count = 2500로 설정할시 6815625000의 리턴값이 나와야하는데 0 -> 오버플로우 발생햇을거라 짐작
 * 파라미터 int형에서 long형으로 전체 변환해주니 잘됨
 ************/

public class _20250128_02 {
	
	public long solution(int price, int money, int count) {
		long res = 0;
		for (int i = 1; i <= count; i++) {
			res += price * i;
		}
		long answer = res -money;
		return answer > 0 ? answer :0;
	}
	
	public long other_solution(long price, long money, long count) {
		return Math.max((price * (count * (count + 1) / 2) - money), 0);
	}

}
