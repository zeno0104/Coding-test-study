import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        
        List<Character> list = new ArrayList<>();
        
        for(int i = 0; i < s.length(); i++){
            list.add(s.charAt(i));
        }
        
        for(int i = 0; i < list.size(); i++){
            List<Character> check = new ArrayList<>();
            
            for(int j = 0; j < list.size(); j++){
                
                if(check.isEmpty()){
                    check.add(list.get(j));
                }
                else if(list.get(j) == '[' || list.get(j) == '(' || list.get(j) == '{'){
                    check.add(list.get(j));
                } else{
                    if(list.get(j) == ']' && check.get(check.size() - 1) == '['
                      || list.get(j) == ')' && check.get(check.size() - 1) == '('
                      || list.get(j) == '}' && check.get(check.size() - 1) == '{'){
                        check.remove(check.size() - 1);
                    } else{
                        check.add(list.get(j));
                    }
                }
            }
            System.out.println("");
            if(check.isEmpty()){
                answer++;
            }
            char ch = list.get(0);
            list.remove(0);
            list.add(ch);
        }
        return answer;
    }
}