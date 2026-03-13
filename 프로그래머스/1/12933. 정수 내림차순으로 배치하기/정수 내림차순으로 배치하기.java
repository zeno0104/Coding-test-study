import java.util.*;

class Solution {
    public long solution(long n) {
       long answer = 0;
        String num = String.valueOf(n);
        
        char[] arr = num.toCharArray();
        Character[] arrs = new Character[arr.length];
        
        for(int i = 0; i < arrs.length; i++){
            arrs[i] = arr[i];
        }
        Arrays.sort(arrs, Collections.reverseOrder());
        
        num = "";
        
        for(int i = 0; i < arr.length; i++){
            num += arrs[i];
        }
        return answer = Long.valueOf(num);
     }
}