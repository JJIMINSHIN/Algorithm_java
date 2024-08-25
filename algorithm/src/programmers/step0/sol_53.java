package programmers.step0;

/************
 * @name : 문자열의 뒤의 n글자
 * @date : 2024/8/25 17:14 PM
 * @time : 0 (ms)
 * @Description : 
 ************/

public class sol_53 {

	public static void main(String args[]) {
		long startTime = System.currentTimeMillis();

		
		System.out.println(new sol_53().solution("ProgrammerS123",11));
		
		long endTime = System.currentTimeMillis();
		long duTime = endTime - startTime;
		System.out.println("active time = " + duTime + " m/s");
	}

	public String solution(String my_string, int n) {
        return my_string.substring(my_string.length()-n);
    }
	

}
