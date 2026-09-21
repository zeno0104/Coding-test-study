class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int oneCardLength = cards1.length;
        int twoCardLength = cards2.length;
        
        int first = 0;
        int second = 0;
        
        boolean flag = true;
        
        for(int i = 0; i < goal.length; i++){
            if(!flag)
                break;
            
            if(first < oneCardLength && cards1[first].equals(goal[i])){
                first++;
            } else if(second < twoCardLength && cards2[second].equals(goal[i])){
                second++;
            } else{
                flag = false;
                break;
            }
        }
        
        return flag ? "Yes" : "No";
    }
}