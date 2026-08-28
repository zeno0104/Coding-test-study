import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        
        int[] num1 = {1, 2, 3, 4, 5};
        int[] num2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] num3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int num1Count = 0;
        int num2Count = 0;
        int num3Count = 0;
        
        for(int i = 0; i < answers.length; i++){
            if(answers[i] == num1[i % num1.length]){
                num1Count++;
            } 
            if(answers[i] == num2[i % num2.length]){
                num2Count++;
            }
            if(answers[i] == num3[i % num3.length]){
                num3Count++;
            }
        }
        
        int max = Math.max(num1Count, Math.max(num2Count, num3Count));
        List<Integer> list = new LinkedList<>();
        
        if(max == num1Count)
            list.add(1);
        if(max == num2Count)
            list.add(2);
        if(max == num3Count)
            list.add(3);
        
        answer = new int[list.size()];
        
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        
        
        return answer;
    }
}