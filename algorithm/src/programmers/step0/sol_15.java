package programmers;
/*
 * 프로그래머스 코딩 기초 트레이닝
 * 대소문자 바꿔서 출력하기 
 */

import java.util.Scanner;

public class sol_15 {
    public static void main(String[] args) {

    	String answer = "";
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String[] a_char = a.split("");

        for(int i =0; i<a_char.length; i++) {
        	if(a_char[i].equals(a_char[i].toLowerCase())) answer += a_char[i].toUpperCase();
        	else answer += a_char[i].toLowerCase();
        }
        
        System.out.println(answer);
    }
}
