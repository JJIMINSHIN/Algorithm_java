package programmers.step0;

//공배수
public class sol_22 {
	public static void main(String[] args) {
		System.out.println(new sol_22().solution(55, 10, 5));
	};
    public int solution(int number, int n, int m) {
        return number % n ==0 && number % m ==0 ? 1 : 0;
    }
}
