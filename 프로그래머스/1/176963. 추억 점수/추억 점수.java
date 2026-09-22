import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        
            for(int j = 0; j < photo.length; j++){
                String[] arr = photo[j];
                Map<String, String> map = new HashMap();
                
                for(int k = 0; k < arr.length; k++){
                    map.put(arr[k], arr[k]);
                }
                int sum = 0;
                for(int h = 0; h < name.length; h++){
                    if(map.containsKey(name[h])){
                        sum += yearning[h];
                    }
                }
                list.add(sum);
            }
        System.out.println(list);
        
        answer = new int[list.size()];
        
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}