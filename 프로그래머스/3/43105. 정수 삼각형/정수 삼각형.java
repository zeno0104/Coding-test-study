import java.util.*;

class Solution {
    public int solution(int[][] triangle) {
        int answer = 0;
        
        int[][] dp = new int[triangle.length][triangle.length];
        
        dp[0][0] = triangle[0][0];
        for(int i = 1; i < triangle.length; i++){
            for(int j = 0; j <=  i; j++){
                if(j == 0){
                    dp[i][0] = dp[i-1][0] + triangle[i][0];    
                } else if(j == i){
                    dp[i][i] = dp[i-1][i-1] + triangle[i][i];
                } else{
                    dp[i][j] = Math.max(dp[i-1][j-1], dp[i-1][j]) + triangle[i][j];
                }
            }
        }
        int result = Integer.MIN_VALUE;
        for(int i = 0; i < dp.length; i++){
            for(int j = 0; j < dp.length; j++){
                result = Math.max(result, dp[i][j]);
            }
        }
        return result;
    }
}