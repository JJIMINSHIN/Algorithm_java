package programmers.level1;

import java.util.ArrayList;
import java.util.Scanner;

/************
 * @info : 같은 숫자는 싫어
 * @date : 2025/01/30 14:14 PM
 * @time : 0(ms)
 * @Description :
 * 처음에 stream으로 배열 변환하는 방법이 있어서 써봤는데 30ms나옴, 하지만 간결성 좋음
 * 내가 잘 쓰지 않는 방식이고 앞으로도 잘 쓸까? 싶어서 그냥 배열로 변환함
 * 이게 훨씬 빠름..
 ************/

public class _20250130_01 {
	
	public int[] solution(int[] arr) {
		ArrayList<Integer> res = new ArrayList<>();
		int idx = -1;
		
		for (int num : arr) {
			if (idx != num) {
				res.add(num);
			}

			idx = num;
		}

		int[] answer = new int[res.size()];
		for (int i = 0; i < res.size(); i++) {
			answer[i] = res.get(i);
		}
		
		return answer;
	}

}
