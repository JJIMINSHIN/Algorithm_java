package programmers;

// 특정한 문자를 대문자로 바꾸기
public class sol_06 {
	
	public static void main(String[] args) {
		new sol_06().solution("programmers", "p");
	};
	
	public String solution(String my_string, String alp) {
        return my_string.replaceAll(alp, alp.toUpperCase());
    }

}
