package inf.ch02;

import java.io.*;
import java.io.IOException;
import java.io.InputStreamReader;

/************
 * @info : 뒤집은 소수
 * @date : 2025/01/10 21:15 PM
 * @time : 127(ms)
 * @Description :
 *  n에 대한 약수로 접근하는 것이 아니라, n의 배수를 기반으로 접근
 ************/
 
public class ch02_06 {

	public static void main(String args[]) throws  IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		System.out.println(solution(n));
	}

	public static int solution(int n) {
		int cnt=0;
		int[] arr = new int[n+1];
		for(int i=2; i<=n; i++){
			if(arr[i]==0){
				cnt++;
				for(int j=i; j<=n; j=j+i) arr[j]=1;
			}
		}
		return cnt;
    }
}
