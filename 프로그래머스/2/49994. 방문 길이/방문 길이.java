import java.util.*;

class Solution {
    public int solution(String dirs) {
        int answer = 0;
        Set<String> set = new HashSet();
        int x = 0;
        int y = 0;
        
        for(int i = 0; i < dirs.length(); i++){
            int nx = x;
            int ny = y;
            
            if(dirs.charAt(i) == 'L'){
                ny -= 1;
            } else if(dirs.charAt(i) == 'R'){
                ny += 1;
            } else if(dirs.charAt(i) == 'U'){
                nx -= 1;
            } else{
                nx += 1;
            }
            
            if(nx < -5 || nx > 5 || ny < -5 || ny > 5)
                continue;
            
            String path = x + " " + y + " " + nx + " " + ny;
            String reversePath = nx + " " + ny + " " + x + " " + y;
            
            if(!set.contains(path)){
                set.add(path);
                set.add(reversePath);
                answer++;
            }
            
            x = nx;
            y = ny;
        }
        
        return answer;
    }
}