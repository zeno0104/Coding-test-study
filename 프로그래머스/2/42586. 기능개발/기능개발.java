import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        
        List<Integer> list = new LinkedList<>();
        
        for(int i = 0; i < progresses.length; i++){
            int progress = progresses[i];
            int speed = speeds[i];
            
            int point = 1;
            
            while(true){
                if(progress + speed * point >= 100){
                    list.add(point);
                    break;
                }
                point++;
            }
        }
        
        int count = 0;
        System.out.println("list : " + list);
        
        List<Integer> answerList = new LinkedList<>();
        
        int check = list.get(0);
        int c = 1;
        
        for(int i = 1; i < list.size(); i++){
            if(check >= list.get(i)){
                c++;
            } else{
                answerList.add(c);
                c = 1;
                check = list.get(i);
            }
        }
        
        answerList.add(c);
        
        System.out.println(answerList);
        
        answer = new int[answerList.size()];
        
        for(int i = 0; i < answer.length; i++){
            answer[i] = answerList.get(i);
        }
        
        return answer;
    }
}