package programmers.steps_0;
//l로 만들기
public class sol_11 {

	public static void main(String[] args) {
		System.out.println(new sol_11().solution("abcdevwxyz"));
	};
	
	 public String solution(String myString) {
		 return myString.replaceAll("[^l-z]", "l");
	 }
}
