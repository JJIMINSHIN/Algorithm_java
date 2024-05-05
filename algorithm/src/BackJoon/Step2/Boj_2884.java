package BackJoon.Step2;

/*
 * 문제 : 알람 시계
 * 60분이 안넘어가는 경우 
 * 1) 현재 분에 15분 추가해주기
 * 2-1) 자정일 경우 a = 23시로 맞춰주기
 * 2-2) 자정이 아닐경우 현재 시에서 1시간 빼주기
 * 60분이 넘어가는 경우는 45분 추가해주기
 * */
import java.io.*;
import java.util.*;

public class Boj_2884 {
	public static void main(String args[]) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());

		if (b - 45 < 0) {
			if (a == 0)
				a = 23;
			else
				a = a - 1;
			b = b + 15;
		} else {
			b = b - 45;
		}

		System.out.println(a + " " + b);
	}

}
