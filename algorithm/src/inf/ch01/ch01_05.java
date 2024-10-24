package inf.ch01;

import java.io.*;

/************
 * @name : 특정 문자 뒤집기
 * @date : 2024/10/15 09:44 AM
 * @time : 110 (ms)
 * @Description :
 * 단순한데 참 이런거 푸는게 단순하지 않단 말야..
 * while로 푸는게 혹시 시간 많이 잡아먹으려나?했는데 시간복잡도나 메모리 사용량을 봤을때 강의에서 알려준방법이
 * 현재로서는 베스트인듯하다!
 * 새로 배운 메서드
 * Character.isAlphabetic(c) : character형의 자료형일경우 isAlphabetic으로 알파벳 유무를 확인할 수 있다
 ************/

public class ch01_05 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		char[] c = str.toCharArray();
		int lt =0, rt=str.length()-1;
		String result = "";
		
		while(lt<rt) {
			if(!Character.isAlphabetic(c[lt])) lt++;
			else if(!Character.isAlphabetic(c[rt])) rt--;
			else {
				char tmp = c[lt];
				c[lt] = c[rt];
				c[rt] = tmp;
				lt++;
				rt--;
			}
		}
		System.out.print(String.valueOf(c));
	}
}
