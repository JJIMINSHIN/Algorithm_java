package BackJoon.Step3;
/*
 * 문제 : 코딩은 체육과목 입니다
 * Time : 
 * 80 ms - java 8
 * 128 ms -java 11
 * repeat() 메서드는 java11에서 추가되었으므로 8에서는 사용 불가 
 * */

import java.io.*;

public class Boj_25314 {
	/*
	 * java -8
	 * */
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine()) / 4;
		for (int i = 0; i < num; i++) {
			System.out.print("long ");
		}
		System.out.println("int");
		br.close();

	}

	/*
	 * java 11 version
	 * */
	
	public void  Version11() throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine())/4;
        System.out.println("long ".repeat(num)+"int");
        br.close();
        
		
	}

}
