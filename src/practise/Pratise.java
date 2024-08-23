package practise;

import dsa.binaryTrees.Node;
import lombok.ToString;

import javax.xml.parsers.DocumentBuilder;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

public class Pratise {
    public static void main(String[] args) {

//        System.out.println((int)Math.ceil(3/(2*1.0)));
//        System.out.println((double)(-1-2)/2.0);
//        System.out.println(-5/2);
        System.out.println(Runtime.getRuntime().totalMemory()/1000000);
        System.out.println(Runtime.getRuntime().maxMemory()/1000000);
        System.out.println(Runtime.getRuntime().freeMemory()/1000000);
        Thread d = new Thread();

        Runnable r = () -> {
            System.out.println("ahell");
        };

        ExecutorService executor = Executors.newFixedThreadPool(1);
        executor.submit(r);


        int[][] roads = {
                {1, 0, 1, 1},
                {0, 1, 1, 1},
                {0, 1, 0, 1},
                {1, 1, 1, 1},
                {0, 0, 0, 1}
        };
        int n = 5;
        int[][] edges = {
                {0, 1, 4},
                {0, 2, 1},
                {0, 3, 2},
                {1, 2, 3},
                {1, 3, 5},
                {1, 4, 1},
                {3, 4, 6}
        };

        int v = 4;
//        for (int diff = 1; diff <n; diff++) {
//            int i = 0;
//            for (int j = i + diff; j <= n; j++) {
//                System.out.println((i++)+" , "+j);
//            }
//        }

        String s = "abc";
        StringBuilder builder = new StringBuilder();
        builder.reverse();

        int[] arr1 = {1, 3};
        int[] arr2 = {2};

        int[][] area = {
                {0, 0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0},
                {0, 1, 0, 0, 0, 0, 0, 1, 1, 1, 1, 0},
                {1, 0, 0, 1, 1, 1, 1, 0, 1, 0, 1, 1},
                {0, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1},
                {1, 0, 1, 0, 0, 1, 0, 0, 1, 0, 1, 1}
        };

        int[][] arr = {
                {1, 16, 45, 46, 46},
                {4, 27, 29, 30, 50},
                {5, 7, 8, 37, 47},
                {11, 18, 34, 38, 44},
                {14, 25, 27, 28, 46},
                {7, 14, 15, 18, 19},
                {3, 29, 32, 35, 46}
        };

//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[0].length; j++) {
//                System.out.print((i+1)*(j+1)+"\t");
//            }
//            System.out.println();
//        }

//        System.out.println(getKthMissing(new int[]{1,2,4}, 1));
//        System.out.println(getKthMissing(new int[]{1,2,4}, 2));
//        System.out.println(getKthMissing(new int[]{1,2,4,11}, 5));
//        System.out.println(getKthMissing(new int[]{1,2,3,4}, 2));
//        int[]  input = new int[]{1, 3, -1, -3, 5, 3, 6, 7};
        int[] input = new int[]{1, 3, 1, 2, 0, 5};
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.left = new Node(7);
        root.left.right.right = new Node(8);
        root.right = new Node(3);
        root.right.right = new Node(6);
        root.right.right.right = new Node(9);
        root.right.right.right.right = new Node(10);

//        System.out.println(minTime(root, 8));

    }

    static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }

    public static int minTime(Node root, int target)
    {
        Map<Node, Node> nodeToParent = new HashMap<>();

        storeNode(root, null, nodeToParent);

        Node targetNode = getNode(root, target);

        // return nodeToParent.get(targetNode).data;

        return getMinTime(targetNode, nodeToParent, null)-1;
    }

    static Node getNode(Node node, int target) {
        if(node==null || node.data==target) return node;

        Node left = getNode(node.left, target);
        Node right = getNode(node.right, target);

        if(left!=null) return left;
        return right;
    }

    static int getMinTime(Node node, Map<Node, Node> nodeToParent, Node prev) {
        if(node==null || node==prev) return 0;

        System.out.println("checking for "+node.data);
        int left = node.left!=prev ? getMinTime(node.left, nodeToParent, node):0;
        int right = node.right!=prev?getMinTime(node.right, nodeToParent, node):0;

        int parent = nodeToParent.get(node)!=prev?getMinTime(nodeToParent.get(node), nodeToParent, node):0;

        return 1+Math.max(left, Math.max(right, parent));
    }

    static void storeNode(Node node, Node parent,
                          Map<Node, Node> map) {
        map.put(node, parent);

        if(node.left!=null) {
            storeNode(node.left, node, map);
        }

        if(node.right!=null) {
            storeNode(node.right, node, map);
        }
    }


}

