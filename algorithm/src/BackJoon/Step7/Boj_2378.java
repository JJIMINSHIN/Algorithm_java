package BackJoon.Step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/************
 * @info : 행렬 덧셈
 * @date : 2024/01/25 11:33 PM
 * @time :  288 -> 120(ms)
 * @Description :
 * 
 * 
 * ! 첫번쨰 시도 후 시간복잡도 줄이기
 * 출력하는 부분에서 값을 더한 후 System.out.print로 값을 던져 출력하는 방식에서
 * StringBuiler를 사용하여 append 후 한번에 출력하는 방식으로 변경함
 * 절 반이 넘게 줄이기 성공
 ************/
public class Boj_2378 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		int[][] arr = new int[n][m];

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < n; j++) {
				st = new StringTokenizer(br.readLine());
				for (int k = 0; k < m; k++) {
					arr[j][k] += Integer.parseInt(st.nextToken());
				}
			}
		} // i

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				sb.append(arr[i][j] + " ");
			}
			sb.append("\n");
		}
		System.out.println(sb.toString());

	}
}
