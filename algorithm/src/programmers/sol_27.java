package programmers;

//문자열 곱하기

public class sol_27 {
	
	public static void main(String[] args) {
		System.out.println(new sol_27().solution("string", 3));
	}

	public String solution(String my_string, int k) {
		return my_string.repeat(k);
	}
}
