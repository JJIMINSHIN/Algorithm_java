package programmers.step0;

import java.io.*;
import java.util.*;

/************
 * @name : 문자열 붙여서 출력하기
 * @date : 2024/8/18 09:43 PM
 * @time : 829/931 || 649/362 (ms)
 * @Description : 
 * 	BufferedReader 사용하는것보다 scanner 사용하는것이 더 빠르게 처리됨 데이터가 많을때는
 *  buffered를 쓰는게 맞지만 이렇게 단문일떄는 scanner+next 조합이 더 빠르다.
 ************/

public class sol_42 {

	public static void main(String args[]) throws IOException {
		long startTime = System.currentTimeMillis();

		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();

		System.out.println(a + b);

		long endTime = System.currentTimeMillis();
		long duTime = endTime - startTime;
		System.out.println("active time = " + duTime + " m/s");
	}

}
