package programmers.step0;

/************
 * @name : 부분 문자열 이어 붙여 문자열 만들기
 * @date : 2024/8/28 19:30 PM
 * @time : 43ms -> 0 (ms)
 * @Description :
 * 기존 answer += 에서 stringBuffer로 바꾸니 시간 엄청 단축됨! 
 ************/

public class sol_54 {

	public static void main(String args[]) {
		long startTime = System.currentTimeMillis();

		String[] arr = {"progressive", "hamburger", "hammer", "ahocorasick"};
		int[][] parts= {{0, 4}, {1, 2}, {3, 5}, {7, 7}};
		System.out.println(new sol_54().solution(arr,parts));
		
		long endTime = System.currentTimeMillis();
		long duTime = endTime - startTime;
		System.out.println("active time = " + duTime + " m/s");
	}

	public String solution(String[] my_strings, int[][] parts) {
		StringBuilder sb = new StringBuilder();
		
        for(int i=0; i<parts.length; i++) {
        	sb.append(my_strings[i].substring(parts[i][0],parts[i][1]+1));
        }
        return sb.toString();
    }
	

}
