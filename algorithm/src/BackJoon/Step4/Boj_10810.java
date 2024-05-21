package BackJoon.Step4;
/*
 * 문제 : 공 넣기
 * Time : 80 ms
 * 문제 자체가 이해가 안가서 조금 해맸던 문제 - 블로그 참조
 * */

import java.io.*;
import java.util.*;

public class Boj_10810 {
	public static void main(String args[]) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int num = Integer.parseInt(br.readLine());
        ArrayList<String> el = new ArrayList<String>(); 
        String str = br.readLine();
        String idx = br.readLine();
  
        int cnt = 0;
        
        for(int i=0; i<num; i++) {
            el.add(str.split(" ")[i]);
            if(el.get(i).equals(idx)) cnt++;
        }
            
        System.out.println(cnt);
        br.close();
    }
}
