import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = {};
        
        List<Integer> list = new LinkedList();
        List<Integer> answerList = new LinkedList();
        
        for(int i = 0; i < score.length; i++){
            if(list.size() == k){
                Collections.sort(list);
                
                if(list.get(0) > score[i]){
                    
                } else if(list.get(0) < score[i]){
                    list.add(score[i]);
                    Collections.sort(list);
                    
                    list.remove(0);
                }
            } else{
                list.add(score[i]);
                Collections.sort(list);
                
            }
            
            answerList.add(list.get(0));
                
        }
        answer = new int[answerList.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = answerList.get(i);
        }
        return answer;
    }
}