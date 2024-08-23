package dsa.maths;

public class gcd {
    public static void main(String[] args) {
        System.out.println(gcd(20, 10));
        System.out.println(gcd(24, 9));
        System.out.println(gcd(12, 13));
        System.out.println(gcd(9, 24));
    }

    /*
    TC = O(log(max(a,b))
     */
    static int gcd(int a, int b) {
        if(b==0) {
            return a;
        }
        return gcd(b, a%b);
    }
}
