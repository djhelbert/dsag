package org.dsag.recursion;

public class Factorial {
    public static int fact(int n) {
        if(n == 1) {
            return 1;
        } else {
            return n * fact(n - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(Factorial.fact(1));
        System.out.println(Factorial.fact(2));
        System.out.println(Factorial.fact(3));
        System.out.println(Factorial.fact(4));
        System.out.println(Factorial.fact(5));
        System.out.println(Factorial.fact(6));
        System.out.println(Factorial.fact(7));
    }
}
