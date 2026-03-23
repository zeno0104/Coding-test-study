import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {};
        // 몇번째 사람이
        // 몇번째에 떨어지냐
        
        Stack<String> stack = new Stack();
        boolean flag = false;
        
        int first = 0;
        int second = 0;
        
        for(int i = 0; i < words.length; i++){
            if(stack.isEmpty()){
                stack.add(words[i]);
            } else{
                String curr = stack.peek();
                char lastWord = curr.charAt(curr.length() - 1); 
                
                if(stack.contains(words[i]) || lastWord != words[i].charAt(0)){
                    // 마지막 글자와 다를 때
                    flag = true;
                    first = (i % n) + 1;
                    second = (i / n) + 1;
                    break;
                } 
                else{
                    stack.add(words[i]);
                } 
            }
        }
       
        
        if(flag){
            return new int[]{first, second};
        } 
        return new int[]{0, 0};
    }
}