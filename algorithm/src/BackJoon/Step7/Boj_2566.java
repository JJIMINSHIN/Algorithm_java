package BackJoon.Step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/************
 * @info : 최댓값
 * @date : 2024/08/20 11:10 AM
 * @time :  64(ms)
 * @Description :
 * 사실 문제만 보고 겁먹었던 문제
 * 하지만 풀고보니 별거 아니였다~
 * 열은 1~9까지 돌고 행이 바뀌면 열도 1로 초기화해줘야함
 * (주의) 같을때는 둘 중 하나만 나와야함으로 로직에 추가해 줘야함! 처음에 이거 추가 안해줘서 틀렸음.
 ************/
public class Boj_2566 {
	 public static void main(String args[]) throws IOException {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        StringTokenizer st = null;
	        
	        int row =0;
	        int col =0;
	        int max =0;
	        int tmp=0;
	        String res = null;
	        
	        for(int i=1; i<=9; i++) {
	            row++;
	            col =0;
	            st = new StringTokenizer(br.readLine());
	            for(int j=1; j<=9; j++) {
	                col++;
	                tmp = Integer.parseInt(st.nextToken());
	                if(max<tmp) {
	                    max = tmp;
	                    res = (row+" "+col);
	                }else if(max == tmp) {
	                    res = (row+" "+col);
	                }
	                
	            }
	            //System.out.println(row+" "+col);
	        }
	        
	        System.out.println(max);
	        System.out.println(res);
	        
	    }
}
