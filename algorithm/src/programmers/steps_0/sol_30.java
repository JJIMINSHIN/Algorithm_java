package programmers.steps_0;
/*
 * 주사위 게임 2
 */

public class sol_30 {
	
	public static void main(String[] args) {
		int outP = new sol_30().solution(2, 6, 1);
		System.out.println(outP);
	};
	
    public int solution(int a, int b, int c) {
        int answer = 0;
        if(a == b && a==c &&  b== c ) {
        	answer += sameNum(a,b,c);
        }
        if((b==c  && a != b && a !=c) || (a==c  && a != b && b !=c) || (a==b  && a != c && b !=c)) {
        	answer += ((a+b+c)*(pow2(a)+pow2(b)+pow2(c)));
        }
        if(a != b && b!= c && a!=c) answer += noSame(a,b,c);
        
        return answer;
    }
    
    public int sameNum(int a, int b, int c) {
    	return ((a + b + c) * (pow2(a)+pow2(b)+pow2(c)) * (pow3(a) + pow3(b) + pow3(c)));
    }
    
    public int noSame(int a, int b, int c) {return a+b+c;}
	
    public int pow2(int a) {
    	return (int)a*a;
    }
    
    public int pow3(int a) { return a*a*a;}
}
