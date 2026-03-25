import java.util.*;

class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        
        List<Integer> total = new ArrayList<>();
        
        for(int i = 1; i <= number; i++){
            int count = 0;
            
            for (int j = 1; j * j <= i; j++) {
                if (i % j == 0) {
                    count++;         // j 카운트
                    if (j != i / j)  // 완전제곱수가 아니면
                        count++;     // i/j 도 카운트
                }
            }
            if(count > limit){
                answer += power;
            }
            else{
                answer += count;
            }
        }
        
        return answer;
    }
}