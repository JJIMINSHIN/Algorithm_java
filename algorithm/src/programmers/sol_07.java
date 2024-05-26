package programmers;

import java.util.ArrayList;

public class sol_07 {
	
	public static void main(String[] args) {
		int arr[] = {5, 1, 4};
		System.out.println(new sol_07().solution(arr));
	};

    public ArrayList<Integer> solution(int[] arr) {
    	ArrayList<Integer> answer = new ArrayList<Integer>();
    	
        for(int i =0; i<arr.length; i++){
        	for(int j=0;j<arr[i]; j++) {
        		answer.add(arr[i]);
        	}
        }
    	
    	return answer;
    }

}
