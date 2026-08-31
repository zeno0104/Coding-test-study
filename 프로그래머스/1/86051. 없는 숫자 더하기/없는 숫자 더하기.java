import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        int max = 0;
        
        List<Integer> list = new LinkedList<>();
        for(int i = 0; i < numbers.length; i++){
            max = Math.max(max, numbers[i]);
            list.add(numbers[i]);
        }
        
        for(int i = 0; i <= 9; i++){
            if(!list.contains(i)){
                answer += i;
            }
        }
        return answer;
    }
}