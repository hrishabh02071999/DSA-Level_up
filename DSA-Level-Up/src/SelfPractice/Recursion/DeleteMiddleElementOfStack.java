/*
Delete middle element of stack
k = size/2 +1

Base-condition :- k smallest value 1
 */

package SelfPractice.Recursion;

import java.util.Stack;

public class DeleteMiddleElementOfStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        System.out.println(stack);
        deleteMiddleElement(stack);
        System.out.println(stack);
    }

    private static Stack<Integer> deleteMiddleElement(Stack<Integer> stack) {
        if(stack.size()==0){
            return stack;
        }
        int k = (stack.size()/2) +1;
        solve(stack,k);
        return stack;
    }

    private static void solve(Stack<Integer> stack, int k) {
        if(k==1){
            stack.pop();
            return;
        }
        int top = stack.pop();
        solve(stack,k-1);
        stack.push(top);
    }
}
