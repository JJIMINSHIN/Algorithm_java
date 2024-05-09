package BackJoon.Step3;
/*
 * 문제 : A+B - 7
 * Time : 84 ms 
 * */

import java.io.*;
import java.util.*;


public class Boj_11021 {
	public static void main(String args[]) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());

		for(int i=1; i<=num; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int res = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
			bw.write("Case #"+i+": "+res);
			bw.newLine();
		}
		bw.flush();
		bw.close();
		br.close();
	}

}
