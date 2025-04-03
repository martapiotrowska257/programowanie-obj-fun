package main;

import java.util.Stack;
import java.util.EmptyStackException;

public class StackMethods {
    private final Stack<String> stack;

    public StackMethods() {
        this.stack = new Stack<>();
    }

    public void pushString(String value) {
        stack.push(value);
    }

    public String popString() {
        if (stack.isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.pop();
    }

    public String peekString() {
        if (stack.isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.peek();
    }

    public int getSize() {
        return stack.size();
    }
}
