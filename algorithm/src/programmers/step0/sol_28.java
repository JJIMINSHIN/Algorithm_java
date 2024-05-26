package programmers.step0;
/*
 *  System.arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
 *  src : 복사하고자 하는 원본 배열
 *  srcPos : 원본 배열에서의 복사 시작할 인덱스
 *  dest : 복사한 원소를 저장할 대상 배열
 *  destPos : 대상 배열에서의 복사 대상 원소의 저장 시작 위치
 *  length : 복사할 원소의 개수 
 */

//순서 바꾸기

public class sol_28 {
	public static void main(String[] args) {
		int[] arr =  {2, 1, 6};
		System.out.println(new sol_28().solution(arr, 1));
	}

	
    public int[] solution(int[] num_list, int n) {
    	 int[] answer = new int[num_list.length];
         int len = num_list.length;
         System.arraycopy(num_list, n, answer, 0, len-n);
    	 System.arraycopy(num_list, 0, answer, len-n, n);
    	 
         for(int i=0; i<num_list.length; i++) System.out.println(answer[i]);
         return answer;
    }

}
