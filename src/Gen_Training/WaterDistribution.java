package meetprograms;
import java.util.ArrayDeque;
import java.util.Queue;

public class WaterDistribution {
    
    public static int timeToDistributeWater(int[][] map) {
        int m = map.length;
        int n = map[0].length;
        
        Queue<int[]> queue = new ArrayDeque<>();
        int countReady = 0;
        
        // Initialize the queue with initial sources (value 2)
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (map[i][j] == 2) {
                    queue.offer(new int[]{i, j, 0});
                } else if (map[i][j] == 1) {
                    countReady++;
                }
            }
        }
        
        int timeTaken = 0;
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        
        // Perform BFS
        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int x = curr[0];
            int y = curr[1];
            int time = curr[2];
            
            timeTaken = Math.max(timeTaken, time);
            
            for (int[] dir : directions) {
                int newX = x + dir[0];
                int newY = y + dir[1];
                
                if (newX >= 0 && newX < m && newY >= 0 && newY < n && map[newX][newY] == 1) {
                    map[newX][newY] = 2;
                    queue.offer(new int[]{newX, newY, time + 1});
                    countReady--;
                }
            }
        }
        
        return countReady == 0 ? timeTaken : -1;
    }

    public static void main(String[] args) {
        int[][] map1 = {{2, 1, 1}, {1, 1, 0}, {1, 1, 1}};

        int time1 = timeToDistributeWater(map1);

        System.out.println("Output for map1: " + (time1 != -1 ? time1 : "Some containment left out empty"));
    }
}
