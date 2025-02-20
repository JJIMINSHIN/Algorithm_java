package programmers.level1;

/************
 * @info : 행렬의 덧셈
 * @date : 2025/01/29 21:50 PM
 * @time : 0(ms)
 * @Description :
 * 행렬은 잘 안풀다 보니 항상 헷갈린다. 
arr.length =3, arr
int[][] arr = {
    {1, 2, 3, 4},  // arr[0].length = 4
    {4, 5, 6},  // arr[1] = 3
    {7, 8, 9}   // arr[2] = 3
};
 * 
 ************/

public class _20250129_01 {
	
	public int[][] solution(int[][] arr1, int[][] arr2) {
		int len = arr1.length;
		int col = arr1[0].length;
		int[][] answer = new int[len][col];
        for(int i=0; i<len;i++) {
	        	for(int j=0; j<col; j++) {
	        		answer[i][j] += (arr1[i][j]+arr2[i][j]);
            }
        }
        return answer;
    }

}
