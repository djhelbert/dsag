package org.dsag.recursion;

public class Power {
    public static int power(int x, int n) {
        if(n == 0) {
            return 1;
        } else if(n == 1) {
            return x;
        } else {
            return x * power(x, n-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(Power.power(2, 0));
        System.out.println(Power.power(2, 1));
        System.out.println(Power.power(2, 2));
        System.out.println(Power.power(2, 3));
    }
}
