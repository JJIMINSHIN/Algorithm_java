package programmers.step0;

/************
 * @name : 접미사인지 확인하기
 * @date : 2024/9/13 18:05 PM
 * @time : 0 (ms)
 * @Description : 
 * 접두사인지 확인하려면 startWith 메서드 사용
 * 접미사 확인하려면 endWith 메서드 사용
 ************/
public class sol_23 {
	public static void main(String[] args) {
		System.out.println(new sol_23().solution("banana", "wxyz"));
	};

    public int solution(String my_string, String is_suffix) {
        return my_string.endsWith(is_suffix) ? 1 :0;
    }
}