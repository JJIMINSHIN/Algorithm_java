package programmers.level1;

/************
 * @info : 서울에서 김서방 찾기
 * @date : 2025/01/17 15:50 PM
 * @time : 0(ms)
 * @Description :
 * 문제 자체는 어려운게 없었는데 테스트 3에서 넘어가질 않았다 
 * 도대체 왜..? 
 * 찾아보니깐 num이 1을 만드는 과정에서 int의 범위(최대 2,147,483,647)를 벗어나서 나타나는 현상 
 * 디버깅해보니 int형일때 179번째에서 오버플로우가 발생해 범위에 맞게 저장하려고 값이 뒤틀린다. 재밌다..
 * long : cnt = 179, num = 3130607392
 * int :  cnt = 179, num = 133910008
 ************/

public class _20250117_03 {
	public int solution(long num) {
        int cnt=0;
        
        while(num !=1) {
        	if(cnt >=500) return -1;
        	if(num%2 ==0) {
        		num /= 2;
        	}else {
        		num = (num*3) +1;
        	}
        	cnt++;
        }
        return cnt;
    }
}
