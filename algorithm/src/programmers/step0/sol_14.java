package programmers.step0;

import java.util.Scanner;


//문자열 돌리기
public class sol_14 {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        for(int i=0; i<a.length(); i++) {
        	System.out.println(a.charAt(i));
        }
        
	};

}
