package programmers;

//flag에 따라 다른 값 반환하기
public class sol_19 {
    public int solution(int a, int b, boolean flag) {
        return flag == true ? a+b : a-b;
    }
}
