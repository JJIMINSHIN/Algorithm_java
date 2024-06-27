package BackJoon.Step5;

/*
 * 문제 : 알파벳 찾기
 * Time : 64 ms 
 * 반복문을 항상 정수로만 돌렸었는데 저렇게 char의 값으로 반복문을 돌려봐서 색다른 경험이었다
 * a~z까지 알파벳에 있는 존재 여부 확인
 * 단어에 포함되어 있는 경우에는 처음 등장하는 위치 
 * 
 * |b|a|e|k|j|o|o|n|
 * |0|1|2|3|4|5|6|7|
 * 
 * |a|b|c |d |e|f |g |h |i |j|k |l |m |n|o|p |q |r |s |t |u |v |w |x |y |z |
 * |1|0|-1|-1|2|-1|-1|-1|-1|4|-1|-1|-1|7|5|-1|-1|-1|-1|-1|-1|-1|-1|-1|-1|-1|
 * 

 * */
import java.io.*;

public class Boj_10809 {
	public static void main(String args[]) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        
        for(char c ='a'; c<='z'; c++) {
            bw.write(str.indexOf(c)+" ");
        }
        
        bw.flush();
        bw.close();
        br.close();
	}

}
