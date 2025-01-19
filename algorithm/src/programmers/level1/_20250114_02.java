package programmers.level1;

/************
 * @name : 약수의 합
 * @date : 2025/01/14 16:43 PM
 * @time : 0 (ms)
 * @Description :
 * 다른 사람 풀이에서 재밌는 방법 봄
 * for문을 돌릴때 num/2까지만 돌림 
 *	-> 1부터 시작해서 약수를 찾다 보면, 이미 작은 쪽 약수를 찾을 때마다 짝을 이루는 큰 쪽 약수도 자동으로 알 수있음!
 *     작은 수의 약수만 확인하면 큰 수의 약수는 계산으로 구할 수 있으니, 루프를 **Math.sqrt(num)**까지만 돌려도 충분
 ************/


public class _20250114_02 {
	
	public int solution(int n) {
        int answer = 0;
        for(int i=1; i<=n; i++) {
        	if(n%i==0) 
        		answer += i;
        }
        return answer;
    
    }

}
