package programmers.step0;

import java.io.*;
import java.util.*;

/************
 * @name : 대문자로 바꾸기
 * @date : 2024/8/18 10:10 AM
 * @time : 0 (ms)
 * @Description : 
 ************/

public class sol_44 {

	public static void main(String args[]) throws IOException {
		long startTime = System.currentTimeMillis();

		System.out.println(new sol_44().solution("aaa"));

		long endTime = System.currentTimeMillis();
		long duTime = endTime - startTime;
		System.out.println("active time = " + duTime + " m/s");
	}
	
	public String solution(String myString) {
        return myString.toUpperCase();
    }

	
}
