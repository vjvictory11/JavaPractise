package practise;

import javax.swing.tree.TreeNode;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Node root = new Node(1000000000);
        root.left = new Node(1000000000);
        Node node = root.left;
        node.left = new Node(294967296);
        node = node.left;
        node.left = new Node(1000000000);
        node = node.left;
        node.left = new Node(1000000000);
        node = node.left;
        node.left = new Node(1000000000);

//        System.out.println(pathSum(root, 0));
        List<String> res = new ArrayList<>();
        validParenthesis("", 0, 0 , 3, res);
        System.out.println(res);
    }

    static class Node {
        int data;
        Node left;
        Node right;
        Node(int d) {
            this.data = d;
            this.left = null;
            this.right = null;
        }
    }

    public static void validParenthesis(String str, int open, int close, int n, List<String> res) {
        if(close==n) {
            res.add(str);
        }
        if(open<n) {
            validParenthesis(str+"(", open+1, close, n, res);
        }
        if(close<open) {
            validParenthesis(str+")", open, close+1, n, res);
        }
    }
}
