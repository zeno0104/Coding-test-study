import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        
        for(int i = 0; i < sizes.length; i++){
            if(sizes[i][0] < sizes[i][1]){
                int tmp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = tmp;
            }
        }
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        
        for(int i = 0; i < sizes.length; i++){
            if(sizes[i][0] > first){
                first = sizes[i][0];
            }
            if(sizes[i][1] > second){
                second = sizes[i][1];
            }
        }
        
        answer = first * second;
        
        return answer;
    }
}