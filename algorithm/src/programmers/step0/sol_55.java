package programmers.step0;

/************
 * @name : 글자 이어 붙여 문자열 만들기
 * @date : 2023/7/29 14:22 PM
 * @time : 54 ms -> 0 (ms)
 * @Description :
 * 기존 answer += 에서 stringBuffer로 변경
 * 일반 for문에서 강하된 for문으로 변경
 ************/

public class sol_55 {

	public static void main(String args[]) {
		long startTime = System.currentTimeMillis();

		String my_string = "cvsgiorszzzmrpaqpe";
		int[] idx_list= {16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7};
		System.out.println(new sol_55().solution(my_string,idx_list));
		
		long endTime = System.currentTimeMillis();
		long duTime = endTime - startTime;
		System.out.println("active time = " + duTime + " m/s");
	}

	public String solution(String my_string, int[] index_list) {
		StringBuilder sb = new StringBuilder();
        for(int i : index_list) {
        	sb.append(my_string.charAt(i));
        }
        return sb.toString();
    }
	

}
