import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        Set<Integer> set = new HashSet<>();
        int n = nums.length / 2;
        
        for(int i = 0; i < nums.length; i++){
            if(set.size() == n){
                break;
            } else{
                answer++;
                set.add(nums[i]);
            }
        }
        
        
        return set.size();
    }
}