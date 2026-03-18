import java.util.*;

class Solution {
    
    public int[] solution(String s) {
        int[] answer;
        
        List<Character> list = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        
        for(int i = 0; i < s.length(); i++){
            if(!list.contains(s.charAt(i))){
                list.add(s.charAt(i));
                result.add(-1);
            } else{
                list.add(s.charAt(i));
                int count = 0;
                
                for(int start = i - 1; start >= 0; start--){
                    if(s.charAt(i) == list.get(start)){
                        result.add(++count); 
                        break;
                    }
                    count++;
                }
            }
        }
        
        answer = new int[result.size()];
        
        for(int i = 0 ; i < answer.length; i++){
            answer[i] = result.get(i);
        }
        
        return answer;
    }
}