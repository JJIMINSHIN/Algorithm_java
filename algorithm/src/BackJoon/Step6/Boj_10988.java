package BackJoon.Step6;

/*
 * 문제 : 팰린드롬인지 확인하기
 * Time : 68 ms
 * */	
import java.io.*;
import java.util.*;

public class Boj_10988 {
	 public static void main(String args[]) throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	       String line = br.readLine();
	       
	       StringBuffer sb = new StringBuffer(line);
	       if(line.equals(sb.reverse().toString())) 
	             System.out.println("1"); 
	       else System.out.println("0");;
	    }
}
