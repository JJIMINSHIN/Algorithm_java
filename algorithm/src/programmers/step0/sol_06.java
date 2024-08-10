package programmers.step0;

/************
 * @name : 특정한 문자를 대문자로 바꾸기
 * @date : 2024/8/10 17:18 PM  
 * @time :  0 (ms)
 * @Description :
 * 한문장이라 replaceAll -> replace로 변경
 * 
 ************/

public class sol_06 {
	
	public static void main(String[] args) {
		new sol_06().solution("programmers", "p");
	};
	
	public String solution(String my_string, String alp) {
        return my_string.replaceAll(alp, alp.toUpperCase());
    }

}
