package org.dsag.recursion;

public class ReverseString {
    public static String reverse(String value) {
        if(value == null) {
            return null;
        }
        else if(value.isEmpty()) {
            return "";
        } else if(value.length() == 1) {
            return value;
        } else {
            return value.charAt(value.length() - 1) + reverse(value.substring(0, value.length() - 1));
        }
    }

    public static void main(String[] args) {
        System.out.println(ReverseString.reverse("pretty"));
    }
}
