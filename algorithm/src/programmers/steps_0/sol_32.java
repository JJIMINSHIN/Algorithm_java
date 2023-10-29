package programmers.steps_0;


//특정 문자열로 끝나는 가장 긴 부분 문자열 찾기
public class sol_32 {

	public static void main(String[] args) {
		String result = new sol_32().solution("AbCdEFG", "dE");
		System.out.println(result);
	};
	
    public String solution(String myString, String pat) {
        int answer = myString.lastIndexOf(pat)+(pat.length());
        return myString.substring(0, answer);
    }
    
}
