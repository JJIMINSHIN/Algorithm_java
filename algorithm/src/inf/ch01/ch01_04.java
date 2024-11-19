package inf.ch01;

import java.io.*;

/************
 * @name : 단어 뒤집기
 * @date : 2024/07/04 
 * @time : 1119 (ms)
 * @Description :
 ************/

public class ch01_04 {
	
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = null;
		String line = null;
		for(int i=0; i<n; i++) {
			line = br.readLine();
			sb = new StringBuilder(line);
			bw.write(sb.reverse().toString());
			bw.newLine();
		}
		bw.flush();
		bw.close();
		br.close();
	}

}
