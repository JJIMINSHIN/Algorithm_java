package inf.ch01;


/************
 * @name : 문장 속 단어
 * @date : 2024/01/20 
 * @time : 30 (ms)
 * @Description :
 ************/
public class ch01_03 {
	public static void main(String[] args) {
		String resutl = new inf.ch01.ch01_03().sol("it is time to study");
		String result = new inf.ch01.ch01_03().solution("it is time to study");
		
		//System.out.println(resutl);
		System.out.println(result);
	};
	
	// 내 코드 => 선생님 코드도 동일해서 제외 
	public String sol(String line) {
		String answer = "";
		String[] arr = line.split(" ");
		int m=Integer.MIN_VALUE;
		
		for(String str : arr) {
			System.out.println("### str = "+str);
			int len = str.length();
			if(len > m)  m = len; answer = str;
		}
		return answer;
	}
	
	// substring, indexOf 사용
	public String solution(String str){
		String answer="";
		int m=Integer.MIN_VALUE, pos;
		while((pos=str.indexOf(' '))!=-1){ // ' '없으면 종료
			String tmp=str.substring(0, pos);
			System.out.println("### tmp = "+tmp);
			int len=tmp.length();
			if(len>m){
				m=len;
				answer=tmp;
			}
			str=str.substring(pos+1);
		}
		if(str.length()>m) answer=str;
		return answer;
	}
}
