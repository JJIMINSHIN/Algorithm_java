package BackJoon.Step4;
/*
 * 문제 : 평균
 * Time : 84 ms
 * sum부분에서 계속 0이 나와 테스트 하는데 애를 먹었다..
 * 실수까지 나와야하니 double로 받아들이게 해놓고 정수만 입력해서 계속 0이 나왔던것!
 * 1. 계산값들 앞에 (double)로 캐스트 해주거나
 * 2. 1.0을 곱해주어 수식 자체를 더블형으로 바꿔주기!!
 * 1.0 *해서 형변환 하는건 이번에 처음 알았는데 꼭 기억해두자!
 * */

import java.io.*;
import java.util.*;

public class Boj_1546 {
	public static void main(String args[]) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine()); // 총개수
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int res[] = new int[num];
		double sum =0;
		
		for(int i =0; i<num; i++){
			res[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(res);
		int max = res[res.length-1];
		
		for(int i =0; i<num; i++){
			sum += (1.0*res[i]/max)*100;
		}
		
		System.out.println(sum/num);
		
	}
}
