package programmers.step0;

/************
 * @name : 문자열의 앞의 n글자
 * @date : 2024/8/25 17:08 PM
 * @time : 0 (ms)
 * @Description : 
 ************/

public class sol_52 {

	public static void main(String args[]) {
		long startTime = System.currentTimeMillis();

		
		System.out.println(new sol_52().solution("He110W0r1d",5));
		
		long endTime = System.currentTimeMillis();
		long duTime = endTime - startTime;
		System.out.println("active time = " + duTime + " m/s");
	}

	public String solution(String my_string, int n) {
        return my_string.substring(0,n);
    }
	

}
