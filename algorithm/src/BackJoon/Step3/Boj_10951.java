package BackJoon.Step3;
/*
 * 문제 : A+B - 4 
 * 시간 : 88 ms
 * */

import java.io.*;
import java.util.*;

public class Boj_10951 {
	public static void main(String args[]) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String str = null;
		
		while((str =br.readLine()) != null) {
			StringTokenizer st = new StringTokenizer(str);
			if(str.hashCode()>0)
				bw.write(Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken())+"\n");
			else break;

		}
		bw.flush();
		bw.close();
		br.close();
	}
}
