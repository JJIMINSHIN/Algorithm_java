package BackJoon.Step2;

import java.io.*;
import java.util.*;

public class Boj_14681 {
    public static void main(String args[]) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        
        if(a>0 && b >0) System.out.println("1");
        else if(a<0 && b >0) System.out.println("2");
        else if(a<0 && b <0) System.out.println("3");
        else if(a>0 && b <0) System.out.println("4");
    }

}
