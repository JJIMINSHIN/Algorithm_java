package BackJoon.Step2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Boj_1330 {
	public static void main(String args[]) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        
        
        System.out.println(new Boj_1330().getCompare(a, b));

        
    }
    
    public String getCompare(int a, int b) {
        return a>b ? ">" : (a<b) ? "<" : "==";
    }

}
