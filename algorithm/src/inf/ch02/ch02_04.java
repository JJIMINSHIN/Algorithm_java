package inf.ch02;

import java.io.*;
import java.util.Arrays;

/************
 * @info : 피보나치 수열
 * @date : 2025/01/10 21:00 PM
 * @time : 98(ms)
 * @Description :
 * 피보나치 수열의 공식 : arr[i] = arr[i-1] + arr[i-2]
 ************/
 
public class ch02_04 {

	public static void main(String args[]) throws  IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		System.out.println(solution(n));
	}

	public static String solution(int n) {
		String res = "1 1 ";
		int[] arr = new int[n];
		arr[0] = 1;
		arr[1] = 1;
		
		for(int i=2; i<n; i++) {
			arr[i] = arr[i-1] + arr[i-2];
			res += (arr[i] +" ");
		}
		return res;
    }
}
