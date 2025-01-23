package programmers.level1;

import java.util.Arrays;

/************
 * @info : 나누어 떨어지는 숫자 배열
 * @date : 2025/01/17 15:42 PM
 * @time : 45(ms)
 * @Description :
 * List 쓰지 않고 배열로만 풀고 싶었다
 * Arrays.copyOf(tmp, idx);
 * Arrays.copyOf는 배열의 일부를 복사하여 새로운 배열을 생성하는 Java 메서드, 
 * tmp 배열의 앞부분 idx개만 복사하여 새로운 배열을 반환
 ************/

public class _20250117_01 {
	public int[] solution(int[] arr, int div) {
		int[] tmp = new int[arr.length];
		int idx = 0;

		for (int n : arr) {
			if (n % div == 0) {
				tmp[idx++] = n;
			}
		}

		if (idx == 0)
			return new int[] { -1 };

		int[] ans = Arrays.copyOf(tmp, idx);
		Arrays.sort(ans);
		return ans;
	}

}
