package BackJoon.Step5;

/*
 * 문제 : 문자와 문자열
 * Time : 80 
 * 문자열에서 문자 찾는 함수 : chatAt(숫자) => 숫자번째 문자를 가져온다~
 * */
import java.io.*;

public class Boj_27866 {
	public static void main(String args[]) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int idx = Integer.parseInt(br.readLine());
		System.out.println(str.charAt(idx-1));
	}

}
