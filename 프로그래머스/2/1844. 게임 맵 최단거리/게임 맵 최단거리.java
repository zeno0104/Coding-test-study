import java.util.*;

class Solution {
    
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};
    static int[][] dis;
    static int n, m;
    
    static class Point {
        int x;
        int y;
        
        Point(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    public static void BFS(int x, int y, int[][] maps){
        Queue<Point> Q = new LinkedList<Point>();

		Q.offer(new Point(x, y));
		maps[x][y] = 0;
        
		while (!Q.isEmpty()) {
			Point curr = Q.poll();
			if (curr.x == n - 1 && curr.y == m - 1)
				break;
			for (int i = 0; i < 4; i++) {
				int nx = curr.x + dx[i];
				int ny = curr.y + dy[i];

				if (nx >= 0 && nx < n && ny >= 0 && ny < m && maps[nx][ny] == 1) {
					dis[nx][ny] = dis[curr.x][curr.y] + 1;
					Q.offer(new Point(nx, ny));
					maps[nx][ny] = 0;
				}
			}
		}
        
    }
    public int solution(int[][] maps) {
        int answer = 0;
        
        n = maps.length; 
        m = maps[0].length;
		
        dis = new int[n][m];
		BFS(0, 0, maps);

		// for (int i = 0; i < n; i++) {
		// 	for (int j = 0; j < m; j++) {
		// 		System.out.print(dis[i][j] + " ");
		// 	}
		// 	System.out.println();
		// }
        if(dis[n - 1][m - 1] == 0)
            return -1;
        return dis[n - 1][m - 1] + 1;
    }
}