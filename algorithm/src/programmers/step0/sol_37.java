package programmers;

//커피 심부름

public class sol_37 {
	
	public static void main(String[] args) {
		String order[] = {"cafelatte", "americanoice", "hotcafelatte", "anything"};
		System.out.println(new sol_37().solution(order));
	};
	
    public int solution(String[] order) {
        int answer = 0;
        for(String x : order) {
        	if(x.contains("latte")) answer += 5000;
        	else answer += 4500;
        }
        return answer;
    }

}
