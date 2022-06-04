package com.algorithms.stack;

import java.util.Arrays;
import java.util.Stack;

public class MainStackStarter {

    public static void main(String[] args) {
        System.out.println(check("{}[][[]]()"));
        System.out.println(check("{][][[]]()"));
        System.out.println(check("{}[][(]]()"));
        System.out.println(check("{}[][[]]("));
        System.out.println(check("{}[][]]()"));
        System.out.println(check("{}[][]()()()()()()[{{}}]"));
    }

    private static boolean check(String str) {
        String[] split = str.split("");
        System.out.println(Arrays.toString(split));

        Stack<String> stack = new Stack<>();

        for (String s : split) {
            if (stack.isEmpty() || (s.equals("{") || s.equals("[") || s.equals("("))) {
                stack.push(s);
            } else {
                String fromStack = stack.pop();
                if (fromStack.equals("{") && s.equals("}") ||
                        fromStack.equals("[") && s.equals("]") ||
                        fromStack.equals("(") && s.equals(")")) {
                    continue;
                } else {
                    return false;
                }
            }
        }

        if (stack.isEmpty()) {
            return true;
        }

        return false;
    }
}
