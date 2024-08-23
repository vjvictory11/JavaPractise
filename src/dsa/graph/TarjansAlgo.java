package dsa.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TarjansAlgo {

    public static void main(String[] args) {
        int v = 6;
        int[][] edges = {
                {1,2},
                {1,0},
                {0,2},
                {0,4},
                {5,4},
                {5,3},
                {3,4}
        };

        /*  2        5
            | \     /|
            |  0 - 4 |
            | /     \|
            1        3

         */

        System.out.println(findBridges(edges, v, 7));
    }

    public static List<List<Integer>> findBridges(int[][] edges, int v, int e) {

        List<List<Integer>> adj = new ArrayList<>();

        List<List<Integer>> bridges = new ArrayList<>();

        for(int i=0;i<v;i++) {
            adj.add(new ArrayList<>());
        }

        for(int i=0;i<e;i++) {
            adj.get(edges[i][0]).add(edges[i][1]);
            adj.get(edges[i][1]).add(edges[i][0]);
        }

        int[] disc = new int[v];
        int[] low = new int[v];
        int[] parent = new int[v];
        Arrays.fill(disc, -1);
        Arrays.fill(low, -1);
        Arrays.fill(parent, -1);

        for(int i=0;i<v;i++) {
            if(disc[i]==-1) {
                dfs(i, disc, low, parent, adj, bridges, 0);
            }
        }

        return bridges;

    }

    static void dfs(int u, int[] disc, int[] low, int[] parent, List<List<Integer>> adj, List<List<Integer>> bridges, int timer) {

        disc[u] = low[u] = timer;
        timer++;
        for(int i=0;i<adj.get(u).size();i++) {
            int v = adj.get(u).get(i);

            if(disc[v]==-1) {
                parent[v] = u;
                dfs(v, disc, low, parent, adj, bridges, timer);
                low[u] = Math.min(low[u], low[v]);
                if(low[v]>disc[u]) {
                    bridges.add(new ArrayList<>(Arrays.asList(u,v)));
                }
            } else {
                if(v!=parent[u]) {
                    low[u] = Math.min(low[u], disc[v]);
                }
            }
        }

    }
}
