package programmers.step0;

/************
 * @name : rny_string
 * @date : 2024/8/04 16:11 PM
 * @time :  0 ||  1 (ms)
 * @Description :
 * replace를 사용할때와 replaceAll을 사용할때 시간차이 발생 확인
 * 많이 차이나는 것은 아니고 1m/s 정도 차이나는데 여러 문자열이 아니라 한문장이면 replace를 쓰는것이 더 효율적
 * replaceAll은 Pattern 인스턴스를 사용하기에 나중에 가비지 컬렉션이 될 수 있음!
 * https://yeonyeon.tistory.com/294 참고
 * 
 ************/

public class sol_39 {

	public static void main(String args[]) {
		long startTime = System.currentTimeMillis();
		
		System.out.println(new sol_39().solution("masterpiece"));
		System.out.println(new sol_39().solution("programmers"));
		System.out.println(new sol_39().solution("jerry"));
		System.out.println(new sol_39().solution("burn"));
		
		
		long endTime = System.currentTimeMillis();
		long duTime = endTime - startTime;
		System.out.println("active time = " + duTime + " m/s");
	}

	public String solution(String rny_string) {
        return rny_string.replace("m", "rn");
    }
}
