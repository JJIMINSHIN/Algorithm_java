package BackJoon.Step6;

/*
 * 문제 : 크로아티아 알파벳
 * Time : 84 ms
 * arr의 값과 일치하면 *으로 바꿔줌!
 * */	
import java.io.*;
import java.util.*;

public class Boj_2941 {
	 public static void main(String args[]) throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String str = br.readLine();
			
			String arr[] = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};		
			
			for(String li : arr) {
				if(str.contains(li)) {
					str = str.replaceAll(li, "*");
				}
			}
			System.out.println(str.length());
	 }
}
