package inf.ch02;

import java.io.*;
import java.util.Arrays;

/************
 * @info : 가위 바위 보
 * @date : 2025/01/10 12:52 AM
 * @time : 321(ms)
 * @Description :
 * 계속 문자열 배열을 int로 parseInt하는게 가독성도 너무 해치고, 성능도 저하되는것같아 받아올때 정수형 배열로 받아올 수 없을까 고민하던 와중에
 * Stream API의 mapToInt라는 메서드를 발견했다.
 * 어렵긴 하지만 잘 정리해서 앞으로 요긴하게 써먹어보자!
 ************/
 
public class ch02_03 {

	public static void main(String args[]) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
        int[] arr1 = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] arr2 = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		
		solution(n, arr1, arr2);

		br.close();
	}

	public static void solution(int n, int[] a, int[] b) throws IOException {
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<n; i++) {
			if(a[i]==b[i]) sb.append("D \n");
            else if(a[i]==1 && b[i]==3) sb.append("A \n");
            else if(a[i]==2 && b[i]==1) sb.append("A \n");
            else if(a[i]==3 && b[i]==2) sb.append("A \n");
            else sb.append("B \n");
		}
		
		System.out.println(sb.toString());
	}
}
