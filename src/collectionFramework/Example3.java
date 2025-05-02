package collectionFramework;

import java.util.Stack;

public class Example3 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        boolean isEmpty = stack.isEmpty();
        System.out.println("Is empty : " + isEmpty);

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println(stack);

        Integer removedData = stack.pop();
        System.out.println("Removed data from the stack : " + removedData);
        System.out.println(stack);

        int peekData = stack.peek();
        System.out.println("Peek data : " + peekData);



    }
}
