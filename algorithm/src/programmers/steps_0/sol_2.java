package programmers.steps_0;

public class sol_2 {
	
	public static void main(String[] args) {
		System.out.println(new sol_2().solution("ABBAA","AABB"));
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
