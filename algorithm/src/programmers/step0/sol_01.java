package programmers.step0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/************
 * @name : 접두사인지 확인하기
 * @date : 2024/01/25 11:33 PM
 * @time :  715 ||  705 || 1902 (ms)
 * @Description :
 * 
 ************/

public class sol_01 {
	public static void main(String args[]) throws IOException {
		long startTime = System.currentTimeMillis();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		String a = st.nextToken();
		String b = st.nextToken();

		System.out.println(new sol_01().solution2(a, b));
		long endTime = System.currentTimeMillis();
		long duTime = endTime - startTime;
		
		System.out.println("수행 시간 = " + duTime +" m/s");
	}

	public int solution(String my_string, String is_prefix) {
		if (my_string.startsWith(is_prefix))
			return 1;
		else
			return 0;
	}
	
	public int solution1(String my_string, String is_prefix) {
		int res = my_string.indexOf(is_prefix);
		System.out.println(res);
		return res == 0? 1 : 0;
	}
    
    public static int solution2(String my_string, String is_prefix) {
        int answer = 0; 
        int len = is_prefix.length();
        if(my_string.length()>=len){
            //System.out.println(my_string.substring(0, len));
            if(my_string.substring(0, len).equals(is_prefix)) answer =1;
        }
        return answer;
    }
}
