import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;

        String result = String.valueOf(n);
        
        for(int i = 0; i < result.length(); i++){
            char c = result.charAt(i);
            
            answer += Character.getNumericValue(c);
        }

        return answer;
    }
}