package programmers.steps_0;

//간단한 논리 연산

public class sol_38 {
	
	public static void main(String[] args) {
		System.out.println(new sol_38().solution(true, false, false, false));
	};

    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        return (x1 || x2) && (x3||x4);
    }
}
