class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        
        while(n >= a){
            int count = n / a;
            int namerge = n % a;
            
           
            answer += count * b;
            n = count * b + namerge;
            
            
            // System.out.println("n = " + n + ", namerge = " + namerge + ", answer = " + answer);
        }
        return answer;
    }
}