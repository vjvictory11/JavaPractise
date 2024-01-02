package dsa.trie;

public class TrieImplementation {

    TrieNode root;

    public TrieImplementation() {
        root = new TrieNode();
    }

    // O(n)
    public void insert(String str) {
        var node = root;
        for (int i = 0; i < str.length(); i++) {
            int index = str.charAt(i) - 'a';
            if(node.children[index]==null) {
                node.children[index] = new TrieNode();
            }
            node = node.children[index];
        }

        node.isEndOfWord = true;
    }

    public boolean search(String str) { //  O(n)
        var node = root;

        for (int i = 0; i < str.length(); i++) {
            int index = str.charAt(i) - 'a';
            if(node.children[index]==null) {
                return false;
            }
            node = node.children[index];
        }

        return node.isEndOfWord;
    }

    public void delete(String str) { // O(n)
        var node = root;
        for (int i = 0; i < str.length(); i++) {
            int index = str.charAt(i)-'a';
            if(node.children[index]==null) {
                return;
            }
            node = node.children[index];
        }

        node.isEndOfWord = false;
    }
}
