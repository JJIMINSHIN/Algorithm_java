package BackJoon.Step1;

import java.io.*;
import java.util.StringTokenizer;


public class Boj_10869 {
	
	public static void Boj_10869(String args[]) throws IOException {
		
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        
        int a = Integer.parseInt(stringTokenizer.nextToken());
        int b = Integer.parseInt(stringTokenizer.nextToken());
        
        System.out.println(new Boj_10869().getPlus(a,b));
        System.out.println(new Boj_10869().getMinor(a,b));
        System.out.println(new Boj_10869().getGob(a,b));
        System.out.println(new Boj_10869().getMok(a,b));
        System.out.println(new Boj_10869().getNa(a,b));
        bufferedReader.close();
    }
    
    public int getPlus(int a, int b) {
        return a+b;
    }
    
    public int getMinor(int a, int b) {
        return a-b;
    }
    
    public int getGob(int a, int b) {
        return a*b;
    }
    
    public int getMok(int a, int b) {
        return a/b;
    }
    
    public int getNa(int a, int b) {
        return a%b;
    }

}
