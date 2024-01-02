package dsa.string;

public class Kmp {
    public static void main(String[] args) {
        char[] input  = { 'a','b','x','a','b','c','a','b','c','a','b','y'};
        char[] pattern = {'a','b','c','a','b','y'};
        System.out.println(match(pattern, input));
    }

    static boolean match(char[] pattern, char[] input) {
        int m = pattern.length;
        int[] dp = new int[m];
        int j = 0;
        for (int i = 1; i < m; i++) {
            if(pattern[i]==pattern[j]) {
                dp[i] = j+1;
                j++;
            } else {
                while(j>0 && pattern[j]!=pattern[i]) {
                    j = dp[j];
                }
                if(pattern[i]==pattern[j]) {
                    dp[i] = j+1;
                } else {
                    j=0;
                }
            }
        }

        int i = 0;
        int n = input.length;
        int k = 0;
        while(i<n && k<m) {
            System.out.println("Comparing "+pattern[k]+" with "+input[i]);
            if(pattern[k]==input[i]) {
                i++;
                k++;
                if(k==m) return true;
            }else {
                if(k==0) {
                    i++;
                } else {
                    k = dp[k - 1];
                }
            }
        }
        return k == m;
    }
}
