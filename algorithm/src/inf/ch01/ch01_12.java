package inf.ch01;

import java.io.*;

/************
 * @name : 암호
 * @date : 2024/12/25 16:21 PM
 * @time : 121 (ms)
 * @Description :
 * Integer.parseInt(ans, 2) 10진수를 2진수로 변환
 * ASCII Code를 문자열로 변환 : (char)로 캐스팅 
 * Code -> ASCII : charAt();
 ************/
public class ch01_12 {
	public static void main(String args[]) throws Exception {
		long startMs = System.currentTimeMillis();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		String res = br.readLine();

		solution(n, res);

		long endMs = System.currentTimeMillis();
		System.out.println("ms = " + (endMs - startMs) + "ms");
	}

	public static String solution(int n, String str) {
		String res = "";
		String ans = "";
		int num = 0;

		for (int i = 0; i < n; i++) {

			ans = str.substring(0, 7).replace('#', '1').replace('*', '0');
			num = Integer.parseInt(ans, 2); //2진수를 10진수로 변환 
			res += (char) num;
			str = str.substring(7);
		}

		System.out.println(res);
		return res;
	}
	

}

