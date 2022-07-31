package SelfPractice.Recursion;

import java.util.Stack;

public class SortAStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(3);
        stack.push(5);
        stack.push(2);
        stack.push(4);
        System.out.println(sortAStack(stack));
    }

    private static Stack<Integer> sortAStack(Stack<Integer> stack) {
        if(stack.size()==1){
            return stack;
        }
        int temp = stack.pop();
        sortAStack(stack);
        insert(stack,temp);
        return stack;
    }

    private static void insert(Stack<Integer> stack, int temp) {
        if(stack.size()==0 || stack.peek()<=temp){
            stack.push(temp);
            return;
        }
        int val = stack.pop();
        insert(stack,temp);
        stack.push(val);
    }
}
