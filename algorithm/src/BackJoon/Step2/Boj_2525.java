package BackJoon.Step2;

/*
 * 문제 : 오븐 시계
 * 내가 제일 못하는 유형.. 시간 계산은 다른 복잡한 문제보다도 헷걸려서 항상 한번씩을 틀리게됨
 * 개념 확실하게 잡고 넘어가자
 * 60분이 안넘어가는 경우 
 * 1) 현재 분에 15분 추가해주기
 * 2-1) 자정일 경우 a = 23시로 맞춰주기
 * 2-2) 자정이 아닐경우 현재 시에서 1시간 빼주기
 * 
 * */
import java.io.*;
import java.util.*;

public class Boj_2525 {
	public static void main(String args[]) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    StringTokenizer st = new StringTokenizer(br.readLine());
	    
	    int a = Integer.parseInt(st.nextToken()); 
	    int b = Integer.parseInt(st.nextToken());
	    int c = Integer.parseInt(br.readLine());
	    
	    int h = (b+c)/60; // 시에 추가할 시간 구함
	    int m = (b+c)%60; // 분에 추가분
	    
	    if(b+c>= 60) {
	    	a= a+h; 
	    	b = m;
	    }
	    else if((b+c) == 60) {
	    	b= 0; 
	    	a= a+h;
    	}
	    else if((b+c)<60) 
	    	b= b+c;
	    if(a>23) a = a-24;
	    
	    System.out.println(a+" "+b);
	}

}
