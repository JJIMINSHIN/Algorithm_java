package inf.ch01;

import java.io.*;

/************
 * @name : 유효한 팰린드롬
 * @date : 2024/10/15 10:04 AM
 * @time : 113 (ms)
 * @Description :
 * 5번에서 사용한 Character.isAlphabetic을 이용해서 풀이함
 * 강의에서는 정규식 사용했는데 훨씬 좋은듯!
 ************/

public class ch01_08 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String answer = "";
	
		for(char c : br.readLine().toCharArray()) {
			if(Character.isAlphabetic(c)) answer += (c+"");
		}
		String result = new StringBuffer(answer).reverse().toString();
		if(answer.equalsIgnoreCase(result))System.out.println("YES");
		else System.out.println("NO");
	}
	
	public void solution(String s){
		s=s.toUpperCase().replaceAll("[^A-Z]", "");
		String tmp=new StringBuilder(s).reverse().toString();
		if(s.equals(tmp)) System.out.println("YES");
		else System.out.println("NO");
	}
	


}

