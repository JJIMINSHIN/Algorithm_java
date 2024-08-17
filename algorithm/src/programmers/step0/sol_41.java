package programmers.step0;

import java.io.IOException;
import java.util.ArrayList;



/************
 * @name : 배열 원소의 길이
 * @date : 2024/8/17 15:43 PM
 * @time :  0 (ms)
 * @Description :
 * string[]으로 풀지 않고 arraylist로 형변환해서 처리함 => 속도와 풀이 더 용이하게 하기위해서!
 * 
 ************/

public class sol_41 {

	public static void main(String args[]) throws IOException {
		long startTime = System.currentTimeMillis();
		
		String[] arr = {"We", "are", "the", "world!"};
		System.out.println(new sol_41().solution(arr));

		long endTime = System.currentTimeMillis();
		long duTime = endTime - startTime;
		System.out.println("active time = " + duTime + " m/s");
	}

    public ArrayList solution(String[] strArr) {
        ArrayList answer = new ArrayList();
        for(String str : strArr) {
        	answer.add(str.length());
        }
        return answer;
    }
}
