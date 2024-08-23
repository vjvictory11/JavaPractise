package dsa.maths;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PrimeFactors {
    public static void main(String[] args) {
        System.out.println(getPrimeFactors(24));
        System.out.println(getPrimeFactors(20));
        System.out.println(getPrimeFactors(23));
    }

    /*
    TC = O(sqrt(n))
     */
    static List<Integer> getPrimeFactors(int n) {
        List<Integer> list = new ArrayList<>();
        if(n%2==0) {
            list.add(2);
            while(n%2==0) {
                n/=2;
            }
        }
        for(int i=3;i<Math.sqrt(n);i+=2) {
            if(n%i==0) {
                list.add(i);
                while(n%i==0) {
                    n/=i;
                }
            }
        }
        if(n>1) {
            list.add(n);
        }

        return list;
    }
}
