package BackJoon.Step8;

import java.io.*;
import java.util.*;

/************
 * @info : 진법 변환
 * @date : 2025/01/09 15:25 PM
 * @time : 84(ms)
 * @Description :
 * 진법 변환
 * N진법 -> 10진법
 * int n = Intger.parseInt(String, 해당(3진법이였으면 3);
 * 10진법 - > n진법
 * String str = Integer.toString(10진수 int, 바꿀진법);
 ************/

public class Boj_2745 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String n = st.nextToken();
		int b = Integer.parseInt(st.nextToken());
				
		int bz = Integer.parseInt(n,b);
		
		System.out.println(bz);
		
		br.close();
	}
	

}
