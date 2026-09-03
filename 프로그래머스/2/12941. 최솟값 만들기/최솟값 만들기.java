import java.util.*;

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        
        
        Integer[] newA = new Integer[A.length];
        Integer[] newB = new Integer[B.length];
        
        for(int i = 0 ; i < A.length; i++){
            newA[i] = A[i];
            newB[i] = B[i];
        }
        
        
        
        Arrays.sort(newA);
        Arrays.sort(newB, Collections.reverseOrder());
        
        for(int i = 0; i < newA.length; i++){
            System.out.println("newA : " + newA[i] + ", newB : " + newB[i]);
            answer += newA[i] * newB[i];
        }
        

        return answer;
    }
}