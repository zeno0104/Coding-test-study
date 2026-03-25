class Solution {
    public int solution(int n) {
        int answer = 0;
        
        boolean[] isCheck = new boolean[n + 1];
        
        isCheck[0] = true;
        isCheck[1] = true;
        
        for(int i = 2; i <= n; i++){
            if(!isCheck[i]){
                for(int j = i * 2; j <= n; j += i){
                    isCheck[j] = true;
                }
            }
        }
        
        for(int i = 2; i <= n; i++){
            if(!isCheck[i])
                answer++;
        }
        return answer;
    }
}