package programmers.level1;

/************
 * @info : 최소직사각형
 * @date : 2025/02/20 18:12 PM
 * @time : 0(ms)
 * @Description :
 * 하 이문제는 좀 빡셌다
 * 생각보다 신경쓸게 많았음
 * 틀린부분 
 * 1. 이 배열들은 회전할 수 있다.
 * 2. 처음부터 회전을 시켜 가로의 최대값과 세로의 최대값을 구해 곱해서 최대값을 만드는 문제!
 * 3. 최소 직사각형은 최소 넓이를 구하는게 아니라 모든 명함을 담을 수 있는 즉, 가장 긴 가로 길이와 가장 긴 세로길이를 찾는게임!
	sizes[i][0] = 60  sizes[i][1] = 50
	sizes[i][0] = 30  sizes[i][1] = 70
	sizes[i][0] = 60  sizes[i][1] = 30
	sizes[i][0] = 80  sizes[i][1] = 40	
 * 여기서 가로의 최대값임 19
i	명함 크기	긴 변 (가로)	짧은 변 (세로)	col (최댓값)	row (최댓값)
0	(60,50)		60			50			60			50
1	(30,70)		70			30			70			50
2	(60,30)		60			30			70			50
3	(80,40)		80			40			80			50
 * 
 ************/

public class _20250220_02 {
	public int solution(int[][] sizes) {
		 int row =0, col =0;
	        for(int i=0; i<sizes.length; i++) {
	        	col = Math.max(col, Math.max(sizes[i][0], sizes[i][1]));
	        	row = Math.max(row, Math.min(sizes[i][0], sizes[i][1]));
	        }
	        return col* row;
	}
}
