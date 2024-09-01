package programmers.step0;

/************
 * @name : 이어 붙인 수
 * @date : 2024/9/1 16:20 PM
 * @time :  51 (ms)
 * @Description :
 * 다른 사람 풀이에 좋은게 있어서 chamgo로 넣어둠
 * 홀수가 나올때마다 10씩 곱해주면
 * 0dd = 5
   0dd = 57
   0dd = 573
 * 와 같은 값으로 커지는걸 확인할 수 있었다.!!
 * 시간도 1ms로 빠르게 감
 ************/

public class sol_58 {

	public static void main(String args[]) {
		long startTime = System.currentTimeMillis();

		int[] num = {5,7,8,3};

		System.out.println(new sol_58().solution(num));
		System.out.println(new sol_58().chamgo(num));

		long endTime = System.currentTimeMillis();
		long duTime = endTime - startTime;
		System.out.println("active time = " + duTime + " m/s");
	}

	public int solution(int[] num_list) {
		int answer = 0;
        String tmp1 = "";
        String tmp2 = "";
        for(int i=0; i<num_list.length; i++) {
        	if(num_list[i]%2 ==0 )tmp1 += num_list[i]+"";
        	else tmp2 += num_list[i]+"";
        }
        answer = Integer.parseInt(tmp1)+ Integer.parseInt(tmp2);
        
        return answer;
    }
	
	 public int chamgo(int[] num_list) {
	        int answer = 0;

	        int even = 0;
	        int odd = 0;

	        for(int num : num_list) {
	            if(num % 2 == 0) {
	                even *= 10;
	                even += num;
	            } else {
	                odd *= 10;
	                odd += num;
	            }
	        }
	        answer = even + odd;

	        return answer;
	    }
}
