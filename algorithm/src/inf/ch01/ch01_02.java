 package inf.ch01;

 /************
  * @name : 대소문자 변환
  * @date : 2024/01/20 
  * @time : 51 (ms)
  * @Description :
  ************/

public class ch01_02 {

	public static void main(String[] args) {
	    String test= new ch01_02().chgStr("sTuDy");
	    System.out.println(test);
	};
	
	// 내코드
	public String chgStr(String c1) {
		String str = "";
		String[] arr = c1.split("");
		for(String x :  arr) {
			if(x.equals(x.toLowerCase())) str += x.toUpperCase();
			else str += x.toLowerCase();
		}
		return str;
	}
	
	// 선생님 코드
	public String solution(String str) {
		String answer = "";
		for(char x: str.toCharArray()) {
			if(Character.isLowerCase(x)) answer += Character.toUpperCase(x);
			else answer += Character.toLowerCase(x);
		}
		return answer;
	}
	
	/* 
	 아스키 코드로 풀어보기 
	 캐릭터는 원래 정수
	 아스키 넘버 대문자 : 65 ~ 90 소문자 : 97 ~ 122 둘의 정수 차이는 32!
	*/
	public String AscSolution(String str) {
		String answer = "";
		for(char x: str.toCharArray()) {
			if(x>= 97 && x<=122) answer+= (char)(x-32); //(char) 안 써주면 숫자로 return
			else answer += (char)(x+32);
		}
		return answer;
	}
}
