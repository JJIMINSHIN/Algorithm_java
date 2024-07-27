package programmers.step0;
/************
 * @name : 접두사인지 확인하기
 * @date : 2024/01/25 11:33 PM
 * @time :  288 -> 120(ms)
 * @Description :
 * 
 * 
 * ! 첫번쨰 시도 후 시간복잡도 줄이기
 * 출력하는 부분에서 값을 더한 후 System.out.print로 값을 던져 출력하는 방식에서
 * StringBuiler를 사용하여 append 후 한번에 출력하는 방식으로 변경함
 * 절 반이 넘게 줄이기 성공
 ************/

public class 접두사인지확인하기 {
    public static void main(String[] args) {
        String my_string ="banana"; 
        String is_prefix= "";
        System.out.println(solution("",""));    
    }

    public static int solution(String my_string, String is_prefix) {
        int answer = 0; 
        int len = is_prefix.length();
        if(my_string.length()>=len){
            System.out.println(my_string.substring(0, len));
            if(my_string.substring(0, len).equals(is_prefix)) answer =1;
        }
        return answer;
    }
}
