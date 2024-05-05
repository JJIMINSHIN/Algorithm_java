package BackJoon.Step3;

/*
 * 
 * 시간차이(s) : 8ms(Buffer 사용) , 736ms(StringBuilder 사용), 1100ms(System.out.println 사용)
 * BufferedWriter를 코테에 처음 적용해 보는것 같다.
 * write()를 사용해 버퍼에 출력문 저장 => 출력이 아니라 버퍼에 저장하는 것
 * println()처럼 개행기능이 포함된것이 아니기에 줄바꿈 하려면 write("\n")을 추가하거나 newLine()함수를 사용해 따로 개행처리 해줘야함.
 * 처음 flush한 후 정수가 깨지는 현상 발견
 * BufferedWriter는 아스키코드에 따라 문자가 출력됨
 * 숫자를 String 형태로 변경해서 출력하도록 수정
 * */


import java.io.*;
import java.util.*;

public class Boj_15552 {

	public static void main(String args[]) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		long beforeTime = System.currentTimeMillis(); //코드 실행 전에 시간 받아오기
		
		int num = Integer.parseInt(br.readLine());

		for(int i=0; i<num; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			int res = a+b;
			
			bw.write(res+"");
			bw.newLine();
		}
		
		bw.flush();
		
		long afterTime = System.currentTimeMillis(); // 코드 실행 후에 시간 받아오기
		long secDiffTime = (afterTime - beforeTime)/1000; //두 시간에 차 계산
		System.out.println("시간차이(s) : "+secDiffTime);
		
		bw.close();
		br.close();
	}
	
	public void solveStringBuilder()  throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int num = Integer.parseInt(br.readLine());

		for(int i=0; i<num; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int res = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
			
			sb.append(res+"\n");
		}

		br.close();
		System.out.println(sb);
	}
	
	public void solveSOUT() throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());

		for(int i=0; i<num; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			System.out.println(a+b);
		}
	}
}
