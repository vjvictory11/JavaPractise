package dsa.string;

public class Kmp {
    public static void main(String[] args) {
        char[] input  = { 'a','b','x','a','b','c','a','b','c','a','b','y'};
        char[] pattern = {'a','b','c','a','b','y'};
        System.out.println(match(pattern, input));
    }

    static boolean match(char[] pattern, char[] input) {
        int m = pattern.length;
        // lps[i] tells you that till i what is the longest prefix which is also a suffix
        int[] lps = new int[m];
        int j = 0;
        for (int i = 1; i < m; i++) {
            if(pattern[i]==pattern[j]) {
                lps[i] = j+1;
                j++;
            } else {
                while(j>0 && pattern[j]!=pattern[i]) {
                    j = lps[j];
                }
                if(pattern[i]==pattern[j]) {
                    lps[i] = j+1;
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
                    k = lps[k - 1];
                }
            }
        }
        return k == m;
    }
}
