package BackJoon.Step6;

/*
 * 문제 : 단어 공부
 * Time : 188 ms
 * 단순 구현문제인데 꽤나 오래 생각한 문제
 * 구현문제는 최대한 많이 풀어보고 유형에 익숙해지는 수밖에
 * 시간복잡도가 너무 아쉽다. 더 줄일 수 있는 방법을 한번 찾아보자
 * */
import java.io.*;

public class Boj_1157 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine().toUpperCase();

        int[] arr = new int[26];
        int max = 0;
        char ch = 0;
        
        for(int i=0; i<line.length(); i++){
            arr[line.charAt(i)-'A']++; // arr[0] = 'A', arr[25] = 'Z'
        }
		
        for(int i=0; i<arr.length; i++) {
        	int comp = arr[i] - max;
        	//System.out.println("i = "+i+" arr[i] = "+arr[i]+" max = "+max+" comp = "+comp);
        	if(comp >0) {
        		max = arr[i];
        		ch = (char)(i+'A'); 
        	}else if(comp == 0 ) ch ='?';
        }
        
        System.out.println(ch);
	}

}
