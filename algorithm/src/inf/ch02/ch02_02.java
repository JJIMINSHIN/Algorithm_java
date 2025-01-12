package inf.ch02;

import java.io.*;

/************
 * @info : 보이는 학생
 * @date : 2025/01/10 12:15 AM
 * @time : 259(ms)
 * @Description :
 * 단순히 앞사람이랑 비교하는건 줄 알았는데 여태까지 있는 학생이랑 비교하는 문제
 * 항상 문제를 잘 읽도록!
 ************/
 
public class ch02_02 {

	public static void main(String args[]) throws Exception {
		long startMs = System.currentTimeMillis();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		String str = br.readLine();
		
		System.out.println(solution(n, str));
		
		long endMs = System.currentTimeMillis();
		System.out.println("ms = " + (endMs - startMs) + "ms");
	}

	public static int solution(int n, String str) {
		int cnt = 1;
		
		String[] arr = str.split(" ");
		int ans  = Integer.parseInt(arr[0]);
		
		for(int i=1; i<arr.length; i++) {
			int tmp = Integer.parseInt(arr[i]);
			if(ans<tmp) {
				ans = tmp;
				cnt++;
			}
		}
		return cnt;
    }


}
