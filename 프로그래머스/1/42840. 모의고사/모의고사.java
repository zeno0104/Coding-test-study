import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] answer;
        int[] first = {1, 2, 3, 4, 5};
        int[] second = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int firstCheck = 0;
        int secondCheck = 0;
        int threeCheck = 0;
         
        for(int i = 0; i < answers.length; i++){
            
            
            if(answers[i] == first[i % first.length]){
                firstCheck++;
            }
            if(answers[i] == second[i % second.length]){
                secondCheck++;
            }
            if(answers[i] == three[i % three.length]){
                threeCheck++;
            }
        }
        
        
        List<Integer> list = new ArrayList<>();
        
        list.add(firstCheck);
        list.add(secondCheck);
        list.add(threeCheck);
        
        List<Integer> check = new ArrayList<>();
        int max = 0;
        
        if(firstCheck >= secondCheck && firstCheck >= threeCheck){
            max = firstCheck;
        } else if(secondCheck >= firstCheck && secondCheck >= threeCheck){
            max = secondCheck;
        } else{
            max = threeCheck;
        }
        
        for(int i = 0; i < list.size(); i++){
            if(max == list.get(i))
                check.add(i + 1);
        }
        
        answer = new int[check.size()];
        
        for(int i = 0; i < check.size(); i++){
            answer[i] = check.get(i);
        }
        return answer;
    } 
}