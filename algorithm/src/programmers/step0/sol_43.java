package programmers.step0;

import java.io.*;
import java.util.*;

/************
 * @name : 소문자로 바꾸기
 * @date : 2024/8/18 10:09 AM
 * @time : 0 (ms)
 * @Description : 
 ************/

public class sol_43 {

	public static void main(String args[]) throws IOException {
		long startTime = System.currentTimeMillis();

		System.out.println(new sol_43().solution("aaa"));

		long endTime = System.currentTimeMillis();
		long duTime = endTime - startTime;
		System.out.println("active time = " + duTime + " m/s");
	}
	
	public String solution(String myString) {
        return myString.toLowerCase();
    }

	
}
