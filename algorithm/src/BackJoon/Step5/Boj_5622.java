package BackJoon.Step5;

/*
 * 문제 : 다니얼
 * Time : 76 ms 
 * switch - case문 사용할때 
 * 같은 값을 가진 여러 문을 아래와 같이 쓰는걸 이번을 통해 배웠다.!
 * */
import java.io.*;

public class Boj_5622 {
	public static void main(String args[]) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] str = br.readLine().toCharArray();
		int cnt =0;
		for(char c : str) {
			switch(c) {
				case 'A': case 'B': case 'C':
					cnt +=3;
					break;
				case 'D': case 'E': case 'F':
					cnt +=4;
					break;
				case 'G': case 'H': case 'I':
					cnt +=5;
					break;
				case 'J': case 'K': case 'L':
					cnt +=6;
					break;
				case 'M': case 'N': case 'O':
					cnt +=7;
					break;
				case 'P': case 'Q': case 'R': case 'S':
					cnt +=8;
					break;
				case 'T': case 'U': case 'V':
					cnt +=9;
					break;
				default:
					cnt+=10;
					break;
			}
		}
		System.out.println(cnt);
			
		br.close();
	}

}
