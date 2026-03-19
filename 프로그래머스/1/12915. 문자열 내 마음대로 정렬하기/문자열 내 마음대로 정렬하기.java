import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = {};
        
        Arrays.sort(strings, (a, b)->{
            if(a.charAt(n) == b.charAt(n)){
                // 같으면 사전순 정렬
                return a.compareTo(b);
            }
            return a.charAt(n) - b.charAt(n);
        });
        return strings;
    }
}