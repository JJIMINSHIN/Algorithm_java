package programmers.step0;

import java.io.*;
import java.util.*;

/************
 * @name : 조건에 맞게 수열 변환하기 1
 * @date : 2024/8/21 18:10 PM
 * @time : 0 (ms)
 * @Description :
 * 강화된 for문+ 정석으로 형변환 없이 풀어봄
 * 가독성은 조금 떨어짐. array로 변환해 풀어보기!
 ************/

public class sol_45 {

	public static void main(String args[]) throws IOException {
		long startTime = System.currentTimeMillis();
		int[] arr = { 1, 2, 3, 100, 99, 98 };

		System.out.println(new sol_45().force_solution(arr));

		long endTime = System.currentTimeMillis();
		long duTime = endTime - startTime;
		System.out.println("active time = " + duTime + " m/s");
	}

	
	public int[] force_solution(int[] arr) {
		int[] answer = new int[arr.length];
		int cnt = 0;
		for (int i : arr) {
			if (i >= 50 && i % 2 == 0) {
				i /= 2;
				answer[cnt++] = i;
			} else if (i < 50 && i % 2 == 1 ) {
				i *= 2;
				answer[cnt++] = i;
			}else {
				answer[cnt++] =i;
			}
		}

		return answer;
	}

}
