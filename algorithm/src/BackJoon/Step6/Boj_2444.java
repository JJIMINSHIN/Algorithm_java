package BackJoon.Step6;

/*
 * 문제 : 별 찍기 - 7
 * Time : 276 ms
 * */	
import java.io.*;
import java.util.*;

public class Boj_2444 {
	 public static void main(String args[]) throws IOException {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        int n = Integer.parseInt(br.readLine());
	        
	        new Boj_2444().getTri(n);
	        new Boj_2444().reverTri(n);

	    }
	    public void getTri(int n) {

	        for (int i = 1; i <= n - 1; i++) {
	            for (int j = 1; j <= n - i; j++) {
	                System.out.print(" ");
	            }
	            for (int j = 1; j <= 2 * i - 1; j++) {
	                System.out.print("*");
	            }

	            System.out.println();
	        }
	    }

	    public void reverTri(int n) {
	        for (int i = n; i >= 1; i--) {
	            for (int j = 1; j <= n - i; j++) {
	                System.out.print(" ");
	            }

	            for (int j = 1; j <= 2 * i - 1; j++) {
	                System.out.print("*");
	            }

	            System.out.println();
	        }
	    }
}
