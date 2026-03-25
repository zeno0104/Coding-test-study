class Solution {
    static int[] check;
    static int answer = 0;
    
    public static void DFS(int[] nums, int L, int sum, int start){
        if(L == 3){
            int count = 0;
            for(int i = 1; i <= sum; i++){
                if(sum % i == 0){
                    count++;
                }
            }
            if(count == 2){
                answer++;
            }
            return;
        }
        for(int i = start; i < nums.length; i++){
            if(check[i] == 0){
                check[i] = 1;
                DFS(nums, L + 1, sum + nums[i], i + 1);
                check[i] = 0;
            }
        }
        
    }
    public int solution(int[] nums) {
        check = new int[nums.length];
        DFS(nums, 0, 0, 0);
        
        return answer;
    }
}