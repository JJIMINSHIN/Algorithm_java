package BackJoon.Step6;

import java.io.*;

/*
 * 문제 : 그룹 단어 체커
 * 시간 : 72 ms
 * !!! 좀 더 고민해보고 문제 다시 리팩토링 해보기
 * 
 * 이 문제는 
 * 1. 한 단어씩 나오는 것은 OK
 * 2. 이전에 나오지 않은 단어가 나오는 것은 가능
 * 3. 이전에 나온값이 연속되어 나오는 것 O
 * 4. 이전에 나온값이 연속되지 않고 등장 X
 * 
 * 문제를 이해하고 풀긴 하였으나 내것이 아니기에 꼭 다시 리팩토링해서 내것으로 내가 하고시픈 대로 한번 해보기!
 * 
 * ## 다시 풀어보고 이해해야하는 것!
 * 1. boolean값 for문 안에 돌렸을 때 값 다르게 나온것 다시 한번 체크하기
 * 2. boolean al값 전역으로 선언했더니 -1 indexoutofrange 나온 이유 생각해보기
 * 
 * */
public class Boj_1316 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine()); // 첫 줄에 나오는 단어의 개수
		int res = 0;
		String str =null;
		boolean chk;
		int idx = 0;
		
		
		for(int i=0; i<num; i++) {
			str = br.readLine(); // 문자열
			boolean al[] = new boolean[26];
			chk=true;
			for(int j=0;j<str.length();j++) {
				
				idx = str.charAt(j)-'a';
				if(al[idx]) {
					if(str.charAt(j)!=str.charAt(j-1)) {
						chk= false;
						break;
					}
				}else {
					al[idx] = true;
				}
			}//for j
			if(chk) res++;
		}
		System.out.println(res);
		
		
	}
}
