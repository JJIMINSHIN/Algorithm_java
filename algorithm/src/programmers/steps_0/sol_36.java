package programmers.steps_0;

public class sol_36 {
	
	public static void main(String[] args) {
		String result = new sol_36().solution(13);
		System.out.println(result);
	};
	
    public String solution(int age) {
        String answer = "";
        String[] arr = (age+"").split("");
        for(String s : arr) {
        	switch(s){
	            case "0" :
	                answer += "a";
	                break;
	            case "1" :
	                answer += "b";
	                break;
	            case "2" :
	                answer += "c";
	                break;
	            case "3" :
	                answer += "d";
	                break;
	            case "4" :
	                answer += "e";
	                break;
	            case "5" :
	                answer += "f";
	                break;
	            case "6" :
	                answer += "g";
	                break;
	            case "7" :
	                answer += "h";
	                break;
	            case "8" :
	                answer += "i";
	                break;
	            case "9" :
	                answer += "j";
		               break;
	        }
        }
        return answer;
    }

}
