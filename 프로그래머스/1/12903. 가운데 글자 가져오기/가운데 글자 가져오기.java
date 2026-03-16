class Solution {
    public String solution(String s) {
        String answer = "";
        
        int len = 0;
        boolean flag = false;
        
        if(s.length() % 2 == 1){
            answer += s.charAt(s.length() / 2);
        } else{
            answer += s.charAt((s.length() / 2) - 1);
            answer += s.charAt((s.length() / 2));
        }
        
        return answer;
    }
}