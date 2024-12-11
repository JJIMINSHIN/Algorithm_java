package inf.ch01;

import java.io.*;

/************
 * @name : 문자열 압축
 * @date : 2024/10/15 11:28 AM
 * @time : 118 (ms)
 * @Description :
 * 마지막 E가 안나와서 보니 비교할 문자열이 없어서 그런거였다.
 * 빈 문자열 하나 추가해주니 정상작동!
 ************/
public class ch01_11 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine()+" ";
		int cnt =1;
		String answer ="";
		
		for(int i=0; i<str.length()-1; i++) {
			if(str.charAt(i) == str.charAt(i+1)) cnt++;  
			else {
				answer += str.charAt(i)+"";
				if(cnt >1 ) answer += cnt;
				cnt =1;
			}
		}
		System.out.println(answer);
	}
	

}

