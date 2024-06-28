package BackJoon.Step5;

/*
 * 문제 : 상수 
 * Time : 80 ms
 * StringBuffer 클래스 이용하면 문자열 뒤집을 수 있음
 * StringBuffer().append(str).reverse().toString()
 * StringBuffer 타입 -> String타입으로 변환 (parseInt(String s)이니깐)
 * */
import java.io.*;
import java.util.StringTokenizer;

public class Boj_2908 {
public static void main(String args[]) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(new StringBuffer().append(st.nextToken()).reverse().toString());
		int b = Integer.parseInt(new StringBuffer().append(st.nextToken()).reverse().toString());		

		if(a >b )System.out.println(a);
		else System.out.println(b);
		br.close();
	}

}
