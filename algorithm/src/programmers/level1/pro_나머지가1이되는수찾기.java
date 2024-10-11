package programmers.level1;

/************
 * @name : 나머지가 1이 되는 수 찾기
 * @date : 2024/10/11 11:30 PM
 * @time : 0 (ms)
 * @Description :
 * 나는 정석적인 코딩방식으로 했는데
 * while로 돌려서 하니깐 더 가독성 있는 코드가 완성되었다.
 ************/

public class pro_나머지가1이되는수찾기 {
	
	public static void main(String args[]) {
		
		int arr = 12;
		System.out.println(new pro_나머지가1이되는수찾기().solution(arr));
	}
	
	public int solution(int n) {
        int answer = 1;
        while(true) {
        	if(n%answer ==1) break;
        	answer++;
        	System.out.println(answer);
        }
        return answer;
    }
	
    public int solution2(int n) {
        int answer = 0;
    	int tmp = Integer.MAX_VALUE;

        for(int i=2; i<=n; i++) {
        	if(n%i == 1 && tmp > i ) tmp = i;
        	answer = tmp;
        }
        return answer;
    }
}
