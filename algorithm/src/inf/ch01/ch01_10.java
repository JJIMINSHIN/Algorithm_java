package inf.ch01;

import java.io.*;

/************
 * @name : 가장 짧은 문자거리
 * @date : 2024/12/24 17:37 PM
 * @time : 157 (ms)
 * @Description :
 * 왼쪽으로 한번, 오른쪽으로 한번씩 돌면서 조건과 같은 언어면 idx값을 0으로 초기화 해주며
 * 각각 배열에 담아 작은값을 반환처리!
 * 처음에 둘이 비교하는 부분에서 쓸데없이 시간을 많이쓴듯..
 ************/

public class ch01_10 {
	public static void main(String args[]) {
		long startMs = System.currentTimeMillis();
		int[] sol= solution("teachermode", 'e');
		for(int x : sol){
			System.out.print(x+" ");
		}
		long endMs = System.currentTimeMillis();
		System.out.println();
		System.out.println("ms = "+(endMs-startMs)+"ms");
	}

	private static int[] solution(String str, char x) {
		int[] answer = new int[str.length()];
		int idx=1000;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)==x) {
				 idx =0;
				 answer[i] = idx;
			}else {
				idx++;
				answer[i] = idx;
				
			}
		}
		idx =1000;
		for(int i=str.length()-1; i>=0; i--) { //10번 인덱스부터
			if(str.charAt(i)==x) {
				 idx =0;
			}else {
				idx++;
				answer[i] = Math.min(answer[i], idx);
			}
		}
		
		return answer;
		
	}
	

}

