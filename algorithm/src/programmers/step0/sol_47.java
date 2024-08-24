package programmers.step0;


/************
 * @name : n개 간격의 원소들
 * @date : 2024/8/24 16:23 PM
 * @time : 0 (ms)
 * @Description : 
 * 생각보다 오려 걸린 문제 처음 채점에서 35점 나와버렸다
 * 나눠떨어지는 값이면 그냥 몫만 구해주면 되지만 
 * 아닐 경우 +1해줘야 배열의 크기가 맞게 나옴.
 * 
 ************/

public class sol_47 {

	public static void main(String args[]) {
		long startTime = System.currentTimeMillis();

		int[] arr = { 4, 2, 6, 1, 7, 6 };
		System.out.println(new sol_47().solution(arr, 5));

		long endTime = System.currentTimeMillis();
		long duTime = endTime - startTime;
		System.out.println("active time = " + duTime + " m/s");
	}

	public int[] solution(int[] num_list, int n) {
		int len = num_list.length;
		if(len%n ==0) len = (len/n); 
		else len = (len/n)+1;
		int[] answer = new int[len];
		for (int i = 0; i < len; i++) {
			answer[i] = num_list[i*n];
		}
		
		return answer;
	}

}
