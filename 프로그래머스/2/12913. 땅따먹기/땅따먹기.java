class Solution {
    int solution(int[][] land) {
        int answer = Integer.MIN_VALUE;
        
        int[][] dp = new int[land.length][land[0].length];
        
        for(int i = 0; i < 1; i++){
            for(int j = 0; j < land[0].length; j++){
                dp[i][j] = land[i][j];
            }
        }
        
        for(int i = 1; i < land.length; i++){
            for(int j = 0; j < land[0].length; j++){
                for(int k = 0; k < land[0].length; k++){
                    
                    if(j == k)
                        continue;
                    if(i == 1){
                        dp[i][k] = Math.max(land[0][j] + land[1][k], dp[i][k]);
                    } else{
                        dp[i][k] = Math.max(dp[i - 1][j] + land[i][k], dp[i][k]);
                    }
                    answer = Math.max(answer, dp[i][k]);
                }
            }
        }
        
        
        return answer;
    }
}