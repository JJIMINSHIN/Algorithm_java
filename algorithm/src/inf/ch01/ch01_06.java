package inf.ch01;

import java.io.*;
import java.util.*;

/************
 * @name : 중복문자제거
 * @date : 2024/10/14 16:45 PM
 * @time : 127 (ms)
 * @Description :
 * hashSet은 순서를 보장하지 않는 클래스로 LinkedHashSet을 사용해서 순서에 맞게 구현
 * 강의에서는 indexOf를 사용함 133m/s로 LinkedHashSet이 더 빠르게 나타남
 ************/

public class ch01_06 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		LinkedHashSet<String> hs = new LinkedHashSet<String>();
		
		for(char c : str.toCharArray()) {
			hs.add(c+"");
		}
		
		Iterator iter = hs.iterator();
		while(iter.hasNext()) {
			System.out.print(iter.next());
		}
	}
	public String learning(String str){
		String answer="";
		for(int i=0; i<str.length(); i++){
			if(str.indexOf(str.charAt(i))==i) answer+=str.charAt(i);
		}
		return answer;
	}

}

