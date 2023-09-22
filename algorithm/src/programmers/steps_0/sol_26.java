package programmers.steps_0;

import java.util.*;

//ad 제거하기
public class sol_26 {
	
	public static void main(String[] args) {
		String[] arr = {"and","notad","abcd"};
		System.out.println(new sol_26().solution(arr));
	}
	
    public String[] solution(String[] strArr) {
        ArrayList<String> al = new ArrayList<String>();
        
        for(String x : strArr) {
        	if(!x.contains("ad")) al.add(x);
        	System.out.println("x는 "+al);
        }
        
        return al.toArray(String[]::new);
        
    }
}
