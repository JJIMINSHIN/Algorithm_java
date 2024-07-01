package BackJoon.Step6;

/*
 * 문제 : 킹, 퀸, 룩, 비숍, 나이트, 폰
 * Time : 64 ms
 * 처음 뮨제 봤을때는 복잡하려나 했지만, 생각보다 간단하게 풀 수 있는 문제 
 * 시간 테스트로 StringBuilder를 사용해 보았는데 시간이 오히려 많이 나와 아래값이 
 * 시간처리로는 좀 더 효율적인것 같당
 * */	
import java.io.*;
import java.util.*;

public class Boj_3003 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer str = new StringTokenizer(br.readLine());
		
		ArrayList<Integer> el = new ArrayList<Integer>(Arrays.asList(1,1,2,2,2,8));
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for(int i =0; i<el.size(); i++) {
			al.add(Integer.parseInt(str.nextToken()));
		}
		for(int i =0; i<al.size(); i++) {
			System.out.print(el.get(i)-al.get(i)+" ");
		}
		
		br.close();
	}
}
