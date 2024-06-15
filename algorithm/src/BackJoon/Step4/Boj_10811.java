package BackJoon.Step4;
/*
 * 문제 : 바구니 뒤집기
 * Time : 84 ms
 * 공넣기와 비슷했던 문제
 * 단순 swap으로 풀다가 한번 삐끗했다.
 * 남들처럼 tmp배열에 카피하는 방식으로 코드를 약간 지저분하게 짜고싶지 않아서 
 * 최대한 Collections에 있는 메서드를 사용하고 싶었다.
 * 찾아보니 subList라는 메서드가 subsring처럼 값을 빼낼수 있길래 
 * reverse와 함께 사용했다.
 * */

import java.io.*;
import java.util.*;

public class Boj_10811 {
	public static void main(String args[]) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		ArrayList<String> el = new ArrayList<String>();
		
		int n = Integer.parseInt(st.nextToken()); // 바구니 갯수 :N
		int m = Integer.parseInt(st.nextToken()); // 4번 반복 : M
		
		for(int i=1; i<=n; i++) {
			el.add(i+"");
		}
		for(int i=0; i<m; i++) {
			//System.out.println(sb);
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken())-1;
			int b = Integer.parseInt(st.nextToken());

			Collections.reverse(el.subList(a, b));
		}
		
		for(String str : el) {
			System.out.print(str+" ");
		}
		
	}
}
