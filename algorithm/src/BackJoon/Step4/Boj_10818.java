package BackJoon.Step4;
/*
 * 문제 : 최소, 최대	
 * Time : 420 ms
 *  -1,000,000<= num <= 1,000,000
 *  인데 min의 값을 0으로 설정해서 헤맸었다.
 *  범위도 잘 확인하고 고려해서 코드짜자!
 * */

import java.io.*;
import java.util.*;

public class Boj_10818 {
	public static void main(String args[]) throws IOException {
		List<String> list = new ArrayList<String>();
		
		for(int i=1; i<=5; i++) {
			list.add(i+"");		
		}
		
		for(String li : list) {
			System.out.print(li+" ");
		}
		
		Collections.swap(list, 1, 3);
		System.out.println();
		for(String li : list) {
			System.out.print(li+" ");
		}
		
		
	}
	
	public void useCollect() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()); // 바구니 수
		int m = Integer.parseInt(st.nextToken()); // 반복할 횟수
		
		ArrayList el = new ArrayList();
		
		
		for(int i=0; i<n; i++) {
			el.add(i+1);
		}
		
		for(int i=0; i<m; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken())-1;
			int b = Integer.parseInt(st.nextToken())-1;
			
			Collections.swap(el, a, b);
		}
		
		for(int i=0; i<n; i++) {
			System.out.print(el.get(i)+" ");
		}
		
		br.close();
	}
}
