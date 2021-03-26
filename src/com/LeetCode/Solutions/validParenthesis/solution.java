package com.LeetCode.Solutions.validParenthesis;

import java.util.ArrayList;

public class solution {

    public static void main(String[] args) {
        String s = new String("){");
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        if (s.length() < 2) {
            return false;
        } else {
            boolean result = true;
            ArrayList<Character> stack = new ArrayList<>();
            char[] parenthesis = new char[]{'(', ')', '{', '}', '[', ']'};
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c == '(' || c == '{' || c == '[') {
                    stack.add(c);
                } else if (c == ')' || c == '}' || c == ']') {
                    if (stack.size() == 0) {
                        result = false;
                        break;
                    } else {
                        char lastParenthesis_added = stack.get(stack.size() - 1);
                        switch (c) {
                            case ')':
                                if (lastParenthesis_added == '(') {
                                    stack.remove(stack.size() - 1);
                                    break;
                                } else {
                                    result = false;
                                    break;
                                }

                            case '}':
                                if (lastParenthesis_added == '{') {
                                    stack.remove(stack.size() - 1);
                                    break;
                                } else {
                                    result = false;
                                    break;
                                }

                            case ']':
                                if (lastParenthesis_added == '[') {
                                    stack.remove(stack.size() - 1);
                                    break;
                                } else {
                                    result = false;
                                    break;
                                }

                            default:

                        }
                    }

                }
            }
            if (stack.size() != 0 && result == true) {
                return false;
            } else {
                return result;
            }
        }
    }

}
