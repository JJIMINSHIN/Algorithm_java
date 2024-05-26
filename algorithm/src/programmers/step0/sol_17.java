package programmers.step0;

//문자열 겹쳐쓰기

public class sol_17 {
	public static void main(String[] args) {
		System.out.println(new sol_17().solution("He11oWor1d", "lloWorl", 2));
	};

	public String solution(String my_string, String overwrite_string, int s) {
        return my_string.substring(0,s)+overwrite_string+my_string.substring(overwrite_string.length()+s);
    }
}
