package BackJoon.Step6;

/*
 * 문제 : 새싹
 * Time : 64 ms
 * 두 케이스 다 64ms 나옴 
 * 단순 출력 문제, 특수문자에 \ 하나 더 추가해주면 되서 \," 앞에 슬래쉬하나 추가해줌
 * 항상 case2처럼 System.out에만 박아 넣었었는데
 * 저렇게 String에 넣어서 해줘도 되는걸 배웠다!
 * */	
import java.io.*;
import java.util.*;

public class Boj_25083 {
	public static void main(String args[]) throws IOException  {
	    System.out.println("case1");   
		String  str =  "         ,r'\"7\n" +
			               "r`-_   ,'  ,/\n" +
			               " \\. \". L_r'\n" +
			               "   `~\\/\n" +
			               "      |\n" +
			               "      |";
	       System.out.println(str);
	       
	       System.out.println("case2");
	       System.out.println("         ,r'\"7");
	       System.out.println("r`-_   ,'  ,/");
	       System.out.println(" \\. \". L_r'");
	       System.out.println("   `~\\/");
	       System.out.println("      |");
	       System.out.println("      |");
	   }
}
