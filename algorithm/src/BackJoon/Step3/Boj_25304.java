package BackJoon.Step3;
/*
 * 문제 : 영수증 
 * Time : 72 ms
 * */

import java.io.*;
import java.util.*;

public class Boj_25304 {
    public static void main(String args[]) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int total = Integer.parseInt(br.readLine());
        int items = Integer.parseInt(br.readLine());
        int sum =0;

        for(int i=0; i<items; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());    
            
            int price = Integer.parseInt(st.nextToken());
            int list =  Integer.parseInt(st.nextToken());
            
            sum += (price*list); 
        }
        
        if(total == sum)
            System.out.println("Yes");
        else 
            System.out.println("No");

    }
}
