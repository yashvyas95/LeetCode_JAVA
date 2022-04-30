package com.LeetCode.Solutions.checkBalancedString;

import java.util.Stack;

public class solution {

    public static String isBalanced(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '{' || c == '(' || c == '[') {
                stack.push(c);
            } else if (c == '}' || c == ')' || c == ']') {
                if (stack.empty()) {
                    return "NO";
                } else {
                    char from_Stack = stack.pop();
                    switch (c) {
                        case '}':
                            if (from_Stack != '{')
                                return "NO";
                            break;
                        case ')':
                            if (from_Stack != '(')
                                return "NO";
                            break;
                        case ']':
                            if (from_Stack != '[')
                                return "NO";
                            break;
                    }
                }
            }
        }
        if (stack.empty()) {
            return "YES";
        }
        return "NO";
    }

}
