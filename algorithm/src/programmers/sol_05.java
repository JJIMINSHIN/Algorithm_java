package programmers;

import java.util.ArrayList;

public class sol_05 {
	// 공백으로 구분하기 2
	
	public static void main(String[] args) {
		System.out.println(new sol_05().solution(" i    love  you"));
	};
	
	public String[] solution(String my_string) {
        String[] answer =  my_string.split(" ");
        ArrayList<String> al = new ArrayList();
        for(int i=0; i<answer.length; i++) {
        	if(!answer[i].equals("")) al.add(answer[i]);
        	
        }
        
        answer = new String[al.size()];
        for(int i = 0; i<al.size(); i++) {
        	answer[i] = al.get(i);
        }
        
        return answer;
        
    }
}
