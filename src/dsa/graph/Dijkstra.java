package dsa.graph;

import java.util.*;

public class Dijkstra {

    public static void main(String[] args) {
        int[][] edges = {
                {0, 1, 7},
                {0, 2, 1},
                {0, 3, 2},
                {1, 2, 3},
                {1, 3, 5},
                {1, 4, 1},
                {3, 4, 7}
        };

        System.out.println(dijkstra(edges,5,7,0));
    }

    public static List<Integer> dijkstra(int[][] edges, int n, int m, int source){
        // Write your code here.
        List<Map<Integer, Integer>> adj = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            adj.add(new HashMap<Integer, Integer>());
        }

        for (int i = 0; i < m; i++) {
            int src = edges[i][0];
            int dest = edges[i][1];
            int weight = edges[i][2];

            adj.get(src).put(dest, weight);
            adj.get(dest).put(src, weight); // do this incase of undirected graph.
        }

        // int[] dist = new int[n];
        List<Integer> dist = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            dist.add(Integer.MAX_VALUE);
        }

        dist.set(source, 0);

        Queue<Integer> queue = new LinkedList<>();

        queue.add(source);

        while(!queue.isEmpty()) {
            int src = queue.poll();

            Map<Integer, Integer> map = adj.get(src);

            for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
                int dest = entry.getKey();
                int weight = entry.getValue();

                if(dist.get(src) + weight < dist.get(dest)) {
                    dist.set(dest, dist.get(src) + weight);
                    queue.add(dest);
                }


            }
        }

        return dist;
    }
}
