package programmers.step0;

//접미사인지 확인하기
public class sol_23 {
	public static void main(String[] args) {
		System.out.println(new sol_23().solution("banana", "wxyz"));
	};

    public int solution(String my_string, String is_suffix) {
        return my_string.endsWith(is_suffix) ? 1 :0;
    }
}