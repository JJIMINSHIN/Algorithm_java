package BackJoon.Step1;

import java.io.*;
import java.util.*;

/*
 * bufferedReader, Scanner 둘 다 한줄에 여러 숫자가 있으면  
 * nextToken, next를 사용해서 가져오면됨.
 * */

public class Boj_10430 {
	public static void Boj_10430(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a, b, c;
		
		a = Integer.parseInt(st.nextToken());
		b = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());
		
		System.out.println(new Boj_10430().getFst(a, b, c));
		System.out.println(new Boj_10430().getScd(a, b, c));
		System.out.println(new Boj_10430().getTrd(a, b, c));
		System.out.println(new Boj_10430().getfth(a, b, c));

		br.close();
	}

	public int getFst(int a, int b, int c) {
		return (a + b) % c;
	}

	public int getScd(int a, int b, int c) {
		return ((a % c) + (b % c)) % c;
	}

	public int getTrd(int a, int b, int c) {
		return (a * b) % c;
	}

	public int getfth(int a, int b, int c) {
		return ((a % c) * (b % c)) % c;
	}

}
