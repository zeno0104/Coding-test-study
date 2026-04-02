import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        Queue<String> Q = new LinkedList<>();
        
        if(cacheSize == 0)
            return 5 * cities.length;
        for(int i = 0; i < cities.length; i++){
            String city = cities[i].toUpperCase();
            
            if(!Q.contains(city)){
                if(Q.size() == cacheSize){
                    Q.poll();
                    Q.offer(city);
                } else{
                    Q.offer(city);
                }
                answer += 5;
            } else if(Q.contains(city)){
                Q.remove(city);
                Q.add(city);
                answer += 1;
            }
        }
        return answer;
    }
}