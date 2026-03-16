import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        Stack<Character> stack = new Stack<>();
            
        for(char ch : s.toCharArray()){
            if(ch == '('){
                stack.push(ch);
            } else if(ch == ')'){
                if(stack.isEmpty()){
                    return false;
                }
                stack.pop();
            }
        }
        if(stack.isEmpty())
            return true;
        else
            return false;
    }
}