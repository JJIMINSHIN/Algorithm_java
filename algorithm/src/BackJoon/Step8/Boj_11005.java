package BackJoon.Step8;

import java.io.*;
import java.util.*;

/************
 * @info : 진법 변환2
 * @date : 2025/01/09 15:39 PM
 * @time : 64(ms)
 * @Description :
 * 진법 변환
 * N진법 -> 10진법
 * int n = Intger.parseInt(String, 해당(3진법이였으면 3);
 * 10진법 - > n진법
 * String str = Integer.toString(10진수 int, 바꿀진법);
 ************/
 
public class Boj_11005 {
	public static void main(String args[]) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		if(b > 10)
			System.out.println(Integer.toString(n,b).toUpperCase());
		else 
			System.out.println(Integer.toString(n,b));
		br.close();
	}

}
