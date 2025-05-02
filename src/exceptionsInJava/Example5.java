package exceptionsInJava;

import exceptionsInJava.exceptions.StackOverFlowException;
import exceptionsInJava.exceptions.StackUnderflowException;

class Stack<T>{
    private T[] elements;
    int index;

    public Stack(){
    }
    public void init(){
        index = 0;
    }
    public  void push (T t) throws StackOverFlowException {
        if (elements.length-1 < index){
            throw new StackOverFlowException("Stack is full");
        }
        elements[index++] = t;
    }

    public T pop() throws StackUnderflowException{
        if (index < 0){
           throw new StackUnderflowException("Stack is empty");
        }
        T element = elements[index--];
        return element;
    }

    public T peek(){
        return  elements[index];
    }
}
public class Example5 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        try {
            stack.push(0);
            stack.push(1);
            stack.push(2);

            stack.pop();

        }catch (StackOverFlowException e){
            System.out.println(e.getMessage());
        }catch (StackUnderflowException e){
            System.out.println(e.getMessage());
        }
    }
}
