public class Solution {
    public int shortestDistance(int[][] maze, int[] start, int[] dest) {
      
      // note: we use int[2] to stand for (x,y), i.e., (int[0], int[1])

      // "new" int[][] to store the distance so far (with the same size as the maze)
      int[][] distance = new int[maze.length][maze[0].length];
      // note: need to set the distance as "Integer.MAX_VALUE" (be careful)
      for (int[] row: distance)
        Arrays.fill(row, Integer.MAX_VALUE);
      
      // initial setting: the start point
      distance[start[0]][start[1]] = 0;
      
      // the four directions
      int[][] dirs={{0, 1} ,{0, -1}, {-1, 0}, {1, 0}};
        
      // new the queue to process the points, so Queue < int[] > 
      Queue < int[] > queue = new LinkedList < > ();
      
      // put the start point into the queue
      queue.add(start);
      
      // process the points (using BFS)
        while (!queue.isEmpty()) {
          
          // pop the point from queue
            int[] s = queue.remove();
          
          // for four directions
            for (int[] dir: dirs) {
              // let (x, y) be the next point
              int x = s[0] + dir[0];
              int y = s[1] + dir[1];
              // using count to store the "distance"
              int count = 0;
              
              // check if the next point is valid or not
              // note: using while loop, so it can keep rolling
              while (x >= 0 && y >= 0 && x < maze.length && y < maze[0].length && maze[x][y] == 0) {
                x += dir[0];
                y += dir[1];
                // the "distance"
                count++;
              }
              
              // note: after while loop, the stop point is "{x - dir[0], y - dir[1]}"
              // check if the distance is smaller (important)
              // be careful about the stop point
              if (distance[s[0]][s[1]] + count < distance[x - dir[0]][y - dir[1]]) {
                // if it is smaller, then update it
                distance[x - dir[0]][y - dir[1]] = distance[s[0]][s[1]] + count;
                // add the "stop point" into the queue
                queue.add(new int[] {x - dir[0], y - dir[1]});
              }
            }
        }
      
      // if distance[dest[0]][dest[1]] == Integer.MAX_VALUE, then return "-1"
      // otherwise, return "distance[dest[0]][dest[1]]"
      return distance[dest[0]][dest[1]] == Integer.MAX_VALUE ? -1 : distance[dest[0]][dest[1]];
    }
}
