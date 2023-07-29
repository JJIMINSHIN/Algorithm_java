package programmers.steps_0;

public class sol_3 {
	// 원하는 문자열 찾기

	
	public static void main(String[] args) {
		System.out.println(new sol_3().solution("aaAA", "aaaaa"));
	};
	
	public int solution(String myString, String pat) {
        return myString.toLowerCase().contains(pat.toLowerCase())? 1 : 0;
    }

}
