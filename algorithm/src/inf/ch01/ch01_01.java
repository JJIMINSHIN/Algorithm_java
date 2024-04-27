package inf.ch01;

public class ch01_01 {

   //내코드
	public int getCnt(String str, String c) {
		int cnt =0;
		str = str.toLowerCase();
		String[] result = str.split("");
		for(String x: result) {
			if(c.equals(x)) cnt++;
		}
		return cnt;
	}
	
	/* 
	 * 강의에서의 최대값 최소값	  
	 */
	
	 public static void main(String[] args) {
		    System.out.println("최대값은 :  "+max4(3,4,5,6));
		    System.out.println("최솟값은 :  "+min3(3,4,5));
		    System.out.println("최소값은 :  "+min4(4,5,6,2));
		    }

		    public static int max4(int a, int b ,int c, int d){
		        int max = a;
		        if(b> max) max = b;
		        if(c > max) max = c;
		        if(d> max) max = d;

		        return max;
		    }

		    public static int min3(int a, int b, int c){
		        int min =a;

		        if(min>b) min =b;
		        if(min>c) min =c;
		        return min;
		    }
		    public static int min4(int a, int b ,int c, int d){
		        int min=a;

		        if(min > b) min = b;
		        if(min> c) min = c;
		        if(min> d) min = d;
		        return min;
		    }
		    
		    
}
