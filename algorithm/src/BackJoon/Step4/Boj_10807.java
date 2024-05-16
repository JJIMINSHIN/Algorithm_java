package BackJoon.Step4;
/*
 * 문제 : 개수 세기
 * Time : 88 ms
 * */

import java.io.*;
import java.util.*;

public class Boj_10807 {
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
