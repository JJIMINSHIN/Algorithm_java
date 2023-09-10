package programmers.steps_0;

//홀짝에 따라 다른 값 반환하기
public class sol_21 {

	public static void main(String[] args) {
		System.out.println(new sol_21().solution(10));
	};
	
    public int solution(int n) {
        int answer = 0;
        for(int i=1; i<=n; i++) {
        	if(n%2 !=0 && i%2 !=0) answer += i;
        	else if(n%2 ==0 && i%2 ==0) answer += i*i; 
        }
        return answer;
    }
}
