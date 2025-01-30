package programmers.level1;

/************
 * @info : 핸드폰 번호 가리기
 * @date : 2025/01/22 15:10 PM
 * @time : 53(ms)
 * @Description :
 * 처음에 replace를 잘못써써 실패함
 * substring값을 replace 첫번째 인자로 줬는데 생각해보니 한단어씩 바꿔야하는데
 * 이렇게 들어가면 뭉탱이가 "*"들어간다는걸 간과함 ㅎㅎ....
 ************/

public class _20250122_02 {
	public String solution(String phone_number) {
		int len = phone_number.length()-4;
		return "*".repeat(len)+phone_number.substring(len);
    }
}
