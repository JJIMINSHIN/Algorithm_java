package programmers.steps_0;

// 특정한 문자를 대문자로 바꾸기
public class sol_6 {
	
	public static void main(String[] args) {
		new sol_6().solution("programmers", "p");
	};
	
	public String solution(String my_string, String alp) {
        return my_string.replaceAll(alp, alp.toUpperCase());
    }

}
