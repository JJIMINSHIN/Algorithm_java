package programmers.level1;

/************
 * @info : 자연수 뒤집어 배열로 만들기
 * @date : 2025/01/16 16:14 PM
 * @time : 23(ms)
 * @Description :
 * Math클래스의 메서드를 사용해서 풀이!
 * sqrt : 제곱근을 구함 => 이게 제곱근인가를 판명해줌
 * pow : 제곱을 해줌 => double형이기 때문에 캐스팅해줘야함
 * Math.sqrt(144) : 12 반환
 * MAth.sqrt)145) : 12.0xxxxxx 반환
 * Math.pow(12,2) : 144, Math.pow(3,3) : 27
 ************/

public class _20250116_02 {
	public long solution(long n) {
        double s = Math.sqrt(n);
        if(n%s ==0) 
        	return (long)Math.pow(s+1, 2);
        else
        	return -1;
        
    }
}
