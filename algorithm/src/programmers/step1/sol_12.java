package programmers.step1;

/************
 * @name : 머쓱이보다 키 큰 사람
 * @date : 2024/09/14 15:42 PM
 * @time : 0 (ms)
 * @Description :
 ************/

public class sol_12 {

	public static void main(String args[]) {
		long startTime = System.currentTimeMillis();

		int[] arr = {1, 2, 3, 4, 5};

		System.out.println(new sol_12().solution(arr));
		long endTime = System.currentTimeMillis();
		long duTime = endTime - startTime;
		System.out.println("active time = " + duTime + " m/s");
	}

	public int[] solution(int[] numbers) {
		for(int i=0; i<numbers.length;i++) numbers[i] *=2;
		return numbers;
    }
}
