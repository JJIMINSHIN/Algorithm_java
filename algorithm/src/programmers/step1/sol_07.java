package programmers.step1;

/************
 * @name : 두 수의 나눗셈
 * @date : 2024/09/08 17:58 PM
 * @time :  0 (ms)
 * @Description :
 * 반올림 round
 * 올림 ceil
 * 내림 floor
 * 까먹지 않기!
 * (sol2, 다른사람 문제풀이 참고) 굳이 double로 형변환하지 않고 분자값에 1000곱해서 진행하면 깔끔.
 ************/

public class sol_07 {

	public static void main(String args[]) {
		long startTime = System.currentTimeMillis();

		int num1 = 7;
		int num2 = 3;
		
		
		System.out.println(new sol_07().solution(num1, num2));
		long endTime = System.currentTimeMillis();
		long duTime = endTime - startTime;
		System.out.println("active time = " + duTime + " m/s");
	}

	public int solution(int num1, int num2) {
		double num = (double)num1/(double)num2;
		return (int) Math.floor(num*1000); 
    }
	
	public int solution2(int num1, int num2) {
        return num1 * 1000 / num2;
	}
}
