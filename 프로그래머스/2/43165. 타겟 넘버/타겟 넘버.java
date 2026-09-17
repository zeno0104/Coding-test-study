class Solution {
    static int count = 0;
    
    public int solution(int[] numbers, int target) {
        int answer = 0;
        
        DFS(numbers, target, 0, 0);
        
        return count;
    }
    
    public void DFS(int[] numbers, int target, int sum, int depth){
        if(depth == numbers.length){
            if(target == sum){
                count++;
            }
        } else{
            DFS(numbers, target, sum + numbers[depth], depth + 1);
            DFS(numbers, target, sum - numbers[depth], depth + 1);
        }
    }
}