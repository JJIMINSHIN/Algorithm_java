package BackJoon.Step3;
/*
 * 문제 : A+B - 5 
 * Exception in thread "main" java.util.NoSuchElementException 발생
 * 1. write 부분을 res =0일때, flush()하도록 해놓으니, 당연히 다음 토큰을 못 가지고 와서 빼냄
 * 2. 마지막 합계 0은 제외해야하는데 포함되서 break; 밑으로 위치 변경
 * */

import java.io.*;
import java.util.*;

public class Boj_10952 {
	public static void main(String args[]) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int res = a+b;
			
			if(res == 0) 
				break;
			bw.write(res+"\n");

		}
		bw.flush();
		bw.close();
		br.close();
			
	}
}
