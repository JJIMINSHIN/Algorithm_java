package BackJoon.Step3;
/*
 * 문제 : 별 찍기 -1
 * Time : 128 ms
 * repeat()함수는 자바 11버전에서만 사용할 수 있는것 까먹지 말기!
 * */

import java.io.*;
import java.util.*;

public class Boj_2438 {
	public static void main(String args[]) throws IOException {
        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());

		for(int i=1; i<=num; i++) {
			System.out.println("*".repeat(i));
		}
		br.close();
    }
}
