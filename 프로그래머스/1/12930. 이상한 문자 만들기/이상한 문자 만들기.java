class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] str = s.split(" ");
        
        int count = 0;
        
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ' '){
                answer += " ";
                count = 0;
            } else if(count % 2 == 0){
                answer += Character.toUpperCase(s.charAt(i));
                count++;
            } else{
                answer += Character.toLowerCase(s.charAt(i));
                count++;
            }
           
            
            // String str2 = "";
            // for(int j = 0; j < str[i].length(); j++){
            //     if(j % 2 == 0){
            //         str2 += Character.toUpperCase(str[i].charAt(j));
            //     } else{
            //         str2 += Character.toLowerCase(str[i].charAt(j));
            //     }
            // }
            // answer += str2;
            // if(i != str.length - 1){
            //     answer += " ";
            // }
        }
        return answer;
    }
}