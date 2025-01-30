package programmers.level1;

/************
 * @info : 제일 작은 수 제거하기
 * @date : 2025/01/22 14:50 PM
 * @time : 1(ms)
 * @Description :
 * 최소값을 구하고 그 값으로 idx와 함쳐서 배열에 다시 넣어주는 방법으로 진행!
 * 시간복잡도는 O(n)나옴
 ************/

public class _20250122_01 {
	public int[] solution(int[] arr) {
		int len = arr.length;
        if(len == 1) return new int[] {-1};
        
    	int tmp =arr[0];
        
        for(int n : arr) {
        	if(tmp > n) tmp =n;
        }
        
        int[] ans = new int[len-1];
        int idx =0;
        for(int n : arr) {
        	if(n == tmp) continue;
        	ans[idx++] = n;
        }
        
        return ans;
    }
}
