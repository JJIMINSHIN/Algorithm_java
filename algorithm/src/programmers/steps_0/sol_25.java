package programmers.steps_0;

//홀수 vs 짝수

public class sol_25 {

	public static void main(String[] args) {
		int[] arr= {4, 2, 6, 1, 7, 6};
		System.out.println(new sol_25().solution(arr));
	};
    public int solution(int[] num_list) {
        int answer = 0;
        int result = 0;
        for(int i=0; i<num_list.length; i++) {
        	if(i%2 == 0) answer += num_list[i];
        	else result += num_list[i];
        }
        return answer >= result ? answer : result;
    }
}
