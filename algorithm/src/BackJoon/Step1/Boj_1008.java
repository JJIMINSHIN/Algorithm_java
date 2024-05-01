package BackJoon.Step1;

/*
 * 사칙연산 A/B
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_1008 {
	public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        
        double a = (double)Integer.parseInt(stringTokenizer.nextToken());
        double b = (double)Integer.parseInt(stringTokenizer.nextToken());
        
        System.out.println(a / b);
        bufferedReader.close();
    }
}
