package BackJoon.Step3;

import java.io.*;
import java.util.StringTokenizer;

public class Boj_10950 {
	public static void main(String args[]) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());


        for(int i=0; i<a; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());    
            System.out.println(b+c);
        }

    }
	

}
