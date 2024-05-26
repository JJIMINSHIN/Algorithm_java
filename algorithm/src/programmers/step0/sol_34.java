package programmers.step0;

import java.util.ArrayList;
/*
 * 배열 만들기 5 
 * js로 풀때보다 4배는 길어진 코드길이...
 * 좀 더 간결하게 풀 수 있는 방법을 찾아봐야겠다.
*/
public class sol_34 {
	
	public static void main(String[] args) {
		
		String[] str = {"0123456789","9876543210","9999999999999"};
		System.out.println(new sol_34().solution(str, 50000, 5, 5));
	};
	
    public int[] solution(String[] intStrs, int k, int s, int l) {
        ArrayList arr = new ArrayList();
        
        for(int i=0; i<intStrs.length; i++) {
        	int tmp = Integer.parseInt(intStrs[i].substring(s,s+l));
        	if(tmp >k) arr.add(tmp);
        }
        
        int[] answer = new int[arr.size()];
        
        for(int i=0; i<arr.size(); i++) answer[i] = (int) arr.get(i);
        
        return answer;
    }
}

