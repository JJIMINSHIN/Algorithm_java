package programmers.steps_0;

//두 수의 연산값 비교하기
public class sol_18 {
	
	public static void main(String args[]) {
		System.out.println(new sol_18().solution(2, 91));

	}
    public int solution(int a, int b) {
        int answer = Integer.parseInt(a+""+b);
        int result = 2*a*b;
        return answer >= result ? answer :  result;
    }

}
