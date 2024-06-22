package BackJoon.Step5;

/*
 * 문제 : 문자열
 * Time : 76 ms 
 * */
import java.io.*;

public class Boj_9086 {
	public static void main(String args[]) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int num = Integer.parseInt(br.readLine());
		String str = "";

		for (int i = 0; i < num; i++) {
			str = br.readLine();
			int len = str.length();
			str = str.charAt(0) + "" + str.charAt(len - 1);
			bw.write(str + "\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}

}
