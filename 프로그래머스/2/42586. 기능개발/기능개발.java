import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer;
        
        // 7 3 9 
        // 2 1 
            
        // 5 10 1 1 20 1
        // 1 3 2
        int[] check = new int[progresses.length];
        for(int i = 0; i < progresses.length; i++){
            int sum = progresses[i];
            int count = 0;
            
            while(sum < 100){
                count++;
                sum += speeds[i];
            }
            check[i] = count;
        }
        
        List<Integer> list = new ArrayList<>();
        int i = 0;
        while(i < check.length){
            int j = i + 1;
            int count = 1;
            while(j < check.length && check[j] <= check[i]){
                count++;
                j++;
            }
            list.add(count);
            i = j;
        }
        
        answer = new int[list.size()];
        
        for(int j = 0; j < answer.length; j++){
            answer[j] = list.get(j);
        }
        return answer;
    }
}