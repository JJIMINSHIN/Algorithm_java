package inf.ch01;

import java.io.*;

/************
 * @name : 가장 짧은 문자거리
 * @date : 2024/10/15 10:54 AM
 * @time : 109 (ms)
 * @Description :
 ************/

public class ch01_10 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine().replaceAll("[^0-9+$]", "");
		int num = Integer.parseInt(str);
		System.out.println(num);
	}
	

}

