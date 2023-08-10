package programmers.steps_0;

// A 강조하기

public class sol_09 {
    public String solution(String myString) {
        String answer = myString.toLowerCase();
        return answer.replaceAll("a","A");
    }

}
