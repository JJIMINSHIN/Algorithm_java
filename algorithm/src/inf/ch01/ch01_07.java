package inf.ch01;

import java.io.*;

/************
 * @name : 회문 문자열
 * @date : 2024/10/15 09:52 AM
 * @time : 117 (ms)
 * @Description :
 * 앞뒤가 똑같다는건 reverse했을때의 값이 똑같다는 것이니 StringBuffer로 받아와서 비교함!
 ************/

public class ch01_07 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine().toLowerCase();
		
		String revStr = new StringBuffer(str).reverse().toString();
		
		if(str.equals(revStr)) System.out.println("YES");
		else System.out.println("NO");
	}
	
	public String solution(String str){
		String answer="YES";
		str=str.toUpperCase();
		int len=str.length();
		for(int i=0; i<len/2; i++){
			if(str.charAt(i)!=str.charAt(len-i-1)) answer="NO";
		}
		return answer;
	}


}

