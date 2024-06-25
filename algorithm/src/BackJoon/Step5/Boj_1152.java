package BackJoon.Step5;

/*
 * 문제 : 단어의 개수
 * Time : 156 ms
 * 별거 아닌 문제인데 예외처리?를 잘 못해서 3연속 틀린 문제
 * 공백 다음에 문자열 여부로 개수가 판별됨으로  
 * StringTokenizer로 받은 문자열에  공백 제거한
 * 문자열의 개수를 countTokens()로 구해주면 된다
 * 다른 방법으로는 nextToken으로 cnt++해줘도 됨!
 * */
import java.io.*;
import java.util.*;

public class Boj_1152 {
	public static void main(String args[]) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		System.out.println(st.countTokens());
		br.close();
	}
}
