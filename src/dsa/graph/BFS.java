package dsa.graph;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {

    public static void main(String[] args) {
        int[][] roads = {
                {1, 0, 1, 1, 1},
                {0, 1, 0, 1, 0},
                {0, 0, 1, 0, 0},
                {0, 1, 0, 1, 0},
                {1, 1, 1, 0, 1}
        };
        int n = 5;
        int count = 0;
        int visited[] = new int[n];
        for(int i=0;i<n;i++) {
            if(visited[i]==0) {
                count++;
                bfs(i, roads, visited, n);
            }
        }

        System.out.println(count);
    }


    static void bfs(int index, int[][] roads, int[] visited, int n) {

        Queue<Integer> queue = new LinkedList<>();

        queue.add(index);
        visited[index]=1;
        while(!queue.isEmpty()) {
            int curr = queue.poll();

            for(int i=0;i<n;i++) {
                if(roads[curr][i]==1 && visited[i]==0) {
                    System.out.println(curr+" -> "+i);
                    visited[i] = 1;
                    queue.add(i);
                }
            }
        }


    }
}
