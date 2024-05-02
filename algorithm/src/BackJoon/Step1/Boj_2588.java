package BackJoon.Step1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_2588 {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		
        int res1 = a * (b%10); 
		int res2 = a * ((b%100)/10); //8
		int res3 = a*(b/100); 
		int sum =  res1 + (res2*10) + (res3*100);
		
		System.out.println(res1); 
		System.out.println(res2);
		System.out.println(res3);
		System.out.println(sum);
		
		
	}

}
