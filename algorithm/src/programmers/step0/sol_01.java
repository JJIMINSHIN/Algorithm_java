package programmers.step0;

public class sol_01 {
    //접두사인지 확인하기

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
