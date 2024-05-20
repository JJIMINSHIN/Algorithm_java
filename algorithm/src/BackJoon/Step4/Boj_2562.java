package BackJoon.Step4;
/*
 * 문제 : 최댓값	
 * Time : 76 ms
 * */

import java.io.*;
import java.util.*;

public class Boj_2562 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int arr[] = new int[9];
		int max = 0;
		int idx =0;
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			if(arr[i] >max ) {
				max = arr[i]; 
				idx=i+1; 
			}
		}
		System.out.println(max);
		System.out.println(idx);
	}
}
