//더 크게 합치기

public class sol_10{
    public int solution(int a, int b) {
        int result = Integer.parseInt(Integer.toString(a)+Integer.toString(b));
        int answer = Integer.parseInt(Integer.toString(b)+Integer.toString(a));

        return result > answer ? result : answer ;
    }
    
    public int solution2(int a, int b) {
        return Math.max(Integer.parseInt(a + "" + b), Integer.parseInt(b + "" + a));
    }
}
