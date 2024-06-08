package BackJoon.Step4;
/*
 * 문제 : 과제 안 내신 분..?
 * Time : 80 ms
 * 좀 해맨 문제인데 도대체 왜 해맸지..
 * 28개의 정수가 !고정적!으로 주워지므로, 해당 번호의 인덱스(0부터 시작하니-1해준다)에 0이 아닌값을 넣어주고
 * 30번의 숫자를 찾을때 0이 아닌 무언가의 값이면 내뱉도록 구현!
 * */

import java.io.*;
import java.util.*;

public class Boj_5597 {
	public static void main(String args[]) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[30];
		
		for(int i=0; i<28; i++) {
			int num = Integer.parseInt(br.readLine());
			arr[num-1] = 1;
		}
		
		for(int i=0; i<30; i++) {
			if(arr[i]!=1) System.out.println(i+1);
		}
		br.close();
	}
}
