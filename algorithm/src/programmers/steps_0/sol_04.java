package programmers.steps_0;

public class sol_04 {
	//주사위 게임 1
	
	public static void main(String[] args) {
		System.out.println(new sol_04().solution(3, 5));
	};
	
	public int solution(int a, int b) {
        int answer = 0;
        if(a%2 !=0 && b%2 != 0) answer = (a*a) + (b*b);
        else if(a%2 !=0 || b%2 !=0) answer = 2*(a+b);
        else answer = Math.abs(a-b);
        return answer;
    }
}
