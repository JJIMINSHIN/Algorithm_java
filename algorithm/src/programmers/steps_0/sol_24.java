package programmers.steps_0;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

//카운트 업

public class sol_24 {
	
	public static void main(String[] args) {
		System.out.println(new sol_24().solution(3, 10));
		System.out.println(new sol_24().solution2(3, 10));

	};
	
    public List<Integer> solution(int start_num, int end_num) {
    	List<Integer> answer = new ArrayList<Integer>();
        for(int i=start_num; i<=end_num; i++) answer.add(i);
        return answer;
    }
    
    /*
     * IntStream은 지정한 숫자들 사이의 모든 숫자를 방출.
     * 너무 자주 사용시 가독성이 떨어짐.
    */
    public int[] solution2(int start , int end) {
    	return IntStream.rangeClosed(start, end).toArray();
    }

}
