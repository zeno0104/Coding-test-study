class Solution {
    public String solution(int[] food) {
        String answer = "";
        
        int start = 1;
        
        for(int i = 1; i < food.length; i++){
            
            if(food[i] == 1){
                start++;
                continue;
            }
            
            int eat = food[i] / 2;
            System.out.println("eat : " + eat);
            
            for(int j = 0; j < eat; j++){
                answer += String.valueOf(start);
            }

            start++;
        }
        
        answer += "0";
        
        String newAnswer = "";
        
        for(int i = answer.length() - 2; i >= 0; i--){
            newAnswer += answer.charAt(i);
        }
        answer += newAnswer;
        
        System.out.println("answer : " + answer);
        
        
        return answer;
    }
}