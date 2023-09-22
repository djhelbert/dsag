package org.dsag.recursion;

public class Palindrome {
    public static boolean pal(String s)
    {
        if(s.length() == 0 || s.length() == 1) {
            return true;
        }
        if(s.charAt(0) == s.charAt(s.length() - 1)){
            return pal(s.substring(1, s.length() - 1));
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(Palindrome.pal("cat"));
        System.out.println(Palindrome.pal("tacocat"));
        System.out.println(Palindrome.pal("taco"));
        System.out.println(Palindrome.pal("poop"));
    }
}
