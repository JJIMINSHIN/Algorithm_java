package inf.ch02;

import java.io.*;

/************
 * @info : 큰 수 출력하기
 * @date : 2025/01/09 16:08 PM
 * @time : 103(ms)
 * @Description :
 * 처음에 오답이 나와서 보니 콘솔값을 안찍어줘서 그런거였음
 * 채점 프로그램 자체에서 빼주는 줄...
 ************/
 
public class ch02_01 {

	public static void main(String args[]) throws Exception {
		long startMs = System.currentTimeMillis();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		String str = br.readLine();
		
		solution(n, str);
		
		long endMs = System.currentTimeMillis();
		System.out.println("ms = " + (endMs - startMs) + "ms");
	}

	public static String solution(int n, String str) {
		String res ="";
		String[] arr = str.split(" ");
		res  = arr[0];
		
		for(int i=1; i<arr.length; i++) {
			int a = Integer.parseInt(arr[i-1]);
			int b = Integer.parseInt(arr[i]);
			if(a<b) {
				res+= (" "+b);
			}
		}
		System.out.println(res);
		return res;
    }


}
