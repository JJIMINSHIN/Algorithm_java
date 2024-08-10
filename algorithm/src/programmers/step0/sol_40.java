package programmers.step0;

import java.io.IOException;


/************
 * @name : n의 배수
 * @date : 2024/8/10 17:08 PM
 * @time :  0 (ms)
 * @Description :
 * 단순 조건절 문제
 * 
 ************/

public class sol_40 {

	public static void main(String args[]) throws IOException {
		long startTime = System.currentTimeMillis();
		
		System.out.println(new sol_40().solution(300, 2));
		
		long endTime = System.currentTimeMillis();
		long duTime = endTime - startTime;
		System.out.println("active time = " + duTime + " m/s");
	}

	 public int solution(int num, int n) {
	        return num%n == 0 ? 1 : 0;
	 }
}
