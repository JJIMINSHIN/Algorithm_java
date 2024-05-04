package BackJoon.Step2;

import java.io.*;
import java.util.*;

public class Boj_2753 {
	 public static void main(String args[]) throws IOException {
	        
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        StringTokenizer st = new StringTokenizer(br.readLine());
	        int a = Integer.parseInt(st.nextToken());
	        
	        
	       if(a%4 ==0 && (a %100 !=0  || a%400 == 0)) System.out.println("1");
	       else System.out.println("0");
	        
	        
	    }

}
