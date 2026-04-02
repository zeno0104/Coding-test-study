class Solution {
    static boolean[] check;
    static int answer = 0;
    
    public static void DFS(int[] numbers, int target, boolean[] check, int sum, int L){
        if(L == numbers.length){
            if(sum == target){
               answer++;
            }
            return;
        }
         else{
            if(!check[L]){
                check[L] = true;
                DFS(numbers, target, check, sum + numbers[L], L + 1);
                check[L] = false;
                DFS(numbers, target, check, sum - numbers[L], L + 1);
            }
        }
    }
    
    public int solution(int[] numbers, int target) {
        
        
        check = new boolean[numbers.length];
        
        DFS(numbers, target, check, 0, 0);
        return answer;
    }
}