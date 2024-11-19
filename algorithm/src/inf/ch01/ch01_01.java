package inf.ch01;

/************
 * @name : 문자 찾기
 * @date : 2024/01/20
 * @time : 1 (ms)
 * @Description :
 ************/


public class ch01_01 {
	
	public static void main(String[] args) {
		int an = new ch01_01().getCnt("Computercooler", "c");
		System.out.println(an);
	}

	public int getCnt(String str, String c) {
		int cnt = 0;
		str = str.toLowerCase();
		String[] result = str.split("");
		for (String x : result) {
			if (c.equals(x))
				cnt++;
		}
		return cnt;
	}
//*************** 강의 ******************///
	public int max4(int a, int b, int c, int d) {
		int max = a;
		if (b > max)
			max = b;
		if (c > max)
			max = c;
		if (d > max)
			max = d;

		return max;
	}

	public int min3(int a, int b, int c) {
		int min = a;

		if (min > b)
			min = b;
		if (min > c)
			min = c;
		return min;
	}

	public int min4(int a, int b, int c, int d) {
		int min = a;

		if (min > b)
			min = b;
		if (min > c)
			min = c;
		if (min > d)
			min = d;
		return min;
	}
}
