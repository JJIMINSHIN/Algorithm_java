package programmers.steps_0;


//9로 나눈 나머지
public class sol_33 {

	public static void main(String[] args) {
		int result = new sol_33().solution("123");
		System.out.println(result);
	}

	public int solution(String number) {
		int answer = 0;
		String[] X = number.split("");
		for(String x : X) {
			answer += Integer.parseInt(x);
		}
		
		return answer %9;

	}
}
