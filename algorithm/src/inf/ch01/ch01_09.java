package inf.ch01;

import java.io.*;

/************
 * @name : 숫자만 추출
 * @date : 2024/10/15 10:54 AM
 * @time : 109 (ms)
 * @Description :
 * 8번을 활용해서 정규식으로 숫자 추출! 
 * 정규식 표현법 계속 헷갈리는데 제발 헷갈리지 말자..
 * ^=>문자열 시작 
 * +$ : 문자열 종료
 * [] 안에 써주어야함
 ************/


public class ch01_09 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine().replaceAll("[^0-9+$]", "");
		int num = Integer.parseInt(str);
		System.out.println(num);
	}

}
