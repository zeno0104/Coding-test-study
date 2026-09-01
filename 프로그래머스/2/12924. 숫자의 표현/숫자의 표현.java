class Solution {
    public int solution(int n) {
        int answer = 1;
        
        if(n == 1)
            return 1;
        
        
        int[] arr = new int[n];
        
        for(int i = 0; i < arr.length; i++){
            arr[i] = i + 1;
        }
        
        int start = 0;
        int end = 1;
        
        int sum = arr[start] + arr[end];
        while(end  < n - 1){
            if(sum == n){
                // 타겟일 때
                answer++;
                end++;
                sum += arr[end];
           } else if(sum < n){
                // 작을 때
                end++;
                sum += arr[end];
            } else if(sum > n){
                // 클 때
                sum -= arr[start];
                start++;
            }
        }
        return answer;
    }
}