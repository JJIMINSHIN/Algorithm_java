package programmers.step0;

public class sol_02 {
	//문자열 바꿔서 찾기
	
	public static void main(String[] args) {
		System.out.println(new sol_02().solution("ABBAA","AABB"));
		//new sol_2().solution("ABBAA","AABB");
	};

	public int solution(String myString, String pat) {
		String result = "";
		
		for(int i =0; i<myString.length(); i++) {
			if(myString.charAt(i) == 'A') {
				result += "B";
			}
			else result += "A";
		}
		
		return result.contains(pat) ? 1 : 0;
	}
}
