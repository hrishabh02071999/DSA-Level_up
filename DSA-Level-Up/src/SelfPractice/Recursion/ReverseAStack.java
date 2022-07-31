
/*
Reverse a stack
O(1) space complexity
 */
package SelfPractice.Recursion;

import java.util.Stack;

public class ReverseAStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        System.out.println(stack);
        reverse(stack);
        System.out.println(stack);
    }

    private static void reverse(Stack<Integer> stack) {
        if(stack.size()==0){
            return;
        }
        if(stack.size()==1){
            return;
        }
        int temp=stack.pop();
        reverse(stack);
        pushElement(stack,temp);
        return;
    }

    private static void pushElement(Stack<Integer> stack, int temp) {
        if(stack.size()==0){
            stack.push(temp);
            return;
        }
        int val = stack.pop();
        pushElement(stack,temp);
        stack.push(val);
        return;
    }
}
