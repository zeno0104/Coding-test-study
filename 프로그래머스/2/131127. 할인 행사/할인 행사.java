import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        
        for(int i = 0; i <= discount.length - 10; i++){
            Map<String, Integer> map = new HashMap<>();
            
            for(int j = 0; j < want.length; j++){
                map.put(want[j], 0);
            }
            
            for(int j = i; j < i + 10; j++){
                if(map.containsKey(discount[j])){
                    map.put(discount[j], map.get(discount[j]) + 1);
                }    
            }
            
            boolean flag = false;
            
            for(int j = 0; j < number.length; j++){
                if(map.get(want[j]) < number[j]){
                    flag = true;
                } 
            }
            if(flag){
                continue;
            } else{
                answer += 1;
            }
        }
        
        return answer;
    }
}