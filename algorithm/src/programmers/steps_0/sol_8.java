package programmers.steps_0;

import java.util.ArrayList;

//배열의 길이에 따라 다른 연산하기
public class sol_8 {
	public static void main(String[] args) {
		int[] arr = {49, 12, 100, 276, 33};
		int n = 27;
		
		System.out.println(new sol_8().solution(arr, n));

	};

	public ArrayList solution(int[] arr, int n) {
		ArrayList answer = new ArrayList();
		
		for(int i =0; i<arr.length; i++) {
			if(arr.length % 2 != 0) {
				if(i%2==0) answer.add(arr[i]+n);
				else answer.add(arr[i]);
			}else {
				if(i%2!=0)answer.add(arr[i]+n);
				else answer.add(arr[i]);
			}
		}
		
		return answer;
	}
	

}
