import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        
        Queue<String> queue = new ArrayDeque<>();
        
        for(int i = 0; i < cities.length; i++){
            // System.out.println("queue : " + queue + ", cities : " + cities[i]);
            String city = cities[i].toLowerCase();
            if(cacheSize == 0){
                answer += 5;
            }
            else if(queue.isEmpty()){
                queue.offer(cities[i].toLowerCase());
                answer += 5;
            } else if(queue.contains(city)){
                answer += 1;
                queue.remove(city);
                queue.offer(city);
            } else if(queue.size() == cacheSize){
                queue.poll();
                queue.offer(city);
                answer += 5;
            } else{
                queue.offer(city);
                answer += 5;
            }
        }
        return answer;
    }
}