package BackJoon.Step2;

/*
 * 문제 : 주사위 세개
 * 세 수의 최대값을 구할때
 * a,b의 최대값을 구하고 그 다음 c와 비교해 최댓값을 구하기.
 * */
import java.io.*;
import java.util.*;

public class Boj_2480 {
	public static void main(String args[]) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        
        int res =0;
        
        if(a==b && b==c && a==c) System.out.println(10000+(a*1000));
        else if(a == b || a==c) System.out.println(1000+(a*100));
        else if(a == b || b==c) System.out.println(1000+(b*100));
        else if(a!= b && b!=c && a!=c) {
            res = Math.max(a, Math.max(b, c));
            System.out.println(res*100);
        }
	}

}
