package BackJoon.Step5;

/*
 * 문제 : 숫자의 합
 * Time : 64 ms 
 * charAt(idx) -'0'을 하면 정수로 형변환 시켜준다.
 * 그냥 charAt(idx)를 하면 아스키코드로 변환
 * */
import java.io.*;

public class Boj_11720 {
	public static void main(String args[]) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine());
		int sum = 0;
		String line = br.readLine();
		
		for(int i=0; i<num; i++) {
			sum += line.charAt(i)- '0';
		}
		System.out.println(sum);
	}

}
