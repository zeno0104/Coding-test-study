import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        
        double[] failRate = new double[N + 1];
        int rateNum = stages.length;
        
        for(int i = 1; i <= N; i++){
            int count = 0;
            for(int j = 0; j < stages.length; j++){
                if(i == stages[j]){
                    count++;
                }
            }
            if(rateNum == 0)
                failRate[i] = 0;
            else
                failRate[i] = (double)count / rateNum;
            rateNum -= count;
        }
        
        Integer[] idx = new Integer[N];
        
        for(int i = 0; i < N; i++)
            idx[i] = i + 1;
        
        Arrays.sort(idx, (a, b)->{
            if(failRate[a] == failRate[b])
                return a - b;
            return Double.compare(failRate[b], failRate[a]);
        });
        
        for(int i = 0; i < answer.length; i++){
            answer[i] = idx[i];
        }
        return answer;
    }
}