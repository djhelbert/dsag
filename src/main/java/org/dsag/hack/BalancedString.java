package org.dsag.hack;

import java.util.Stack;

/**
 * Balance characters ()[]{}
 */
public class BalancedString {

    public static boolean isBalanced(String data) {
        char[] chars = data.toCharArray();
        Stack<Character> s = new Stack<>();

        for(char c : chars) {
            if(c == '(' || c == '{' || c == '[') {
                s.push(c);
            } else {
                Character temp = s.pop();
                if(temp != '(' && c == ')') {
                    return false;
                }
                if(temp != '[' && c == ']') {
                    return false;
                }
                if(temp != '{' && c == '}') {
                    return false;
                }
            }
        }

        if(s.size() > 0) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(BalancedString.isBalanced("()"));       // true
        System.out.println(BalancedString.isBalanced("()[]()"));   // true
        System.out.println(BalancedString.isBalanced("(()[]())")); // true
        System.out.println(BalancedString.isBalanced("((("));      // false
        System.out.println(BalancedString.isBalanced("((())"));    // false
    }
}