package programmers.level1;

import java.util.Scanner;

/************
 * @info : 직사각형 별찍기
 * @date : 2025/01/29 22:00 PM
 * @time : 0(ms)
 * @Description :
 * 댓글보니깐 repeat으로 푸는것보다 stream으로 푸는게 더 오래걸린다고 했지만 막상 돌려보니 별 속도 차이는 없었다
 * 1000 이하는 그냥 더 간결하고 편한거 쓰는걸로
 * 그래도 참고는 해두자!
	StringBuilder sb = new StringBuilder();
	IntStream.range(0, a).forEach(s -> sb.append("*"));
	IntStream.range(0, b).forEach(s -> System.out.println(sb.toString()));
 * 
 ************/

public class _20250129_02 {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int i=1; i<=b; i++) {
        	System.out.println("*".repeat(a));
        }   
    }

}
