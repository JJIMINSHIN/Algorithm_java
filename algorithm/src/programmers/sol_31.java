package programmers;

//간단한 식 계산하기

public class sol_31 {

	public static void main(String[] args) {
		String binomial = "43 + 12";

		System.out.println(new sol_31().solution(binomial));
	};

	public int solution(String binomial) {
		
		String[] lines = binomial.split(" ");
		int result = 0;
        int a = Integer.parseInt(lines[0]);
        int b = Integer.parseInt(lines[2]);
        
        switch(lines[1]) {
        	case "+":
        		return  a+b;
        	case "-" :
        		return  a-b;
        	case "*" : 
        		return  a*b;
        }
        
        return -1;
	}

}