import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {};
        
        Set<String> set = new HashSet();
        
        boolean flag = false;
        int nCount = 0;
        
        String before = words[0];
        set.add(words[0]);
        
        int first = 0;
        int second = 0;
        for(int i = 1; i < words.length; i++){
            if(set.contains(words[i]) || before.charAt(before.length() - 1) != words[i].charAt(0)) {
                // 포함되었을 때
                flag = true;
                first = (i % n) + 1;
                second = (i / n) + 1;
                break;
            } else{
                before = words[i];
                set.add(words[i]);
            }
        }
        
        return !flag ? new int[]{0, 0} : new int[]{first, second};
    }
}