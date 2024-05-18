package BackJoon.Step4;
/*
 * 문제 : X보다 작은 수
 * Time : 104 ms
 * 방법1) main
 * 기존 타임아웃(timeOut) => split하는 과정에서 시간 초과되었던것으로 판단
 * split으로 가져오기보다는 StringToken 사용해서 다음 글자 가져옴
 * 
 * 방법2) useStringBuilder() 
 * StringBuilder 사용해 시간 차이 비교
 * 104ms로 
 * 기존 list에 공백 추가해 던지는것보다 빌더에 차례로 값+공백 던지니 더 빠르게 처리 가능해짐, stringbuilder로 최적화하는 방법 찾아보자!
 * el.add(comp+" ") => sb.append(comp).append(" ");
 * */

import java.io.*;
import java.util.*;

public class Boj_10871 {
	public static void main(String args[]) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int size = Integer.parseInt(st.nextToken());
        int num = Integer.parseInt(st.nextToken());

        ArrayList<String> el = new ArrayList<String>(); 
        st = new StringTokenizer(br.readLine()); //1 10 4 9 2 3 8 5 7 6 받아오기
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<size; i++) {
            int comp = Integer.parseInt(st.nextToken());
            if(comp<num) sb.append(comp).append(" ");
            
        }
        
        System.out.println(sb);
        
        br.close();
    }
	
	public void noUseStringBuilfer()throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int size = Integer.parseInt(st.nextToken());
        int num = Integer.parseInt(st.nextToken());

        ArrayList<String> el = new ArrayList<String>(); 
        st = new StringTokenizer(br.readLine()); //1 10 4 9 2 3 8 5 7 6 받아오기

        for(int i=0; i<size; i++) {
            int comp = Integer.parseInt(st.nextToken());
            if(comp<num) el.add(comp+" ");
            
        }
        
        for(String x : el) {
            System.out.print(x);
        }
        
            
        br.close();
	}
	
	public void timeOut() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String ipt = br.readLine();
        int size = Integer.parseInt(ipt.split(" ")[0]);
        int num = Integer.parseInt(ipt.split(" ")[1]);

        String str = br.readLine();
        String s = "";
        
        for(int i=0; i<size; i++) {
            int comp = Integer.parseInt(str.split(" ")[i]);
            if(comp<num) s += comp+" ";
        }
        
        System.out.println(s);
            
        br.close();
	}
}
