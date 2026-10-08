import java.util.*;

class Solution {
    
   
    
    public int solution(int[][] maps) {
        int answer = 0;
        
        int n = maps.length;
        int m = maps[0].length;
        
        if(maps[n - 1][m - 1] == 0 || maps[0][0] == 0)
            return -1;
        
        boolean[][] visited = new boolean[n][m];
        
        BFS(0, 0, maps, visited);
        
        
        return maps[n - 1][m - 1] == 1 ? -1 : maps[n - 1][m - 1];
    }
    
    public void BFS(int x, int y, int[][] maps, boolean[][] visited){
        int[] dx = {0, 0, 1, -1};
        int[] dy = {1, -1, 0, 0};
        
        Queue<int []> queue = new ArrayDeque<>();
        
        queue.offer(new int[] {x, y});
        
        int n = maps.length;
        int m = maps[0].length;
        
        visited[x][y] = true;
        
        while(!queue.isEmpty()){
            int[] num = queue.poll();
            int cx = num[0]; 
            int cy = num[1];
            
            for(int i = 0; i < 4; i++){
                int nx = dx[i] + cx;
                int ny = dy[i] + cy;
                
                if(nx >= 0 && nx < n && ny >= 0 && ny < m){
                    if(maps[nx][ny] == 1){
                        if(!visited[nx][ny]){
                            maps[nx][ny] = maps[cx][cy] + 1;
                            queue.offer(new int[] {nx, ny});
                            visited[nx][ny] = true;
                        }
                    }
                }
            }
        }
    }
}