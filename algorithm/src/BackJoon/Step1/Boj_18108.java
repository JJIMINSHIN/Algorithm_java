package BackJoon.Step1;

import java.io.*;
import java.util.StringTokenizer;

public class Boj_18108 {
	public static void main(String args[]) throws IOException {
		
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        
        String ans = stringTokenizer.nextToken();
        int res = Integer.parseInt(ans)-543;
        System.out.println(res);

        bufferedReader.close();
    }

}
