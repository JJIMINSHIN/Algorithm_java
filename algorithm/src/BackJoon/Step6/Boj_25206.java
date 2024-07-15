package BackJoon.Step6;

/*
 * 문제 : 너의 평점은
 * Time : 76 ms
 * 크로아티아 알파벳 풀고나서 풀어서 좀 편안하게 해결할 수 있었던 문제
 * 순서 상관없으므로 HashMap 사용
 * */	
import java.io.*;
import java.util.*;

public class Boj_25206 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		double sum = 0;
		double total = 0;
		
		HashMap<String, Double> map = new HashMap<String, Double>();
		map.put("A+", 4.5);
		map.put("A0", 4.0);
		map.put("B+", 3.5);
		map.put("B0", 3.0);
		map.put("C+", 2.5);
		map.put("C0", 2.0);
		map.put("D+", 1.5);
		map.put("D0", 1.0);
		map.put("F", 0.0);
		
		StringTokenizer st = null;

		for(int i=0; i<20; i++) {
			st = new StringTokenizer(br.readLine());
			String subject = st.nextToken(); //과목
			double cnt = Double.parseDouble(st.nextToken()); //학점
			String grade = st.nextToken(); // 과목평점
			
			if(grade.equals("P")) continue;
			
			sum += (cnt*map.get(grade)); // 전공과목별 합 (학점 * 과목평점)
			total += cnt; // 학점의 총합
		}
		double avg = sum/total; // 전공과목별 합 / 학점의 총합
		System.out.printf("%.6f",avg);
	}
}
