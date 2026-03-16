class Solution {
    public String solution(String s) {
        String answer = "";
        boolean isFirst = true;

        for(char ch : s.toCharArray()){
            if(ch == ' '){
                answer += ' ';
                isFirst = true;
            } else if(isFirst){
                answer += Character.toUpperCase(ch);
                isFirst = false;
            } else{
                answer += Character.toLowerCase(ch);
            }
        }
        
        return answer;
    }
}