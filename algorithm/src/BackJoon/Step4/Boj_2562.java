package BackJoon.Step4;

/*
 * cnt 체크 하는거 안에다 넣어서 계속 1로 되고 있었음
 * cnt => for문 밖으로 빼냄, max보다 작은 수 일때는 if문 당연히 안탐 이것도 간과함
 * i+1로 인덱스 찾아야지 max보다 작은값 건너뛰어도 인덱스를 찾을 수 있음.
 * */

import java.io.*;

public class Boj_2562 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int arr[] = new int[9];
		int max = 0;
		int idx =0;
		int cnt = 0;

		for(int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			if(arr[i] >max ) {
				max = arr[i]; 
				idx = i;
				//cnt++;
				//System.out.println("max = "+max+" idx = "+idx+" cnt = "+cnt );
			}
		}
		System.out.println(max);
		System.out.println(idx);
	}

}
