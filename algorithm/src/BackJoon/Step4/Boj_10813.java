package BackJoon.Step4;
/*
 * 문제 : 공 넣기
 * Time : 84 ms
 * swap이라는 메서드를 처음 써봤다.
 * Collections.swap(list, a, b);
 * a의 인덱스의 값을 b인덱스의 값으로 서로 변경해주기
 * */

import java.io.*;
import java.util.*;

public class Boj_10813 {
	public static void main(String args[]) throws IOException {
        
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
