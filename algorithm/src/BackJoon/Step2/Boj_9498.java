package BackJoon.Step2;

import java.io.*;
import java.util.StringTokenizer;

public class Boj_9498 {
	public static void main(String args[]) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        
        
        if(a >=90) System.out.println("A");
        else if(a >=80) System.out.println("B");
        else if(a >=70) System.out.println("C");
        else if(a >=60) System.out.println("D");
        else System.out.println("F");
        
        
    }

}
