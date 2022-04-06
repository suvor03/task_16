package ru.vsu.cs.suvorov_d_a;

import java.util.Stack;

public class ReverseStack {
    public static String reverseStringStandardStack(String str) {
        Stack<Character> stack = new Stack<>();
        StringBuilder result = new StringBuilder();
        for (Character character : str.toCharArray()) {
            stack.add(character);
        }
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return result.toString();
    }

    public static String reverseStringMySimpleStack(String str) {
        SimpleStack<Character> mySimpleStack = new SimpleStack<>();
        StringBuilder result = new StringBuilder();
        for (Character character : str.toCharArray()) {
            mySimpleStack.push(character);
        }
        while (!mySimpleStack.isEmpty()) {
            result.append(mySimpleStack.pop());
        }

        return result.toString();
    }
}
