package BackJoon.Step3;
/*
 * 문제 : A+B - 8
 * Time : 84 ms 
 * */

import java.io.*;
import java.util.*;


public class Boj_11022 {
	public static void main(String args[]) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());

		for(int i=1; i<=num; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int res = a+b;
			
			bw.write("Case #"+i+": "+a+" + "+b+" = "+res);
			bw.newLine();
		}
		bw.flush();
		bw.close();
		br.close();
	}

}
