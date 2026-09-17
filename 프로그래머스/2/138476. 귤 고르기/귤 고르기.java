import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        
        Map<Integer, Integer> map = new HashMap();
        
        for(int i = 0; i < tangerine.length; i++){
            if(!map.containsKey(tangerine[i])){
                map.put(tangerine[i], 1);
            } else{         
               map.put(tangerine[i], map.get(tangerine[i]) + 1);   
            }
        }
        
        List<Integer> list = new ArrayList<>(map.values());
        
        Collections.sort(list, Collections.reverseOrder());
        
        for(int num : list){
            if(k <= 0)
                break;
            k -= num;
            answer++;
        }
        
        return answer;
    }
}