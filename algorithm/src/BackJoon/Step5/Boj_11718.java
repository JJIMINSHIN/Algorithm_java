package BackJoon.Step5;

/*
 * 문제 : 그대로 출력하기
 * Time : 84 / 80 ms 
 * System.out.println을 사용하면 4ms가 더 길게 나온다 하지만 간결하고 그렇게 속도 차이가 나지 않아
 * 개인적으로 system out을 좀 더 선호!
 * */
import java.io.*;

public class Boj_11718 {
	public static void main(String args[]) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));			
		String line = null;
		while((line = br.readLine()) != null) {
			System.out.println(line);
		}
		br.close();
	}
	
	public void useBW() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String line = null;
		while((line = br.readLine()) != null) {
			bw.write(line+"\\n");
		}
		bw.flush();
		
		bw.close();
		br.close();
	}

}
