package BackJoon.Step3;
/*
 * 문제 : 합
 * Time : 72 ms
 * */

import java.io.*;
import java.util.*;

public class Boj_8393 {
	public static void main(String args[]) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int sum=0;

        for(int i=1; i<=a; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
