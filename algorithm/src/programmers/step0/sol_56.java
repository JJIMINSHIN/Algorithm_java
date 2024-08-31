package programmers.step0;

/************
 * @name : 수 조작하기 1
 * @date : 2023/7/29 14:22 PM
 * @time : 54 ms -> 0 (ms)
 * @Description :
 * 프로그래머스에서 테스트 케이스는 성공해도 다른게 결과가 다 실패해서 멘붕왔다..
 * 바보같은 점이 n의 값은 입력하는 값에 따라 바뀌는건데 이걸 간과함..
 * answer = 0이 아니라 answer =n으로 변경해주니 통과!!
 * 다른 사람 풀이에 toCharArray로 변경해 switch문이랑도 사용하던데 좋은것 같아서 적용해봄
 ************/

public class sol_56 {

	public static void main(String args[]) {
		long startTime = System.currentTimeMillis();

		String str = "wsdawsdassw";
		int n =0;
		System.out.println(new sol_56().solution(n,str));
		
		long endTime = System.currentTimeMillis();
		long duTime = endTime - startTime;
		System.out.println("active time = " + duTime + " m/s");
	}

	public int solution(int n, String str) {
        int answer = n;
        for(int i=0; i<str.length(); i++) {
        	if(str.charAt(i)== 'w') answer += 1;
        	else if(str.charAt(i)== 's') answer -= 1;
        	else if(str.charAt(i)== 'd') answer += 10;
        	else if(str.charAt(i)== 'a') answer -= 10;
        }        
        return answer;
    }
	public int solution2(int n, String str) {
		int answer = n;
		
		for(char ch : str.toCharArray()) {
			switch(ch) {
				case 'w': answer += 1; break;
	            case 's': answer -= 1; break;
	            case 'd': answer += 10; break;
	            case 'a': answer -= 10; break;
	            default:break;
			}
		}
		
		return answer;
	}
	

}
