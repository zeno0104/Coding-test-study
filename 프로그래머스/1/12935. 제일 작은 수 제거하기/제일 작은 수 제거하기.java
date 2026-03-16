import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        
        int minVal = Arrays.stream(arr).min().getAsInt(); // 최솟값 찾기
        
        List<Integer> list = new ArrayList<>();
        
        boolean removed = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == minVal && !removed) {
                removed = true; // 최솟값 딱 한 번만 제거
                continue;
            }
            list.add(arr[i]);
        }
        
        if (list.size() == 0) {
            return new int[]{-1};
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}