package BackJoon.Step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/************
 * @info : 세로읽기
 * @date : 2025/01/07 22:10 PM
 * @time : 68(ms)
 * @Description :
 * 이 문제는 생각보다 문제 자체가 이해가 안됐다
 * 특히 간만에 2차원 배열 문제 푸니깐 헷갈렸던것도 한목함 [가로/행][세로/열]
 * split[] 상태로 2차원 배열로 넣으면 알아서 i,j가 분리되서 들어간다..!!
 * 일단 받은 문자 한줄씩 끝어서 배열에 담아주기
 * 문제에서 5행과 최대 15열이 나온다고 했으니 5열은 고정
 * 출력값을 arr[j][i]로 해준 이유는 
 * j(행)는 5까지 돌아야하고 i(열)는 최대 15까지 돌아야하기 때문에 arr[j][i]로 출력해줘야함
 * arr[i][j]로 출력시  AABCDDafzz09121a8EWg6P5h3kx -> 행한줄씩 출력됨
 * arr[j][i]로 출력시  Aa0aPAf985Bz1EhCz2W3D1gkD6x -> 세로로 읽음!
 ************/
public class Boj_10798 {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[][] arr = new String[5][15];

		for (int i = 0; i < 5; i++) {
			String tmp[] = br.readLine().split("");
			// System.out.println("tmp.length = "+tmp.length);
			for (int j = 0; j < tmp.length; j++) {
				// System.out.println("arr["+i+"] = "+tmp[j]);
				arr[i][j] = tmp[j];
			}
		}

		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < 5; j++) {
				if (arr[j][i] == null)
					continue;
				System.out.print(arr[j][i]);
			}
		}
		br.close();
	}
}
