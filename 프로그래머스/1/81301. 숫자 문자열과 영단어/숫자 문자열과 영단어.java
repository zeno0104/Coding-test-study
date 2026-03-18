import java.util.*;

class Solution {
    public int solution(String s) {
        String answer = "";
        
        Map<String, Integer> map = new HashMap<>();
        map.put("zero", 0);
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        map.put("five", 5);
        map.put("six", 6);
        map.put("seven", 7);
        map.put("eight", 8);
        map.put("nine", 9);

        String value = "";
        
        for(int i = 0; i < s.length(); i++){
            
            
            
            if(Character.isLetter(s.charAt(i))){
                value += s.charAt(i);
                if(map.containsKey(value)){
                    answer += map.get(value);
                    value = "";
                } 
                
            } else if(Character.isDigit(s.charAt(i))){
                answer += s.charAt(i);
            }
        }
        
        return Integer.parseInt(answer);
    }
}