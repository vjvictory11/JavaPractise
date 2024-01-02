package dsa.trie;

public class Trie {
    public static void main(String[] args) {
        var trie = new TrieImplementation();

        trie.insert("abc");
        trie.insert("abcd");
        trie.insert("abce");

        trie.delete("abc");
        System.out.println(trie.search("abc"));


    }
}
