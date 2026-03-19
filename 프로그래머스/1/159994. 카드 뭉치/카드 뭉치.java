class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        
        
        int first = 0;
        int second = 0;
        
        boolean flag = true;
        
        for(int i = 0; i < goal.length; i++){
            
            if(goal[i].equals(cards1[first])){
                if(cards1.length > first + 1)
                    first++;
            } else if(goal[i].equals(cards2[second])){
                if(cards2.length > second + 1)
                    second++;
            } else{
                flag = false;
                break;
            }
        }
        if(flag)
            answer = "Yes";
        else
            answer = "No";
        return answer;
    }
}