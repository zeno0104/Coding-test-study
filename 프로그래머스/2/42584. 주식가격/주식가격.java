import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        
        
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < prices.length; i++){
            int count = 1;
            for(int j = i + 1; j < prices.length - 1; j++){
                if(prices[i] <= prices[j]){
                    count++;
                } else{
                    break;
                }
            }
            if(i == prices.length - 1){
                answer[i] = 0;
            } else{
                answer[i] = count;
            }
            
        }
        
        for(int num : list){
            System.out.print(num + " ");
        }
        return answer;
    }
}