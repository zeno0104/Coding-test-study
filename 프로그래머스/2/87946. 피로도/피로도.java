import java.util.*;

class Solution {
    static int[] check;
    static int answer;
    public static void DFS(int k, int[][] dungeons, int count){
        answer = Math.max(answer, count);
        
        for(int i = 0; i < dungeons.length; i++){
            if(check[i] == 0 && dungeons[i][0] <= k){
                check[i] = 1;
                DFS(k - dungeons[i][1], dungeons, count + 1);
                check[i] = 0;
            }
        }
    }
    
    public int solution(int k, int[][] dungeons) {
        check = new int[dungeons.length];
        DFS(k, dungeons, 0);
        return answer;
    }
}