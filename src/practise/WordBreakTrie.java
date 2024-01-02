package practise;

import dsa.trie.TrieImplementation;

public class WordBreakTrie {
    public static void main(String[] args) {
        String keys[] = {"cat", "mat", "ca", "ma",
                "at", "c", "dog", "og", "do" };

        var trie = new TrieImplementation();
        for (int i = 0; i < keys.length; i++) {
            trie.insert(keys[i]);
        }

//        System.out.println("abc".substring(1,3));

        System.out.println(minWordBreak("catma", trie));
    }

    static int minWordBreak(String str, TrieImplementation trie) {

        int n = str.length();
        int[] dp = new int[n+1];

        dp[0] = 1;

        for (int i = 1; i <=n  ; i++) {
            if(trie.search(str.substring(0,i))) {
                dp[i] =1;
            }else {
                for (int j = 1; j <= i; j++) {
                    String s = str.substring(j, i);
                    if (dp[j] == 1 && trie.search(s)) {
                        dp[i] = 1;
                    }
                }
            }
        }

        for (int i = 0; i < dp.length; i++) {
            System.out.print(dp[i]+" ");
        }
        System.out.println();

        return dp[n];
    }
}
