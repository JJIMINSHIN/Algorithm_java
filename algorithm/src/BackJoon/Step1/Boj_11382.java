package BackJoon.Step1;

import java.io.*;
import java.util.*;

/*
 * 메모리		시간	
 *	11536KB	80ms	
 * author: 지민
 * */

public class Boj_11382 {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long a = Long.parseLong(st.nextToken());
		long b = Long.parseLong(st.nextToken());
		long c = Long.parseLong(st.nextToken());
		
		System.out.println(a+b+c);
		
	}

}
