package BackJoon.Step6;

/*
 * 문제 : 크로아티아 알파벳
 * Time : 84 ms
 * arr의 값과 일치하면 *으로 바꿔줌!
 * 1+ 추가) 68 ms 
 * map을 이용한 풀이
 * 기존 map은 순서가 없으므로, linkedMap으로 순서를 잡아줘 dz=와 z=의 혼동 예방!
 * 속도가 훨~~~씬 좋아졋다.!
 * 2+ 추가) 72 ms
 * 정규식으로 문제 해결
 * map을 활용해서 구했을때보다는 조금 높게 나왔지만 속도, 가독성 면에서 개인적으로 가장 좋은 코드라고 생각.
 * */
import java.io.*;
import java.util.*;

public class Boj_2941 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        
        LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
        map.put("c=", "0");
        map.put("c-", "1");
        map.put("dz=", "2");
        map.put("d-", "3");
        map.put("lj", "4");
        map.put("nj", "5");
        map.put("s=", "6");
        map.put("z=", "7");   
        
        // dz=, z= 주의
        for(String key : map.keySet()) {
            str = str.replaceAll(key, map.get(key));
            //System.out.println(str);
        }
        System.out.println(str.length());

	}
	
	public void getRegular() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(br.readLine().replaceAll("c=|c-|dz=|d-|lj|nj|s=|z=", "1").length());
	}
	
	public void getArray() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();

		String arr[] = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };

		for (String li : arr) {
			if (str.contains(li)) {
				str = str.replaceAll(li, "*");
			}
		}
		System.out.println(str.length());	
	}

}
