package programmers.step0;

//등차수열의 특정한 항만 더하기
/*
 * 등차수열 : an = a + (n - 1)d 
 */

public class sol_29 {

	public static void main(String[] args) {
		boolean [] included  = {true, false, false, true, true};
		System.out.println(new sol_29().solution(3, 4, included));
	};
	
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        for(int i =0; i<included.length; i++) {
        	if(included[i]) answer += (a+ (d*i));
        }
        return answer;
    }
}
